
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author maria
 */
public class about_us extends javax.swing.JFrame {

    /**
     * Creates new form about_us
     */
    public about_us() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        login = new javax.swing.JMenu();
        register = new javax.swing.JMenu();
        reservation = new javax.swing.JMenu();
        tips = new javax.swing.JMenu();
        about_us = new javax.swing.JMenu();
        FAQ = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Σχετικά με εμάς:");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Καλωσορίσατε στο Tourist Office !\n\nΣτο Tourist Office δεσμευόμαστε να παρέχουμε υψηλής ποιότητας υπηρεσίες κρατήσεων αεροπορικών εισιτηρίων,\nσχεδιασμένες για να καλύψουν κάθε ανάγκη του ταξιδιώτη. Με πολυετή εμπειρία στον τομέα των ταξιδιών, δημιουργήσαμε \nαυτήν την πλατφόρμα με σκοπό να προσφέρουμε άνεση, ευελιξία και ασφάλεια κατά τη διάρκεια της κράτησης σας.\n\nΗ ομάδα μας αποτελείται από ανθρώπους με πάθος για τα ταξίδια, πρόθεση να προσφέρουν εξαιρετική εξυπηρέτηση \nπελατών και τεχνολογία που συνδυάζει απόλυτη ασφάλεια με απλότητα χρήσης. Στόχος μας είναι να καθιστούμε το ταξίδι \nσας όχι μόνο μια αναγκαία μετακίνηση, αλλά μια αξέχαστη εμπειρία.\n\nΕυχαριστούμε που επιλέγετε το Tourist Office για τις κρατήσεις σας. Είμαστε εδώ για να σας βοηθήσουμε να φτάσετε\nστον προορισμό σας με άνεση και ευχάριστα ταξίδια!\n\nΜε εκτίμηση,\nΗ Ομάδα του Tourist Office ");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        home.setText("Αρχική");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        login.setText("Σύνδεση");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jMenuBar1.add(login);

        register.setText("Εγγραφή");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jMenuBar1.add(register);

        reservation.setText("Κρατήσεις");
        reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationMouseClicked(evt);
            }
        });
        jMenuBar1.add(reservation);

        tips.setText("Προτάσεις");
        tips.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipsMouseClicked(evt);
            }
        });
        jMenuBar1.add(tips);

        about_us.setText("Σχετικά με εμάς");
        jMenuBar1.add(about_us);

        FAQ.setText("FAQ");
        FAQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FAQMouseClicked(evt);
            }
        });
        jMenuBar1.add(FAQ);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        home h1 = new home();
        h1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        login l1 = new login();
        l1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        register r1 = new register();
        r1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerMouseClicked

    private void reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "You have to register or login");
//        reservation r1 = new reservation();
//        r1.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_reservationMouseClicked

    private void tipsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipsMouseClicked
        // TODO add your handling code here:
        suggestion s1 = new suggestion();
        s1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tipsMouseClicked

    private void FAQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FAQMouseClicked
        // TODO add your handling code here:
         FAQ f1 = new FAQ();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FAQMouseClicked

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
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about_us().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FAQ;
    private javax.swing.JMenu about_us;
    private javax.swing.JMenu home;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu login;
    private javax.swing.JMenu register;
    private javax.swing.JMenu reservation;
    private javax.swing.JMenu tips;
    // End of variables declaration//GEN-END:variables
}
