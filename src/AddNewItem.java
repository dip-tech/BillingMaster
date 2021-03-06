
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AddNewItem extends javax.swing.JFrame {

    String nNewItemName = null, nNewItemRate, nNewItemUnit, nNewItemNature;
    Connection nCon = null;
    PreparedStatement nPs = null;
    int nRe = 0;

    public AddNewItem() {
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
        Toolkit nToolKit = Toolkit.getDefaultToolkit();
        setIconImage(nToolKit.getImage(getClass().getResource("icon/icon.png")));
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);//To change body of generated methods, choose Tools | Templates.
                dispose();
            }

        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nItemNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nItemRateTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nItemNatureCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        nItemUnitCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLING MASTER");
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD NEW ITEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1060, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("NEW ITEM NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 210, 130, 17);

        nItemNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        nItemNameTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nItemNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nItemNameTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nItemNameTextField);
        nItemNameTextField.setBounds(130, 240, 370, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NEW ITEM RATE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(630, 210, 150, 17);

        nItemRateTextField.setBackground(new java.awt.Color(204, 204, 204));
        nItemRateTextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nItemRateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nItemRateTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nItemRateTextField);
        nItemRateTextField.setBounds(630, 240, 350, 40);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("ADD ITEM");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 102, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(700, 510, 140, 50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("ITEM NATURE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 350, 190, 30);

        nItemNatureCombo.setBackground(new java.awt.Color(204, 204, 204));
        nItemNatureCombo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nItemNatureCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONE", "RAW METIRIALS", "SALES ITEM" }));
        jPanel1.add(nItemNatureCombo);
        nItemNatureCombo.setBounds(130, 390, 370, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("UNIT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(630, 360, 32, 17);

        nItemUnitCombo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nItemUnitCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONE", "PCS.", "PKT.", "DOZ.", "ML.", "LTR." }));
        jPanel1.add(nItemUnitCombo);
        nItemUnitCombo.setBounds(630, 390, 350, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("CLEAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(900, 510, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nItemRateTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nItemRateTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_nItemRateTextFieldKeyTyped

    private void nItemNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nItemNameTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isAlphabetic(ch) == false && ch != java.awt.event.KeyEvent.VK_SPACE && Character.isDigit(ch)==false) {
            evt.consume();
        }
    }//GEN-LAST:event_nItemNameTextFieldKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nSql = "insert into item values(?,?,?,?)";
        nNewItemName = nItemNameTextField.getText().toUpperCase();
        nNewItemRate = nItemRateTextField.getText().toUpperCase();
        nNewItemUnit = nItemUnitCombo.getSelectedItem().toString();
        nNewItemNature = nItemNatureCombo.getSelectedItem().toString();
        if (nNewItemName.isEmpty() || nNewItemRate.isEmpty() || nNewItemUnit.equals("NONE") || nNewItemNature.equals("NONE")) {
            JOptionPane.showMessageDialog(null, "Enter New Item Name or Rate or Unit or Nature.");
        } else {
            try {
                nCon = ConnectDB.Connect();
                nPs = nCon.prepareStatement(nSql);
                nPs.setString(1, nNewItemName);
                nPs.setString(2, nNewItemRate);
                nPs.setString(3, nNewItemUnit);
                nPs.setString(4, nNewItemNature);
                nRe = nPs.executeUpdate();
                if (nRe != 0) {
                    JOptionPane.showMessageDialog(null, "Item Succesfully Added");
                    nItemNameTextField.setText("");
                    nItemRateTextField.setText("");
                    nItemNatureCombo.setSelectedItem("NONE");
                    nItemUnitCombo.setSelectedItem("NONE");
                }
                nCon.close();
                nPs.close();
                nRe = 0;
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, x);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        nItemNameTextField.setText("");
        nItemRateTextField.setText("");
        nItemNatureCombo.setSelectedItem("NONE");
        nItemUnitCombo.setSelectedItem("NONE");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nItemNameTextField;
    private javax.swing.JComboBox nItemNatureCombo;
    private javax.swing.JTextField nItemRateTextField;
    private javax.swing.JComboBox nItemUnitCombo;
    // End of variables declaration//GEN-END:variables
}
