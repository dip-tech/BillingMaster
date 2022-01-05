
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RagistrationWindow extends javax.swing.JFrame {

    Connection nConn = null;
    PreparedStatement nPs = null;
    ResultSet nRe = null;
    String nEmployeeId = "";
    int Eid = 0;

    public RagistrationWindow() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        Toolkit nToolKit=Toolkit.getDefaultToolkit();
        setIconImage(nToolKit.getImage(getClass().getResource("icon/icon.png")));
        initComponents();
        nEmployeeId = getEmployeeID();
        nEmployeeidtextfield.setText(nEmployeeId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nEmployeeidtextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nEmployeeNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nEmployeeAddressTextField = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        nEmployeeMobileTextField = new javax.swing.JTextField();
        nInputPasswordField = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        nCInputPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLING MASTER");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMPLOYEE REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 910, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 60, 70, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("EMPLOYEE REGISTRATION");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 120, 210, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 400, 160, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("EMPLOYEE ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 180, 160, 17);

        nEmployeeidtextfield.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jPanel1.add(nEmployeeidtextfield);
        nEmployeeidtextfield.setBounds(60, 210, 380, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("EMPLOYEE NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 180, 160, 17);

        nEmployeeNameTextField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nEmployeeNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nEmployeeNameTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nEmployeeNameTextField);
        nEmployeeNameTextField.setBounds(470, 210, 380, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("EMPLOYEE MOBILE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 260, 160, 17);

        nEmployeeAddressTextField.setColumns(20);
        nEmployeeAddressTextField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nEmployeeAddressTextField.setRows(5);
        jScrollPane1.setViewportView(nEmployeeAddressTextField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(470, 290, 380, 80);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("EMPLOYEE ADDRESS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 260, 160, 17);

        nEmployeeMobileTextField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nEmployeeMobileTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nEmployeeMobileTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nEmployeeMobileTextField);
        nEmployeeMobileTextField.setBounds(60, 290, 380, 30);

        nInputPasswordField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jPanel1.add(nInputPasswordField);
        nInputPasswordField.setBounds(60, 430, 380, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("CONFRIM PASSWORD");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(470, 400, 160, 17);

        nCInputPasswordField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jPanel1.add(nCInputPasswordField);
        nCInputPasswordField.setBounds(470, 430, 380, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("REGISTER");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(710, 510, 140, 40);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("CANCEL");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 510, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nSQLQUERY = "insert into login_info values(?,?,?,?,?)";
        if (nEmployeeidtextfield.getText().isEmpty() || nEmployeeNameTextField.getText().isEmpty() || nEmployeeMobileTextField.getText().isEmpty() || nEmployeeAddressTextField.getText().isEmpty() || nInputPasswordField.getPassword().length == 0 || nCInputPasswordField.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Fill All the Details.");
        } else {

            if (nInputPasswordField.getText().equals(nCInputPasswordField.getText())) {
                try {
                    nConn = ConnectDB.Connect();
                    nPs = nConn.prepareStatement(nSQLQUERY);
                    nPs.setString(1, nEmployeeidtextfield.getText().toUpperCase());
                    nPs.setString(2, nEmployeeNameTextField.getText().toUpperCase());
                    nPs.setString(3, nEmployeeMobileTextField.getText().toUpperCase());
                    nPs.setString(4, nEmployeeAddressTextField.getText().toUpperCase());
                    nPs.setString(5, nInputPasswordField.getText());
                    nPs.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Succesfully Registered.\nLogin to Continue.");
                    new LoginWindow().setVisible(true);
                    this.dispose();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, x);
                } finally {
                    try {
                        nConn.close();
                        nPs.close();
                        nRe.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password not Matched.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nEmployeeNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nEmployeeNameTextFieldKeyTyped
        char nKey = evt.getKeyChar();
        if (Character.isAlphabetic(nKey) == false && nKey != KeyEvent.VK_SPACE && Character.isDigit(nKey)==false) {
            evt.consume();
        }
    }//GEN-LAST:event_nEmployeeNameTextFieldKeyTyped

    private void nEmployeeMobileTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nEmployeeMobileTextFieldKeyTyped
        // TODO add your handling code here:
        char nKeyType = evt.getKeyChar();
        if (Character.isDigit(nKeyType) == false || nEmployeeMobileTextField.getText().length()>10) {
            evt.consume();
        }
    }//GEN-LAST:event_nEmployeeMobileTextFieldKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginWindow().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public String getEmployeeID() {
        DecimalFormat nDF = new DecimalFormat("E#");
        String nID = "";
        String nSQL = "select count(*) from login_info";
        try {
            nConn = ConnectDB.Connect();
            nPs = nConn.prepareStatement(nSQL);
            nRe = nPs.executeQuery();
            nRe.next();
            Eid = nRe.getInt(1) + 1;
            nID = nDF.format(Eid);
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x);
        } finally {
            try {
                nConn.close();
                nPs.close();
                nRe.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return nID;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RagistrationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField nCInputPasswordField;
    private javax.swing.JTextArea nEmployeeAddressTextField;
    private javax.swing.JTextField nEmployeeMobileTextField;
    private javax.swing.JTextField nEmployeeNameTextField;
    private javax.swing.JTextField nEmployeeidtextfield;
    private javax.swing.JPasswordField nInputPasswordField;
    // End of variables declaration//GEN-END:variables
}
