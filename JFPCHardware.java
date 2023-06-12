
package GUI;


public class JFPCHardware extends javax.swing.JFrame {

    
    public JFPCHardware() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAssEmp = new javax.swing.JButton();
        BtnAddPerip = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAssEmp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAssEmp.setText("Assign to Employee");
        btnAssEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 153, 39));

        BtnAddPerip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnAddPerip.setText("Add Peripherals");
        BtnAddPerip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddPeripActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAddPerip, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 153, 39));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Welcome to PC Hardware");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Saved Pictures\\pngtree-abstract-geometric-gear-technology-background-picture-image_1441108.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 319, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssEmpActionPerformed
  
        AssEmp v = new AssEmp();
        v.setVisible(true);
    }//GEN-LAST:event_btnAssEmpActionPerformed

    private void BtnAddPeripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddPeripActionPerformed
    
        Addperip v = new Addperip();
        v.setVisible(true);
    }//GEN-LAST:event_BtnAddPeripActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPCHardware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddPerip;
    private javax.swing.JButton btnAssEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
