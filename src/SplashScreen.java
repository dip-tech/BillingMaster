
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.System.exit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SplashScreen extends javax.swing.JWindow {

    Toolkit nToolkit = Toolkit.getDefaultToolkit();
    Image nIcon;
    int nLocationX, nLocationY;
    JPanel nPanel=new JPanel();
    public SplashScreen() {
        nIcon = nToolkit.getImage(getClass().getResource("icon/splash.png"));
        setSize(1000, 500);
        nLocationX = (nToolkit.getScreenSize().width - getSize().width) / 2;
        nLocationY = (nToolkit.getScreenSize().height - getSize().height) / 2;
        setLocation(nLocationX, nLocationY);
        nPanel.setSize(999,499);
        nPanel.setBackground(new Color(51,51,51));
        this.add(nPanel);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(nIcon, 100, 100, this);
        JLabel nText = new JLabel("BILLING MASTER");
        nText.setBounds(400, 130, 600, 200);
        nText.setFont(new Font("Arial", Font.BOLD, 38));
        nText.setForeground(new Color(102,153,255));
        nPanel.add(nText);
    }

    public static void main(String args[]) {
        SplashScreen nSplash = new SplashScreen();
        try {
            Thread.sleep(5000);
            nSplash.dispose();
            new LoginWindow().setVisible(true);
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x);
            exit(0);
        }
    }
}
