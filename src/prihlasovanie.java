/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class prihlasovanie extends javax.swing.JFrame {

    /**
     * Creates new form prihlasovanie
     */
    public prihlasovanie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        meno = new javax.swing.JTextField();
        jTextmeno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonucitel = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 110, -1));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));
        jTextField1.setText("heslo:");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 60, -1));

        meno.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        meno.setForeground(new java.awt.Color(255, 51, 51));
        meno.setText("meno");
        meno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menoActionPerformed(evt);
            }
        });
        getContentPane().add(meno, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 60, -1));
        getContentPane().add(jTextmeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 110, -1));

        jButton1.setText("prihlasiť");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, -1, -1));

        jButtonucitel.setText("ucitel");
        jButtonucitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonucitelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonucitel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String heslo = jPasswordField1.getText();  // Zadefinuje premennú heslo a vlozí doň text
        String meno = jTextmeno.getText();  // Zadefinuje premennú meno a vlozí doň text
        if (heslo.contains("1") && meno.contains("1")) //kontroluje zhodnosť mena a hesla
        {
            jPasswordField1.setText(null); //vymaže text v poli heslo
   jTextmeno.setText(null); //vymaže text v poli meno

            domov domov = new domov(); // Zadefinuje Jframe(Domov)
            domov.show(); // Zobrazí Jframe(Domov)
            dispose(); // Zatvoí povodný Jframe
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Neplatné alebo Zle zadané prihlasovacie údaje.","LOGIN_ERROR",JOptionPane.ERROR_MESSAGE); //Error message
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonucitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonucitelActionPerformed
 String heslo = jPasswordField1.getText();  // Zadefinuje premennú heslo a vlozí doň text
        String meno = jTextmeno.getText();  // Zadefinuje premennú meno a vlozí doň text
        if (heslo.contains("2") && meno.contains("2")) //kontroluje zhodnosť mena a hesla
        {
            jPasswordField1.setText(null); //vymaže text v poli heslo
   jTextmeno.setText(null); //vymaže text v poli meno

          ucitel  ucitel  = new  ucitel (); // Zadefinuje Jframe(Domov)
             ucitel .show(); // Zobrazí Jframe(Domov)
            dispose(); // Zatvoí povodný Jframe
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Neplatné alebo Zle zadané prihlasovacie údaje.","LOGIN_ERROR",JOptionPane.ERROR_MESSAGE); //Error message
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonucitelActionPerformed

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
            java.util.logging.Logger.getLogger(prihlasovanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prihlasovanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prihlasovanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prihlasovanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prihlasovanie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonucitel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextmeno;
    private javax.swing.JTextField meno;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
