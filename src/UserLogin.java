
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Faisal
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    String url = "jdbc:mysql://localhost:3306/tution_house";
    String username = "root";
    String pass = "123456";
    public UserLogin() {
        initComponents();
        ScaleImage1();
        ScaleImage2();
        ScaleImage3();
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
    }
    public void ScaleImage1() {
        ImageIcon ic;
        ic = new ImageIcon("E:\\JavaProject\\BusMania\\src\\img\\user icon.png");
        Image im = ic.getImage();
        Image imScale = im.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon = new ImageIcon(imScale);
        label1.setIcon(scaledicon);
    }

    public void ScaleImage2() {
        ImageIcon ic;
        ic = new ImageIcon("E:\\JavaProject\\BusMania\\src\\img\\password icon.png");
        Image im = ic.getImage();
        Image imScale = im.getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon = new ImageIcon(imScale);
        label2.setIcon(scaledicon);
    }
    public void ScaleImage3() {
        ImageIcon ic;
        ic = new ImageIcon("E:\\JavaProject\\NoakhaliTuitionHousee\\src\\img\\green.jpg");
        Image im = ic.getImage();
        Image imScale = im.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon = new ImageIcon(imScale);
        jLabel1.setIcon(scaledicon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        UserId = new javax.swing.JTextField();
        PassWord = new javax.swing.JTextField();
        Signin = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setText("ADMIN LOGIN");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 690, 60));

        UserId.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        UserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdActionPerformed(evt);
            }
        });
        getContentPane().add(UserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 460, 30));

        PassWord.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassWordActionPerformed(evt);
            }
        });
        getContentPane().add(PassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 460, 30));

        Signin.setBackground(new java.awt.Color(0, 0, 0));
        Signin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Signin.setForeground(new java.awt.Color(0, 204, 0));
        Signin.setText("Sign In");
        Signin.setPreferredSize(new java.awt.Dimension(90, 30));
        Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninActionPerformed(evt);
            }
        });
        getContentPane().add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 200, 40));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 40, 30));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 40, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 0));
        jButton4.setText("Go back");
        jButton4.setPreferredSize(new java.awt.Dimension(90, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 200, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 800, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIdActionPerformed

    private void PassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassWordActionPerformed

    private void SigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninActionPerformed
        // TODO add your handling code here:
        String USERID = UserId.getText();
        String PASS = PassWord.getText();
        if (USERID.isEmpty() || PASS.isEmpty())
        JOptionPane.showMessageDialog(null, "Username or password cannot be empty!","Error",2);
        else {
            try {
                String query = "SELECT * FROM admin WHERE user_id = '" + USERID + "' AND password = '" + PASS + "';";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection(url, username, pass); //2
                Statement st = (Statement) con.createStatement();
                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    AdminPage Ap = new AdminPage();
                    Ap.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong user id or password!\nTry again!", "Alert", 0);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SigninActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        StartPage ob = new StartPage();
        ob.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PassWord;
    private javax.swing.JButton Signin;
    private javax.swing.JTextField UserId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    // End of variables declaration//GEN-END:variables
}
