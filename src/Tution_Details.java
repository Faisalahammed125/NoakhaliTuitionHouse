
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Faisal
 */
public class Tution_Details extends javax.swing.JFrame {

    /**
     * Creates new form Tution_Details
     */
    String url = "jdbc:mysql://localhost:3306/tution_house";
    String username = "root";
    String pass = "123456";
    
    public Tution_Details() {
        initComponents();
        ShowDetails();
        ScaleImage();
    }
     public void ScaleImage() {
        ImageIcon ic;
        ic = new ImageIcon("E:\\JavaProject\\NoakhaliTuitionHousee\\src\\img\\back1.jpg");
        Image im = ic.getImage();
        Image imScale = im.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledicon = new ImageIcon(imScale);
        jLabel5.setIcon(scaledicon);
    }
    
    class Details {

        public String Code,Tcode,Gcell,Tcell,salary,Fee,Paid,Status;

        public Details(String Code, String Tcode, String Gcell, String Tcell, String salary,
        String Fee,String Paid,String Status) {
            this.Code = Code;
            this.Tcode = Tcode;
            this.Gcell = Gcell;
            this.Tcell= Tcell;
            this.salary = salary;
            this.Fee = Fee;
            this.Paid = Paid;
            this.Status = Status;
        }
    }
    ArrayList<Details> ar = new ArrayList<>();
    
    public void showTable() {
        DefaultTableModel mod = (DefaultTableModel) (jTable1.getModel());
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Select");
        Object[] col = new Object[8];
        mod.setRowCount(0);
        for (int i = 0; i < ar.size(); i++) {
             if(ar.get(i).Status.compareTo("Pending")==0 ){
                jComboBox1.addItem(ar.get(i).Code);
            }
            col[0] = ar.get(i).Code;
            col[1] = ar.get(i).Tcode;
            col[2] = ar.get(i).Gcell;
            col[3] = ar.get(i).Tcell;
            col[4] = ar.get(i).salary;
            col[5] = ar.get(i).Fee;
            col[6] = ar.get(i).Paid;
            col[7] = ar.get(i).Status;
            mod.addRow(col);
        }
    }
    public void ShowDetails() {
        try {
            String query = "SELECT * FROM Details;";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, username, pass); //2
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(query);

            ar.clear();
            while (rs.next()) {
//                System.out.println(rs.getString("Code"));
                Details obj = new Details(rs.getString("TutionCode"), rs.getString("TeacherCode"),
                    rs.getString("GcellNo"), rs.getString("TcellNo"), rs.getString("Salary"),rs.getString("MediaFee"),
                    rs.getString("Paid"),rs.getString("Status"));
                ar.add(obj);
            }
            showTable();
            st.close();
            con.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Teacher_Request.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tution Code", "Teacher Code", "Guardian Cell No", "Teacher Cell no", "Salary", "Media Fee", "Paid", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 418));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel1.setText("Tution Code   ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 110, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel2.setText("Teacher Code  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3.setText("Media Fee   ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel4.setText("Paid    ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 555, -1, 31));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 480, 88, 32));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 606, 172, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 436, 274, 32));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 150, 32));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 518, 150, 31));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 555, 150, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, 31));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 880, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Code = (String) jComboBox1.getSelectedItem();
        String Tcode = jTextField1.getText();
        if(Code=="Select"){
            JOptionPane.showMessageDialog(null, "Please select tution Code!!");
        }
        else if(Tcode.length()==0){
            JOptionPane.showMessageDialog(null, "Teacher code can't be empty!");
        }
        else {
             try{
                 String query = "SELECT * FROM teachers where codded = '" + Tcode + "';";
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = (Connection) DriverManager.getConnection(url, username, pass); //2
                 Statement st = (Statement) con.createStatement();
//               System.out.println(query);
                 ResultSet rs = st.executeQuery(query);
                 if(rs.next()){
                     try{
                      String query1 = "UPDATE Details SET TeacherCode = '" + Tcode + "' , TcellNo = '" + rs.getString("mobile") + "' where TutionCode = '" + Code + "';";
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection con1 = (Connection) DriverManager.getConnection(url, username, pass); //2
                      Statement st1 = (Statement) con1.createStatement();
//                      System.out.println(query);
                      st1.execute(query1);
                      ShowDetails();
                    }
                    catch (ClassNotFoundException | SQLException ex) {
                     Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Please enter valid teacher Code!");
                 }
                 
             } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
             }catch (SQLException ex) {
                Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminPage AP = new AdminPage();
        AP.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String Code = (String) jComboBox1.getSelectedItem();
        String Paid = jTextField3.getText();
        String status= "Done";
        if(Code=="Select"){
            JOptionPane.showMessageDialog(null, "Please select tution Code!!");
        }
        else if(Paid.length()==0){
            JOptionPane.showMessageDialog(null, "Paid field can't be empty!");
        }
        else {
             try{
                  String query1 = "UPDATE Details SET Paid = '" + Paid + "' where TutionCode = '" + Code + "';";
                  String query2 = "UPDATE Details SET Status = '" + status + "' where MediaFee = Paid ;";
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con1 = (Connection) DriverManager.getConnection(url, username, pass); //2
                  Statement st1 = (Statement) con1.createStatement();
                  Connection con2 = (Connection) DriverManager.getConnection(url, username, pass); //2
                  Statement st2 = (Statement) con2.createStatement();
//                      System.out.println(query);
                  st1.execute(query1);
                  st2.execute(query2);
                  JOptionPane.showMessageDialog(null, "Updated Successfully!");
                  con1.close();
                  st1.close();
                  ShowDetails();
                      
             } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
             }catch (SQLException ex) {
                Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Code = (String) jComboBox1.getSelectedItem();
        String Fee = jTextField2.getText();
        String status = "Done";
        if(Code=="Select"){
            JOptionPane.showMessageDialog(null, "Please select tution Code!!");
        }
        else if(Fee.length()==0){
            JOptionPane.showMessageDialog(null, "Media fee can't be empty!");
        }
        else {
             try{
                  String query1 = "UPDATE Details SET MediaFee = '" + Fee + "' where TutionCode = '" + Code + "';";
                  String query2 = "UPDATE Details SET Status = '" + status + "' where MediaFee = Paid ;";
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con1 = (Connection) DriverManager.getConnection(url, username, pass); //2
                  Statement st1 = (Statement) con1.createStatement();
                    Connection con2 = (Connection) DriverManager.getConnection(url, username, pass); //2
                  Statement st2 = (Statement) con2.createStatement();
//                      System.out.println(query);
                  st1.execute(query1);
                  st2.execute(query2);
                  JOptionPane.showMessageDialog(null, "Updated Successfully!");
                  con1.close();
                  st1.close();
                  ShowDetails();
                      
             } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
             }catch (SQLException ex) {
                Logger.getLogger(Tution_Details.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tution_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tution_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tution_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tution_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tution_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
