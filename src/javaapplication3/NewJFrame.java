
package javaapplication3;

import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vNombre = new javax.swing.JTextField();
        vEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 250, 79, 23);

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 250, 61, 23);

        jLabel1.setText("NOMBRE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 11, 42, 14);

        jLabel2.setText("EDAD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 27, 14);

        vNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNombreActionPerformed(evt);
            }
        });
        getContentPane().add(vNombre);
        vNombre.setBounds(113, 11, 58, 20);
        getContentPane().add(vEdad);
        vEdad.setBounds(113, 49, 58, 20);

        jLabel3.setText("APELLIDO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 48, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(113, 87, 58, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//      JOptionPane.showMessageDialog(null,"diste click en el boton aceptar");
        
        
        
        int vEdad2;
        
        vEdad2=Integer.parseInt(this.vEdad.getText());
        if(vEdad2>=18){
            JOptionPane.showMessageDialog(null,"mayor de edad");
        }
        else{
            JOptionPane.showMessageDialog(null,"menor de edad");
        }
        
        
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField vEdad;
    private javax.swing.JTextField vNombre;
    // End of variables declaration//GEN-END:variables
}
