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
 * 
 */
public class StudentReg extends javax.swing.JFrame {

   
// Uni Variable Identified
   
    static final String DEFAULT_QUERY = "SELECT * from students";
    private Connection conn = null;
    Statement stmt = null;
    String Student_Name = null, Student_Class = null;
    private Statement statement;
    private ResultSet resultSet;
    private boolean connectedToDatabase = false;
    private int numberOfRows;
    private ResultSetMetaData metaData;
    private static StudentReg tableModel;
    int Scid;
    int id;
    int spnum;
    int syear;
    int sdob;
    
    public StudentReg() {
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
        Sname = new javax.swing.JTextField();
        SID = new javax.swing.JTextField();
        SGender = new javax.swing.JTextField();
        SDOB = new javax.swing.JTextField();
        CourseID = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        CourseAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Pnum = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel1.setText("Student Name: ");

        jLabel2.setText("Course ID:");

        jLabel3.setText("Year:");

        jLabel6.setText("Student ID:");

        jLabel7.setText("Gender:");

        jLabel8.setText("DOB:");

        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });

        SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDActionPerformed(evt);
            }
        });

        SGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SGenderActionPerformed(evt);
            }
        });

        CourseAdd.setText("Submit");
        CourseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("New Student Registeration");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone:");

        jLabel10.setText("Email:");

        jLabel4.setText("Password:");

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
                        .addComponent(CourseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(SGender)
                    .addComponent(SDOB)
                    .addComponent(CourseID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SID)
                    .addComponent(Sname)
                    .addComponent(Year)
                    .addComponent(Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CourseAdd))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         // Exit:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void CourseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseAddActionPerformed
        // TODO add your handling code here:
         
        
         String Studentname= Sname.getText();
         String StudenID= SID.getText();
         String StudenGender= SGender.getText();
         String StudenDOB= SDOB.getText();
         String StudenCourseID= CourseID.getText();
         String StudenYear= Year.getText();
         String StudenPnumb= Pnum.getText();
         String StudenEmail= Email.getText();
         String passw = password.getText();
     
         
        try {
            conn= DatabaseConnection.getConnection();
      
// Excute query
        stmt = conn.createStatement();

         try {
           int ids = Integer.parseInt(SID.getText());
           this.id=ids;
           int Scids= Integer.parseInt(CourseID.getText());
           this.Scid=Scids;
           int pnum = Integer.parseInt(Pnum.getText());
           this.spnum=pnum;
           int stuyear= Integer.parseInt(Year.getText());
           this.syear=stuyear;
           int sdatob = Integer.parseInt(SDOB.getText());
           this.sdob=sdatob;

            PreparedStatement StudentID = conn.prepareStatement("SELECT SID FROM Students WHERE SID = ?;"); 
    StudentID.setInt(1, id);
            PreparedStatement CourseID = conn.prepareStatement("SELECT CourseID FROM course WHERE CourseID = ?;"); 
    
    CourseID.setInt(1, Scid);
    try{
           ResultSet rs = StudentID.executeQuery();
           ResultSet rs2 = CourseID.executeQuery();

         if (rs.next()) {
           JOptionPane.showMessageDialog(null, "Student ID Already Exist ");
            // handle account already exists  && rs2.next()
         }else {
             if (rs2.next()){
           
         if(Studentname==null){
             //this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter Student Name: ");
         }
             
         if (StudenGender==null){
            //this.STID = "0";
            JOptionPane.showMessageDialog(null, "Please Enter the Gender ");
         }
          if (sdob<=0){
             //this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter the Student Age ");
         }
         if (Scid<=0){
             //this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter the Valid Course ID ");
         }
         if (syear<=0){
           //this.STID = "0";
           JOptionPane.showMessageDialog(null, "Please Enter Student Year");
         }
         if(spnum<=0){
            // this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter Student Phone Number");
         }
       if (StudenEmail==null){
           JOptionPane.showMessageDialog(null, "Please Enter Student Email");
            
            //this.STID = "0";
         }
         if (passw==null){
             
             //this.STID = "0";
         }


        
        
        String sql = "INSERT INTO students (SID,Sname,SDOB,SGender,SPhone,SEmail,Year,CourseID,Pass)" +
        "VALUES (?,?,?,?,?,?,?,?, ?)";
       
       PreparedStatement pst ;
       pst= conn.prepareStatement(sql);

pst.setString(1, StudenID);
pst.setString(2, Studentname);
pst.setString(3, StudenDOB);
pst.setString(4, StudenGender);
pst.setString(5, StudenPnumb);
pst.setString(6, StudenEmail);
pst.setString(7, StudenYear);
pst.setString(8, StudenCourseID);
pst.setString(9, passw);
pst.execute(); 

          JOptionPane.showMessageDialog(null, "Successfully Added.");
       AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);


         }else{
                 JOptionPane.showMessageDialog(null, "Course Doesn't Exist");
             }}
    } catch (Exception e){
        
    }
         } catch(NumberFormatException e){
             
         }
    } catch (SQLException ex) {
            Logger.getLogger(StudentReg.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    
  
    }//GEN-LAST:event_CourseAddActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TO Clear The fields:
        Sname.setText("");
        SID.setText("");
        password.setText("");
        SGender.setText("");
        SDOB.setText("");
        CourseID.setText("");
        Year.setText("");
        Pnum.setText("");
        Email.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void SGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SGenderActionPerformed

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
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton CourseAdd;
    private javax.swing.JTextField CourseID;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Pnum;
    private javax.swing.JTextField SDOB;
    private javax.swing.JTextField SGender;
    private javax.swing.JTextField SID;
    private javax.swing.JTextField Sname;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
