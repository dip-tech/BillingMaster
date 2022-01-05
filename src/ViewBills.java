
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ViewBills extends javax.swing.JFrame {

    Connection nConection = null;
    PreparedStatement nPreSt = null;
    ResultSet nResultSt = null;

    int nSELROW = -1;
    boolean nTrigger = true;

    public ViewBills() {
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
        closeOperation();
        myInitComponent();
        loadBillingDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DateInputTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillingDataTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLING MASTER");
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VIEW ALL BILLS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1968, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1980, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("SEARCH BILL BY DATE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1470, 110, 240, 30);

        DateInputTextField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        DateInputTextField.setForeground(new java.awt.Color(204, 204, 204));
        DateInputTextField.setText("DD-MM-YY");
        DateInputTextField.setCaretPosition(0);
        DateInputTextField.setName("gdfsdhfhdsf"); // NOI18N
        DateInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateInputTextFieldActionPerformed(evt);
            }
        });
        DateInputTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DateInputTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DateInputTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(DateInputTextField);
        DateInputTextField.setBounds(1470, 150, 240, 40);

        BillingDataTable.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        BillingDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INVOICE ID", "NAME", "MOBILE", "DATE"
            }
        ));
        BillingDataTable.setRowHeight(25);
        BillingDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillingDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillingDataTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 1670, 290);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("SAVE LOCAL");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1780, 230, 140, 40);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("SEARCH");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1780, 150, 140, 40);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("CLEAR");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1780, 310, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillingDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillingDataTableMouseClicked
        nSELROW = BillingDataTable.getSelectedRow();
    }//GEN-LAST:event_BillingDataTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nHomePath = System.getProperty("user.home");
        File nInvoiceFolder = new File(nHomePath + "\\Desktop\\customer_invoice");
        File nInvoiceFile;
        DefaultTableModel nTMODEL = (DefaultTableModel) BillingDataTable.getModel();
        if (nSELROW == -1) {
            JOptionPane.showMessageDialog(null, "Please Select One Bill");
        } else {
            try {
                if (nInvoiceFolder.exists()) {
                    nInvoiceFile = new File(nInvoiceFolder + "\\" + nTMODEL.getValueAt(nSELROW, 1).toString() + "_" + nTMODEL.getValueAt(nSELROW, 0).toString() + ".pdf");
                    nInvoiceFile.createNewFile();
                } else {
                    nInvoiceFolder.mkdir();
                    nInvoiceFile = new File(nInvoiceFolder + "\\" + nTMODEL.getValueAt(nSELROW, 1).toString() + "_" + nTMODEL.getValueAt(nSELROW, 0).toString() + ".pdf");
                    nInvoiceFile.createNewFile();
                }
                writeBill(nInvoiceFile);
                JOptionPane.showMessageDialog(null, "Invoice is Save\nCheck 'customer_invoice' folder.");
            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, er);
            } finally {
                try {
                    nConection.close();
                    nPreSt.close();
                    nResultSt.close();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, x);
                }
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nQuery = "select * from invoice_info where date=?";
        DefaultTableModel nDeTabModel = (DefaultTableModel) BillingDataTable.getModel();
        if (DateInputTextField.getText().equals("DD-MM-YY")) {
            JOptionPane.showMessageDialog(null, "Please Enter Date.");
        } else {
            try {
                nConection = ConnectDB.Connect();
                nPreSt = nConection.prepareStatement(nQuery);
                nPreSt.setString(1, DateInputTextField.getText());
                nResultSt = nPreSt.executeQuery();
                nDeTabModel.setRowCount(0);
                while (nResultSt.next()) {
                    String nTableData[] = {nResultSt.getString("invoice_id"), nResultSt.getString("customer_name"), nResultSt.getString("mobile_no"), nResultSt.getString("date")};
                    nDeTabModel.addRow(nTableData);
                }
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, x);
            } finally {
                try {
                    nConection.close();
                    nPreSt.close();
                    nResultSt.close();
                } catch (Exception xe) {
                    JOptionPane.showMessageDialog(null, xe);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateInputTextFieldActionPerformed

    private void DateInputTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateInputTextFieldKeyTyped
        // TODO add your handling code here:
        if (nTrigger == true) {
            DateInputTextField.setText("");
            nTrigger = false;
            DateInputTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_DateInputTextFieldKeyTyped

    private void DateInputTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateInputTextFieldKeyReleased
        // TODO add your handling code here:
        if (DateInputTextField.getText().length() == 0) {
            DateInputTextField.setText("DD-MM-YY");
            DateInputTextField.setForeground(Color.LIGHT_GRAY);
            nTrigger = true;
        }
    }//GEN-LAST:event_DateInputTextFieldKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel nTMODEL = (DefaultTableModel) BillingDataTable.getModel();
        nTMODEL.setRowCount(0);
        loadBillingDetails();
        DateInputTextField.setText("DD-MM-YY");
        DateInputTextField.setForeground(Color.LIGHT_GRAY);
        nTrigger = true;
    }//GEN-LAST:event_jButton3ActionPerformed
    public void closeOperation() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void myInitComponent() {
        Toolkit nSystemToolkit = Toolkit.getDefaultToolkit();
        int nScreenX = nSystemToolkit.getScreenSize().width;
        int nScreenY = nSystemToolkit.getScreenSize().height;
        setMinimumSize(new Dimension(nScreenX, nScreenY - 100));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jPanel1.setSize(nScreenX, nScreenY);
        jPanel2.setSize(nScreenX, 50);
        jLabel1.setBounds(nScreenX - 510, 70, 220, 30);
        jPanel1.add(jLabel1);
        DateInputTextField.setBounds(nScreenX - 510, 120, 260, 35);
        jPanel1.add(DateInputTextField);
        jScrollPane1.setBounds(50, 200, nScreenX - 300, nScreenY - 350);
        jPanel1.add(jScrollPane1);
        JTableHeader nBillingTableHeader = BillingDataTable.getTableHeader();
        nBillingTableHeader.setFont(new Font("Courier New", Font.BOLD, 18));
        jButton1.setBounds(nScreenX - 200, 200, 140, 40);
        jPanel1.add(jButton1);
        jButton2.setBounds(nScreenX - 200, 120, 140, 40);
        jPanel1.add(jButton2);
        jButton3.setBounds(nScreenX - 200, 280, 140, 40);
        jPanel1.add(jButton3);

    }

    public void loadBillingDetails() {
        String nSQL_QUERY = "select * from invoice_info";
        try {
            nConection = ConnectDB.Connect();
            nPreSt = nConection.prepareStatement(nSQL_QUERY);
            nResultSt = nPreSt.executeQuery();
            while (nResultSt.next()) {
                DefaultTableModel nDefaultModel = (DefaultTableModel) BillingDataTable.getModel();
                String nObj[] = {nResultSt.getString("invoice_id"), nResultSt.getString("customer_name"), nResultSt.getString("mobile_no"), nResultSt.getString("date")};
                nDefaultModel.addRow(nObj);
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x);
        } finally {
            try {
                nConection.close();
                nPreSt.close();
                nResultSt.close();
            } catch (Exception xe) {
                JOptionPane.showMessageDialog(null, xe);
            }
        }
    }

    public void writeBill(File nInvoFile) throws Exception {
        DefaultTableModel nDTM = (DefaultTableModel) BillingDataTable.getModel();
        String nQUERY = "select invoice_file from invoice_info where invoice_id=?";
        FileOutputStream nFOS = new FileOutputStream(nInvoFile);
        InputStream nInputStream;
        nConection = ConnectDB.Connect();
        nPreSt = nConection.prepareStatement(nQUERY);
        nPreSt.setString(1, nDTM.getValueAt(nSELROW, 0).toString());
        nResultSt = nPreSt.executeQuery();
        while (nResultSt.next()) {
            nInputStream = nResultSt.getBinaryStream("invoice_file");
            byte nByteArray[] = new byte[2048];
            while (nInputStream.read(nByteArray) > -1) {
                nFOS.write(nByteArray);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillingDataTable;
    private javax.swing.JTextField DateInputTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
