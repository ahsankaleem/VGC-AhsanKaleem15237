package VGCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Ahsan Kaleem 15237
 */
public class Coursemod extends javax.swing.JFrame {

   
// Univeriable Defined
    
    static final String DEFAULT_QUERY = "SELECT * from students";
    Connection conn = null;
    Statement stmt = null;
    String Student_Name = null, Student_Class = null;
    private Statement statement;
    private ResultSet resultSet;
    private boolean connectedToDatabase = false;
    private int numberOfRows;
    private ResultSetMetaData metaData;
    private static Coursemod tableModel;
    int Scid;
    int id;
    int tid;
    int syear;
    int cfees;
    
    public Coursemod() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cname = new javax.swing.JTextField();
        CID = new javax.swing.JTextField();
        Fees = new javax.swing.JTextField();
        Sub1 = new javax.swing.JTextField();
        Sub2 = new javax.swing.JTextField();
        Sub3 = new javax.swing.JTextField();
        Coursemod = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Sub4 = new javax.swing.JTextField();
        TeachID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Student Registeration");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setText("Course Name: ");

        jLabel2.setText("Subject 2:");

        jLabel3.setText("Subject 3:");

        jLabel6.setText("Course ID:");

        jLabel7.setText("Fees");

        jLabel8.setText("Subject 1:");

        Cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnameActionPerformed(evt);
            }
        });

        CID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDActionPerformed(evt);
            }
        });

        Fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeesActionPerformed(evt);
            }
        });

        Coursemod.setText("Submit");
        Coursemod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursemodActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Editing Course Information");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel5.setText("Subject 4:");

        jLabel10.setText("TeacherID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back)
                        .addGap(58, 58, 58)
                        .addComponent(Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Coursemod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Exit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fees)
                    .addComponent(Sub1)
                    .addComponent(Sub2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CID)
                    .addComponent(Cname)
                    .addComponent(Sub3)
                    .addComponent(Sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeachID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeachID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exit)
                            .addComponent(Back))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear)
                            .addComponent(Coursemod))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDActionPerformed

    private void CnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnameActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         // Exit:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void CoursemodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoursemodActionPerformed
        // TODO add your handling code here:
     
        try {
            conn=DatabaseConnection.getConnection();
        
        // Defined Variables
      
       
        String Coursename= Cname.getText();
         String CourseID= CID.getText();
         String fee= Fees.getText();
         String sub1= Sub1.getText();
         String sub2= Sub2.getText();
         String sub3= Sub3.getText();
         String sub4= Sub4.getText();
         String TeacherID= TeachID.getText();
     
       
       
        //  Excute query
        stmt = conn.createStatement();
        // handle account already exists 
         try {
           int ids = Integer.parseInt(CID.getText());
           this.id=ids;
           int newfees= Integer.parseInt(Fees.getText());
           this.cfees=newfees;
           int teachoid=Integer.parseInt(TeachID.getText());
           this.tid=teachoid;
            PreparedStatement CourseIDa = conn.prepareStatement("SELECT CourseID FROM course WHERE CourseID = ?;"); 
    CourseIDa.setInt(1, id);
            
    try (ResultSet rs = CourseIDa.executeQuery()){
           

         if (rs.next()) {
           
            // handle account already exists  
         if(Coursename==null){
            
             JOptionPane.showMessageDialog(null, "Please Enter Couse Name: ");
         }
             
         if (cfees<0){
            JOptionPane.showMessageDialog(null, "Please Enter the Fees ");
         }
          if (sub1==null){
             JOptionPane.showMessageDialog(null, "Please Enter the Couse Subject 1 ");
         }
         if (sub2==null){
             JOptionPane.showMessageDialog(null, "Please Enter the Couse Subject 2 ");
         }
         if (sub3==null){
           JOptionPane.showMessageDialog(null, "Please Enter the Couse Subject 3");
         }
         if(sub4==null){
             JOptionPane.showMessageDialog(null, "Please Enter the Couse Subject 4");
         }
       if (tid<0){
           JOptionPane.showMessageDialog(null, "Please Enter Couse TeacherID");
            
         }
       //  Excute query
        String sql = "UPDATE course SET CourseID =?,CName =?,Fees=?,Sub1=?,Sub2=?,Sub3=?,Sub4=?,TeacherID=? WHERE CourseID="+id+";";
       //CourseID CName Fees Sub1 Sub2 Sub3 Sub4 TeacherID
       PreparedStatement pst ;
       pst= conn.prepareStatement(sql);

pst.setString(1, CourseID);
pst.setString(2, Coursename);
pst.setString(3, fee);
pst.setString(4, sub1);
pst.setString(5, sub2);
pst.setString(6, sub3);
pst.setString(7, sub4);
pst.setString(8, TeacherID);
pst.execute(); 

      JOptionPane.showMessageDialog(null, "Successfully Edited.");
       AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);
       

}else{
             JOptionPane.showMessageDialog(null, "Course Doesn't Exist ");
         }
    }
    } catch (Exception e){
        
    }
         } catch(NumberFormatException e){
             
             
         } catch (SQLException ex) {
            Logger.getLogger(Coursemod.class.getName()).log(Level.SEVERE, null, ex);
        }
     
   
  
    }//GEN-LAST:event_CoursemodActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TO Clear The fields:
        Cname.setText("");
        CID.setText("");
        Fees.setText("");
        Sub1.setText("");
        Sub2.setText("");
        Sub3.setText("");
        Sub4.setText("");
        TeachID.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void FeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeesActionPerformed

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
            java.util.logging.Logger.getLogger(Coursemod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coursemod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coursemod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coursemod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coursemod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField CID;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Cname;
    private javax.swing.JButton Coursemod;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Fees;
    private javax.swing.JTextField Sub1;
    private javax.swing.JTextField Sub2;
    private javax.swing.JTextField Sub3;
    private javax.swing.JTextField Sub4;
    private javax.swing.JTextField TeachID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
