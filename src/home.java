
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author spiro
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        reservation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu10.setText("jMenu10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("background"); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register.setBackground(new java.awt.Color(0, 153, 255));
        register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Εγγραφή");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel2.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 140, -1));

        reservation.setBackground(new java.awt.Color(0, 153, 255));
        reservation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reservation.setForeground(new java.awt.Color(255, 255, 255));
        reservation.setText("Σύνδεση");
        reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 140, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Καλώς ήρθατε στο ταξιδιωτικό μας γραφείο");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 310, 30));

        jLabel2.setText("Εξερευνήστε τους προορισμούς μας");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 208, 26));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("και σχεδιάστε την επόμενη περιπέτειά σας!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 360, 150));

        jLabel4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://www.loveyourholidays.gr/wp-content/uploads/2021/04/%CF%84%CE%BF-%CE%BA%CE%B1%CE%BB%CF%8D%CF%84%CE%B5%CF%81%CE%BF-%CF%84%CE%B1%CE%BE%CE%B9%CE%B4%CE%B9%CF%89%CF%84%CE%B9%CE%BA%CF%8C-%CE%B3%CF%81%CE%B1%CF%86%CE%B5%CE%AF%CE%BF-Loveyourholidays.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 440));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        register r1=new register();
        r1.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_registerMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        login l1=new login();
        l1.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton register;
    private javax.swing.JButton reservation;
    // End of variables declaration//GEN-END:variables
}
