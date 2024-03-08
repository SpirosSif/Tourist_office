
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author maria
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        UserName = new javax.swing.JTextField();
        Surname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        login = new javax.swing.JMenu();
        register = new javax.swing.JMenu();
        reservation = new javax.swing.JMenu();
        tips = new javax.swing.JMenu();
        about_us = new javax.swing.JMenu();
        FAQ = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(241, 212, 142));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Όνομα :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, -1, -1));

        jLabel2.setText("Επίθετο :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 78, -1, -1));

        jLabel3.setText("email :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 128, -1, -1));

        jLabel4.setText("Όνομα χρήστη :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, -1, -1));

        jLabel5.setText("κωδικός :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 44, 376, -1));
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 376, -1));
        jPanel2.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 376, -1));
        jPanel2.add(Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, 376, -1));
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 376, -1));

        jButton2.setText("Υποβολή");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
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

        tips.setText("Συμβουλές");
        jMenuBar1.add(tips);

        about_us.setText("Σχετικά με εμάς");
        jMenuBar1.add(about_us);

        FAQ.setText("FAQ");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String errorMessage="";
        // Έλεγχος για κενά πεδία
    if (Name.getText().trim().isEmpty() ||
         Surname.getText().trim().isEmpty() ||
          Email.getText().trim().isEmpty() ||
        UserName.getText().trim().isEmpty() ||
        Password.getText().trim().isEmpty()) 
    {
        errorMessage += "One or more fields are empty\n";
    }
    // Εμφάνιση μηνυμάτων σε περίπτωση λαθών
    if (!errorMessage.isEmpty()) {
        JOptionPane.showMessageDialog(null, errorMessage);
    } else {
        try {
            // Σύνδεση με τη βάση δεδομένων
            String url = "jdbc:mysql://localhost:3306/touristoffice";
            String user = "root";
            String password = "";
            Connection myconnection = DriverManager.getConnection(url, user, password);

            // Κατασκευή του SQL ερωτήματος για την εισαγωγή δεδομένων
            String insertQuery = "INSERT INTO customers (id,first_name, last_name, email, username, pwd) VALUES (?,?,?, ?, ?, ?)";
            PreparedStatement preparedStatement = myconnection.prepareStatement(insertQuery);
            preparedStatement.setString(1, Name.getText());
            preparedStatement.setString(2, Name.getText());
            preparedStatement.setString(3,Surname.getText());
            preparedStatement.setString(4, Email.getText());
            preparedStatement.setString(5, UserName.getText());
            preparedStatement.setString(6, Password.getText());
        
           // Εκτέλεση του SQL ερωτήματος
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Successful data entry!");
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccessful data entry!");
            }

            preparedStatement.close();
            myconnection.close();
       } catch (SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while inserting data into database");
        }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        home h1 = new home();
        h1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        //login l1 = new login();
      //  l1.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_loginMouseClicked
  
    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        register r1 = new register();
        r1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerMouseClicked

    private void reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseClicked
        // TODO add your handling code here:
        reservation r1 = new reservation();
        r1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reservationMouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JMenu FAQ;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Surname;
    private javax.swing.JTextField UserName;
    private javax.swing.JMenu about_us;
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu login;
    private javax.swing.JMenu register;
    private javax.swing.JMenu reservation;
    private javax.swing.JMenu tips;
    // End of variables declaration//GEN-END:variables
}
