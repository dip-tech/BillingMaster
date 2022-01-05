
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;




public class UpdateItem extends javax.swing.JFrame {

    Connection nConn=null;
    PreparedStatement nPs=null;
    ResultSet nRs=null;
    int nSelectedRow=-1,nRe=0;
    String nUpdateItem,nUpdateItemRate,nUpdateItemUnit,nUpdateItemNature,nOldItemName;
    public UpdateItem() {
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
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);//To change body of generated methods, choose Tools | Templates.
                dispose();
            }
            
        });
        Toolkit nToolKit=Toolkit.getDefaultToolkit();
        setIconImage(nToolKit.getImage(getClass().getResource("icon/icon.png")));
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JTableHeader nTh=nUpdateTable.getTableHeader();
        nTh.setFont(new Font("Courier New",Font.BOLD,24));
        loadDataUpdate();
    }
    
    void loadDataUpdate()
    {
        String nQuery="select * from item";
        try{
            nConn=ConnectDB.Connect();
            nPs=nConn.prepareStatement(nQuery);
            nRs=nPs.executeQuery();
            while(nRs.next())
            {
                String nTdata[]={nRs.getString("ITEM_NAME"),nRs.getString("ITEM_RATE"),nRs.getString("item_unit"),nRs.getString("item_nature")};
                DefaultTableModel nDefTab=(DefaultTableModel) nUpdateTable.getModel();
                nDefTab.addRow(nTdata);
            }
            nConn.close();
            nPs.close();
            nRs.close();
        }
        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null,x);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nUpdateTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nIname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nIrate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ItemNatureTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ItemUnitTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLING MASTER");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATE ITEM DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 18), new java.awt.Color(102, 153, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("SELECT ITEM ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 110, 160, 22);

        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        nUpdateTable.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nUpdateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NAME", "ITEM RATE", "UNIT", "NATURE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nUpdateTable.setFocusable(false);
        nUpdateTable.setGridColor(new java.awt.Color(255, 255, 255));
        nUpdateTable.setRowHeight(25);
        nUpdateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nUpdateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nUpdateTable);
        if (nUpdateTable.getColumnModel().getColumnCount() > 0) {
            nUpdateTable.getColumnModel().getColumn(0).setResizable(false);
            nUpdateTable.getColumnModel().getColumn(0).setPreferredWidth(250);
            nUpdateTable.getColumnModel().getColumn(1).setResizable(false);
            nUpdateTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            nUpdateTable.getColumnModel().getColumn(2).setResizable(false);
            nUpdateTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            nUpdateTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 990, 310);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ITEM NAME ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 530, 110, 17);

        nIname.setBackground(new java.awt.Color(204, 204, 204));
        nIname.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nIname.setToolTipText("");
        nIname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nInameKeyTyped(evt);
            }
        });
        jPanel1.add(nIname);
        nIname.setBounds(60, 560, 370, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("ITEM RATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 530, 130, 17);

        nIrate.setBackground(new java.awt.Color(204, 204, 204));
        nIrate.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nIrate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nIrateKeyTyped(evt);
            }
        });
        jPanel1.add(nIrate);
        nIrate.setBounds(500, 560, 300, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("UPDATE");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 550, 160, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("ITEM NATURE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 640, 120, 20);

        ItemNatureTextField.setBackground(new java.awt.Color(204, 204, 204));
        ItemNatureTextField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jPanel1.add(ItemNatureTextField);
        ItemNatureTextField.setBounds(500, 670, 300, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ITEM UNIT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 640, 120, 20);

        ItemUnitTextField.setBackground(new java.awt.Color(204, 204, 204));
        ItemUnitTextField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jPanel1.add(ItemUnitTextField);
        ItemUnitTextField.setBounds(60, 670, 370, 30);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("CLEAR");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(890, 640, 160, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nUpdateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nUpdateTableMouseClicked
        // TODO add your handling code here:
        nSelectedRow=nUpdateTable.getSelectedRow();
        DefaultTableModel nModel=(DefaultTableModel) nUpdateTable.getModel();
        nOldItemName=nModel.getValueAt(nSelectedRow,0).toString();
        nIname.setText(nModel.getValueAt(nSelectedRow,0).toString());
        nIrate.setText(nModel.getValueAt(nSelectedRow,1).toString());
        ItemUnitTextField.setText(nModel.getValueAt(nSelectedRow, 2).toString());
        ItemNatureTextField.setText(nModel.getValueAt(nSelectedRow,3).toString());
    }//GEN-LAST:event_nUpdateTableMouseClicked

    private void nInameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nInameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_nInameKeyTyped

    private void nIrateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nIrateKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_nIrateKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        nUpdateItem=nIname.getText().toUpperCase();
        nUpdateItemRate=nIrate.getText().toUpperCase();
        nUpdateItemUnit=ItemUnitTextField.getText().toUpperCase();
        nUpdateItemNature=ItemNatureTextField.getText().toUpperCase();
        if(nSelectedRow==-1 || nUpdateItem.isEmpty() || nUpdateItemRate.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Select Item For Update.");
        }
        else
        {
            
            String nSqlQuery="update item set ITEM_NAME=?,ITEM_RATE=?,ITEM_UNIT=?,ITEM_NATURE=? where ITEM_NAME=?";
            try {
                nConn=ConnectDB.Connect();
                nPs=nConn.prepareStatement(nSqlQuery);
                nPs.setString(1,nUpdateItem);
                nPs.setString(2,nUpdateItemRate);
                nPs.setString(3,nUpdateItemUnit);
                nPs.setString(4,nUpdateItemNature);
                nPs.setString(5,nOldItemName);
                nRe=nPs.executeUpdate();
                if(nRe!=0)
                    {
                        DefaultTableModel nModel=(DefaultTableModel) nUpdateTable.getModel();
                        nModel.setValueAt(nUpdateItem, nSelectedRow,0);
                        nModel.setValueAt(nUpdateItemRate, nSelectedRow,1);
                        nModel.setValueAt(nUpdateItemUnit, nSelectedRow,2);
                        nModel.setValueAt(nUpdateItemNature, nSelectedRow,3);
                        JOptionPane.showMessageDialog(null,"Item Succesfully Updated");
                    }
                nConn.close();
                nPs=null;
                nRe=0;
            }
            catch(SQLException xe)
            {
                JOptionPane.showMessageDialog(null,xe);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nIname.setText("");
        nIrate.setText("");
        ItemUnitTextField.setText("");
        ItemNatureTextField.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ItemNatureTextField;
    private javax.swing.JTextField ItemUnitTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nIname;
    private javax.swing.JTextField nIrate;
    private javax.swing.JTable nUpdateTable;
    // End of variables declaration//GEN-END:variables
}
