
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author spiro
 */
public class reservation extends javax.swing.JFrame {
    public int ID;
    public int cid;

    /**
     * Creates new form reservation
     */
    public reservation() {
        initComponents();
    }
    
    public reservation(int ID) {
        this();
        this.ID=ID;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frm = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        from1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        sugg = new javax.swing.JMenu();
        reserv = new javax.swing.JMenu();
        about_us = new javax.swing.JMenu();
        FAQ = new javax.swing.JMenu();
        profile = new javax.swing.JMenu();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(0, 204, 255));
        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setText("Αναζήτηση");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 293, 190, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("ΠΡΟΣ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 63, 65));
        jLabel2.setText("ΑΠΟ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 60, -1));
        getContentPane().add(frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 200, 380, 60));

        to.setActionCommand("<Not Set>");
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 380, 60));

        jLabel1.setIcon(new javax.swing.JLabel() {
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
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 554));

        from1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from1ActionPerformed(evt);
            }
        });
        getContentPane().add(from1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 390, 60));

        sugg.setText("Προτάσεις");
        sugg.setActionCommand("sugg");
        sugg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suggMouseClicked(evt);
            }
        });
        jMenuBar1.add(sugg);
        sugg.getAccessibleContext().setAccessibleName("sugg");

        reserv.setText("Κρατήσεις");
        reserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservMouseClicked(evt);
            }
        });
        jMenuBar1.add(reserv);

        about_us.setText("About Us");
        about_us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_usMouseClicked(evt);
            }
        });
        jMenuBar1.add(about_us);

        FAQ.setText("FAQ");
        FAQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FAQMouseClicked(evt);
            }
        });
        jMenuBar1.add(FAQ);

        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jMenuBar1.add(profile);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if(frm.getText().trim().isEmpty() && to.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The fields are empty");
        }
        else if(frm.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "From form is empty");
        }
        else if(to.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "To form is empty");
        }
        else
        {
            String from=frm.getText();
            String todest=to.getText();
            Connection myconnection;
            String country1,msg="";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url ="jdbc:mysql://localhost/touristoffice";
                String user1 = "root";
                String password1 = "";
                myconnection = DriverManager.getConnection(url,user1,password1);
                if (myconnection != null)
                System.out.println("Connected to the database touristoffice");
                Statement stm=myconnection.createStatement();
                ResultSet rs = stm.executeQuery("select * from country");
                boolean found1=false,found2=false;
                float cost=0;
                int reply=0;
                int av_seats=0;
                PreparedStatement ps1;
                ResultSet rs1;
                while(rs.next())
                {
                    cid=rs.getInt(1);
                    country1=rs.getString(2);
                    cost = rs.getFloat(3);
                    if(from.equals("Athens"))
                        found1=true;
                    if(todest.equals(country1))
                        found2=true;
                    
                    if(found2==true && found1==true){
                        reply = JOptionPane.showConfirmDialog(null, "Από Athens προς "+ country1 +" τo κόστος είναι " +cost+"€\nΘέλετε να προχωρήσετε σε κράτηση;", "Κράτηση", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION) {
                            ps1=myconnection.prepareStatement("select av_seats from country  where pros=?");
                            ps1.setString(1,country1);
                            rs1=ps1.executeQuery();
                            while(rs1.next())
                            {
                                av_seats=rs1.getInt(1); // fetch απο την βαση
                            }
                            av_seats--; //Αφαιρουμε μια θεση
                            // Assuming you have a valid database connection 'myconnection'
                            String updateQuery = "UPDATE country SET av_seats = ? WHERE pros = ?";

                            try (PreparedStatement updateStatement = myconnection.prepareStatement(updateQuery)) {
                                updateStatement.setInt(1, av_seats); // Set the new value
                                updateStatement.setString(2, country1); // Set the condition (pros = ?)

                                int rowsAffected = updateStatement.executeUpdate();
                                if (rowsAffected > 0) {
                                    System.out.println("Updated successfully!");
                                } else {
                                    System.out.println("No rows updated.");
                                }
                                
                            } catch (SQLException e) 
                            {
                                e.printStackTrace();
                            }                           
                            JOptionPane.showMessageDialog(null, "Η θέση κρατήθηκε");
                                                        
                        } else {
                            JOptionPane.showMessageDialog(null, "Η κράτηση ακυρώθηκε");
                            System.exit(0);
                        }
                        break;
                    }
                }
                String insertQuery="insert into reservation(cid,id) values (?,?)";
                try(PreparedStatement insertStatement=myconnection.prepareStatement(insertQuery))
                {
                    insertStatement.setInt(1,cid);
                    insertStatement.setInt(2,ID);
                   //System.out.println(cid + ID);
                    int rowsAffected = insertStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Inserted successfully!");
                    } else {
                        System.out.println("No rows inserted.");
                    }
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
                
                if(found1!=true || found2!=true){
                    JOptionPane.showMessageDialog(null,"There are no flights to that");
                }
                myconnection.close();
            }
            catch(Exception e)
            {
                System.out.println("e");

            }
        }
    }//GEN-LAST:event_searchActionPerformed

    private void FAQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FAQMouseClicked
        // TODO add your handling code here:
        FAQ f1 = new FAQ();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FAQMouseClicked

    private void about_usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_usMouseClicked
        // TODO add your handling code here:
        about_us ab1=new about_us();
        ab1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_about_usMouseClicked

    private void suggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggMouseClicked
        // TODO add your handling code here:
        suggestion sugg1=new suggestion();
        sugg1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_suggMouseClicked

    private void reservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservMouseClicked
        // TODO add your handling code here:
        reservation res1=new reservation();
        res1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reservMouseClicked

    private void from1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from1ActionPerformed
        // TODO add your handling code here:
        Connection myconnection;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost/touristoffice";
            String user1 = "root";
            String password1 = "";
            myconnection = DriverManager.getConnection(url,user1,password1);
            if (myconnection != null)
            System.out.println("Connected to the database touristoffice");

            Statement stm=myconnection.createStatement();
            ResultSet rs = stm.executeQuery("select c_name from country");
            while(rs.next()){
                from1.addItem(rs.getString("c_name"));

            }
            myconnection.close();
        }
        catch(Exception e)
        {
            System.out.println("e");

        }
    }//GEN-LAST:event_from1ActionPerformed

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        // TODO add your handling code here:
        profile p1=new profile(cid,ID);
        p1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileMouseClicked

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
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FAQ;
    private javax.swing.JMenu about_us;
    private javax.swing.JTextField frm;
    private javax.swing.JComboBox<String> from1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu profile;
    private javax.swing.JMenu reserv;
    private javax.swing.JButton search;
    private javax.swing.JMenu sugg;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
