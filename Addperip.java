
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Addperip extends javax.swing.JFrame {

    
    public Addperip() {
        initComponents();
        Connect();
    }
     Connection  con;
     PreparedStatement pst;
     DefaultTableModel df;
     
     
     public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:msql://localhost/pchardware","root","");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Addperip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Addperip.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     
     public void load(){
     
         int a;
        try {
            pst = con.prepareStatement("select * from addperip");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)tablePerip.getModel();
            df.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=a;i++)
                {
                v2.add(rs.getString("ID"));
                v2.add(rs.getString("Name"));
                v2.add(rs.getString("Peripheral"));
                v2.add(rs.getString("Input/Output"));
                v2.add(rs.getString("Code"));
                }
                df.addRow(v2);
                    
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Addperip.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbAdd = new javax.swing.JButton();
        tbDelete = new javax.swing.JButton();
        tbUpdate = new javax.swing.JButton();
        tbCancel = new javax.swing.JButton();
        txtIOPerip = new javax.swing.JTextField();
        txtCodePerip = new javax.swing.JTextField();
        txtPerperip = new javax.swing.JTextField();
        txtNamePerip = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePerip = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Peripheral:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Input/Output:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Code:");

        tbAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbAdd.setText("Add");
        tbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAddActionPerformed(evt);
            }
        });

        tbDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbDelete.setText("Delete");
        tbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDeleteActionPerformed(evt);
            }
        });

        tbUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbUpdate.setText("Update");
        tbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbUpdateActionPerformed(evt);
            }
        });

        tbCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbCancel.setText("Cancel");
        tbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCancelActionPerformed(evt);
            }
        });

        txtIOPerip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtCodePerip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtPerperip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtNamePerip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnClose.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txtPerperip))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(txtNamePerip))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodePerip)
                            .addComponent(txtIOPerip))))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamePerip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPerperip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIOPerip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodePerip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, 400));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setText("Peripherals");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 11, -1, -1));

        tablePerip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp.ID", "Name", "Peripheral", "Input/Output", "Code"
            }
        ));
        tablePerip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePeripMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePerip);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 107, -1, 400));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAddActionPerformed
       
        try {
             String name = txtNamePerip.getText();
             String peripheral = txtPerperip.getText();
             String IO = txtIOPerip.getText();
             String Code = txtCodePerip.getText();
            
            pst = con.prepareStatement("insert table peripherals(Name,Peripheral,Input/Output,Code)values(?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,peripheral);
            pst.setString(3,IO);
            pst.setString(4,Code);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"peripheral Added");
            
            txtNamePerip.setText("");
            txtPerperip.setText("");
            txtIOPerip.setText("");
            txtCodePerip.setText("");
            txtNamePerip.requestFocus();
            load();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Addperip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbAddActionPerformed

    private void tbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbUpdateActionPerformed
        
         df = (DefaultTableModel)tablePerip.getModel();
         int selected = tablePerip.getSelectedRow();
         
         int ID = Integer.parseInt(df.getValueAt(selected, 0).toString());
         
         String name = txtNamePerip.getText();
             String peripheral = txtPerperip.getText();
             String IO = txtIOPerip.getText();
             String Code = txtCodePerip.getText();
            
        try {
            pst = con.prepareStatement("Update addperip set name = ?,Peripheral=?,Input/Output=?,Code=? where ID=?");
            pst.setString(1,name);
            pst.setString(2,peripheral);
            pst.setString(3,IO);
            pst.setString(4,Code);
            pst.setInt(5, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"peripheral Added");
            
            txtNamePerip.setText("");
            txtPerperip.setText("");
            txtIOPerip.setText("");
            txtCodePerip.setText("");
            txtNamePerip.requestFocus();
            load();
            
        } catch (SQLException ex) {
            Logger.getLogger(Addperip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbUpdateActionPerformed

    private void tbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDeleteActionPerformed
       
        df = (DefaultTableModel)tablePerip.getModel();
         int selected = tablePerip.getSelectedRow();
         
         int ID = Integer.parseInt(df.getValueAt(selected, 0).toString());
         
            
        try {
            pst = con.prepareStatement("Delete from addperip where ID =?");

            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Peripheral Deleted");
            
            txtNamePerip.setText("");
            txtPerperip.setText("");
            txtIOPerip.setText("");
            txtCodePerip.setText("");
            txtNamePerip.requestFocus();
            load();
            
            tablePerip.setEnabled(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Addperip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbDeleteActionPerformed

    private void tbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCancelActionPerformed
      
            txtNamePerip.setText("");
            txtPerperip.setText("");
            txtIOPerip.setText("");
            txtCodePerip.setText("");
            txtNamePerip.requestFocus();
            load();
            
            tablePerip.setEnabled(true);

    }//GEN-LAST:event_tbCancelActionPerformed

    private void tablePeripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePeripMouseClicked
       
         df = (DefaultTableModel)tablePerip.getModel();
         int selected = tablePerip.getSelectedRow();
         
         int ID = Integer.parseInt(df.getValueAt(selected, 0).toString());
         txtNamePerip.setText(df.getValueAt(selected, 1).toString());
         txtPerperip.setText(df.getValueAt(selected, 2).toString());
         txtIOPerip.setText(df.getValueAt(selected, 3).toString());
         txtCodePerip.setText(df.getValueAt(selected, 4).toString());
         
         tablePerip.setEnabled(false);
         
    }//GEN-LAST:event_tablePeripMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
      
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Addperip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addperip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addperip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addperip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addperip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePerip;
    private javax.swing.JButton tbAdd;
    private javax.swing.JButton tbCancel;
    private javax.swing.JButton tbDelete;
    private javax.swing.JButton tbUpdate;
    private javax.swing.JTextField txtCodePerip;
    private javax.swing.JTextField txtIOPerip;
    private javax.swing.JTextField txtNamePerip;
    private javax.swing.JTextField txtPerperip;
    // End of variables declaration//GEN-END:variables
}
