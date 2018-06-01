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
public class TeacherReg1 extends javax.swing.JFrame {

   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
   //Uni Veriable defined";


    static final String DEFAULT_QUERY = "SELECT * from students";
    Connection conn = null;
    Statement stmt = null;
    String Student_Name = null, Student_Class = null;
    private Statement statement;
    private ResultSet resultSet;
    private boolean connectedToDatabase = false;
    private int numberOfRows;
    private ResultSetMetaData metaData;
    private static TeacherReg1 tableModel;
    String Scid;
    int id;
    int spnum;
    String Teducation;
    int sdob;
    
    public TeacherReg1() {
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
        Tname = new javax.swing.JTextField();
        TID = new javax.swing.JTextField();
        TGender = new javax.swing.JTextField();
        TDOB = new javax.swing.JTextField();
        TDepartment = new javax.swing.JTextField();
        TEdu = new javax.swing.JTextField();
        CourseAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TPnum = new javax.swing.JTextField();
        TEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel1.setText("Teacher Name: ");

        jLabel2.setText("Department:");

        jLabel3.setText("Education:");

        jLabel6.setText("Teacher ID:");

        jLabel7.setText("Gender:");

        jLabel8.setText("Age:");

        Tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnameActionPerformed(evt);
            }
        });

        TID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDActionPerformed(evt);
            }
        });

        TGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TGenderActionPerformed(evt);
            }
        });

        CourseAdd.setText("Submit");
        CourseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("New Teacher Registeration");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone:");

        jLabel10.setText("Email:");

        jLabel4.setText("Password:");

        jLabel11.setText("ie.. 25,38");

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
                    .addComponent(TGender)
                    .addComponent(TDOB)
                    .addComponent(TDepartment, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TID)
                    .addComponent(Tname)
                    .addComponent(TEdu)
                    .addComponent(TPnum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void TIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIDActionPerformed

    private void TnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnameActionPerformed

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
         
        //
        
         String Teachername= Tname.getText();
         String TeacherID= TID.getText();
         String TeacherGender= TGender.getText();
         String TeacherDOB= TDOB.getText();
         String TeacherDep= TDepartment.getText();
         String TeacherEd= TEdu.getText();
         String TeacherPnumb= TPnum.getText();
         String TeacherEmail= TEmail.getText();
         String Teacherpassw = Tpassword.getText();
     
         
        try {
 
        
        conn = DatabaseConnection.getConnection();
      

       
        //  Excute query
        stmt = conn.createStatement();

         try {
           int ids = Integer.parseInt(TID.getText());
           this.id=ids;
           String Scids=TDepartment.getText();
           this.Scid=Scids;
           int pnum = Integer.parseInt(TPnum.getText());
           this.spnum=pnum;
           String Tedu = TEdu.getText();
           this.Teducation=Tedu;
           int Tdatob = Integer.parseInt(TDOB.getText());
           this.sdob=Tdatob;

            PreparedStatement TeacherIDs = conn.prepareStatement("SELECT TeacherID FROM teacher WHERE TeacherID = ?;"); 
    TeacherIDs.setInt(1, id);
           
    try{
           ResultSet rs = TeacherIDs.executeQuery();

         if (rs.next()) {
           JOptionPane.showMessageDialog(null, "Teacher ID Already Exist ");
            // handle account already exists  && rs2.next()
         }else{
           
         if(Teachername==null){
             //this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter Teacher Name: ");
         }
             
         if (TeacherGender==null){
            //this.STID = "0";
            JOptionPane.showMessageDialog(null, "Please Enter the Gender ");
         }
          if (sdob<=0){
             //this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter the Teacher Age ");
         }
         if (Scid==null){
             //this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter the Valid Course ID ");
         }
         if (Teducation==null){
           //this.STID = "0";
           JOptionPane.showMessageDialog(null, "Please Enter Teacher Education");
         }
         if(spnum<=0){
            // this.STID = "0";
             JOptionPane.showMessageDialog(null, "Please Enter Teacher Phone Number");
         }
       if (TeacherEmail==null){
           JOptionPane.showMessageDialog(null, "Please Enter Teacher Email");
            
            //this.STID = "0";
         }
         if (Teacherpassw==null){
             
             //this.STID = "0";
         }


        
        
        
        
        String sql = "INSERT INTO teacher (TeacherID,TName,DOB,Gender,Phone,Email,HEducation,Department,Pass)" +
        "VALUES (?,?,?,?,?,?,?,?, ?)";
       
       PreparedStatement pst ;
       pst= conn.prepareStatement(sql);

pst.setString(1, TeacherID);
pst.setString(2, Teachername);
pst.setString(3, TeacherDOB);
pst.setString(4, TeacherGender);
pst.setString(5, TeacherPnumb);
pst.setString(6, TeacherEmail);
pst.setString(7, TeacherEd);
pst.setString(8, TeacherDep);
pst.setString(9, Teacherpassw);
pst.execute(); 

          JOptionPane.showMessageDialog(null, "Successfully Added.");
       AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);


         }} catch (Exception e){
             
    } 
         } catch(NumberFormatException e){
             
         }
    } catch (SQLException ex) {
            Logger.getLogger(TeacherReg1.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    
  
    }//GEN-LAST:event_CourseAddActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TO Clear The fields:
        Tname.setText("");
        TID.setText("");
        Tpassword.setText("");
        TGender.setText("");
        TDOB.setText("");
        TDepartment.setText("");
        TEdu.setText("");
        TPnum.setText("");
        TEmail.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void TGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TGenderActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherReg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherReg1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton CourseAdd;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField TDOB;
    private javax.swing.JTextField TDepartment;
    private javax.swing.JTextField TEdu;
    private javax.swing.JTextField TEmail;
    private javax.swing.JTextField TGender;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField TPnum;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Tpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
