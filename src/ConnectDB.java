import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectDB {
    static Connection con=null;
    public static Connection Connect()
        {
            String url="jdbc:sqlite:AppData.db";
            try
            {
                DriverManager.registerDriver(new org.sqlite.JDBC());
                //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                con=DriverManager.getConnection(url);
                
            }
            catch(Exception er)
            {
                JOptionPane.showMessageDialog(null, er);
            }
            return con;
        }
    
}
