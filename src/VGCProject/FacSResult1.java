
package VGCProject;

//import static VGCProject.StudentUpd1.DB_URL;
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
public class FacSResult1 extends javax.swing.JFrame {

    /**
     * Creates new form SResult
     */
    public FacSResult1() {
        initComponents();
    }

    

// Database credentials
 
    static final String DEFAULT_QUERY = "SELECT * from students";
    private Connection conn = null;
    Statement stmt = null;
    String Student_Name = null, Student_Class = null;
    private Statement statement;
    private ResultSet resultSet;
    private boolean connectedToDatabase = false;
    private int numberOfRows;
    private ResultSetMetaData metaData;
    private static StudentUpd1 tableModel;
    private boolean isempty = false;
    String STID;
    String Searchquery;
     // Created  Variables for Table Column Name
         String StudName1;
         int id;
         String RSub1A1;
                  String RSub1A2;
         String RSub1A3;
         String RSub1E;
         String RSub2A1;
         String RSub2A2;
         String RSub2A3;
         String RSub2E;
         String RSub3A1;
         String RSub3A2;
         String RSub3A3;
         String RSub3E;
         String RSub4A1;
         String RSub4A2;
         String RSub4A3;
         String RSub4E;
         
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sub1A1 = new javax.swing.JTextField();
        Sub1A2 = new javax.swing.JTextField();
        Sub1A3 = new javax.swing.JTextField();
        Sub1E = new javax.swing.JTextField();
        Sub2A2 = new javax.swing.JTextField();
        Sub2A3 = new javax.swing.JTextField();
        Sub3A1 = new javax.swing.JTextField();
        Sub2A1 = new javax.swing.JTextField();
        Sub2E = new javax.swing.JTextField();
        Sub3A3 = new javax.swing.JTextField();
        Sub3A2 = new javax.swing.JTextField();
        Sub3E = new javax.swing.JTextField();
        Sub4A2 = new javax.swing.JTextField();
        Sub4E = new javax.swing.JTextField();
        Sub4A3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Sub4A1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Subject 1");

        jLabel2.setText("Assignment1");

        jLabel3.setText("Assignment 2");

        jLabel4.setText("Assignment 3");

        jLabel5.setText(" Exam");

        Sub1A1.setText("  ");

        Sub1A2.setText(" ");

        Sub1A3.setText(" ");

        Sub1E.setText(" ");

        Sub2A2.setText(" ");

        Sub2A3.setText(" ");

        Sub3A1.setText("  ");

        Sub2A1.setText("  ");

        Sub2E.setText(" ");

        Sub3A3.setText(" ");

        Sub3A2.setText(" ");

        Sub3E.setText(" ");

        Sub4A2.setText(" ");

        Sub4E.setText(" ");

        Sub4A3.setText(" ");

        jLabel6.setText("Subject 2");

        jLabel7.setText("Subject 3");

        jLabel8.setText("Subject 4");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Submit.setText("Update Result");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel9.setText("Student ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submit)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sub2A1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Sub3A1)
                                    .addComponent(Sub1A1)
                                    .addComponent(Sub4A1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sub1A2)
                            .addComponent(Sub2A2)
                            .addComponent(Sub3A2)
                            .addComponent(Sub4A2)
                            .addComponent(SID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Sub4A3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sub3A3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sub1A3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sub2A3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sub1E, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(Sub2E)
                                    .addComponent(Sub3E)
                                    .addComponent(Sub4E))))
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Sub1A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub1A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub1A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sub2A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Sub2A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub2A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub2E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sub3A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Sub3A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub3A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub3E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Sub4A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub4A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub4E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub4A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(Submit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Exit
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FacDashb1 back =  new FacDashb1();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
       
        //Creating Local Variable to feed the Table
  
         try {
              int  StuID=Integer.parseInt(SID.getText());
              this.id=StuID;
 String Sub1A11=Sub1A1.getText();
 this.RSub1A1=Sub1A11;
  String Sub1A21=Sub1A2.getText();
 this.RSub1A2=Sub1A21;
 String Sub1A31=Sub1A3.getText();
 this.RSub1A3=Sub1A31;
 String Sub1E1=Sub1E.getText();
 this.RSub1E=Sub1E1;
 
 String Sub2A11=Sub2A1.getText();
 this.RSub2A1=Sub2A11;
String Sub2A21=Sub2A2.getText();
this.RSub2A2=Sub2A21;
String Sub2A31=Sub2A3.getText();
this.RSub2A3=Sub2A31;
 String Sub2E1=Sub2E.getText();
 this.RSub2E=Sub2E1;
 
 String Sub3A11=Sub3A1.getText();
 this.RSub3A1=Sub3A11;
 String Sub3A21=Sub3A2.getText();
 this.RSub3A2=Sub3A21;
 String Sub3A31=Sub3A3.getText();
 this.RSub3A3=Sub3A31;
String Sub3E1=Sub3E.getText();
this.RSub3E=Sub3E1;

String Sub4A11=Sub4A1.getText();
this.RSub4A1=Sub4A11;
 String Sub4A21=Sub4A2.getText();
 this.RSub4A2=Sub4A21;
 String Sub4A31=Sub4A3.getText();
 this.RSub4A3=Sub4A31;
String Sub4E1=Sub4E.getText();
this.RSub4E=Sub4E1;
 
 

         
         } catch(NumberFormatException e){
             
             
         }
         
       
         
         
        try {
            
         conn= DatabaseConnection.getConnection();
             
   // Excute query
        stmt = conn.createStatement();
        
        //
        try {
            PreparedStatement StudentID = conn.prepareStatement("SELECT SID FROM Students WHERE SID = ?;"); 
    StudentID.setInt(1, id);
            
    try{
           ResultSet rs = StudentID.executeQuery();
           

         if (rs.next()) {
           
            // handle account already exists
            
           
         
         
        String sql1 = "INSERT INTO studentresults (ResultDesc,Assignment1,Assignment2,Assignment3,Exam, SubjectID,SID)"
                + " VALUES(?,?,?,?,?,?,?);";
       
       PreparedStatement pst ;
       PreparedStatement pst2 ;
       PreparedStatement pst3 ;
       PreparedStatement pst4 ;
       pst= conn.prepareStatement(sql1);

pst.setString(1, "General");
pst.setString(2, RSub1A1);
pst.setString(3, RSub1A2);
pst.setString(4, RSub1A3);
pst.setString(5, RSub1E);
pst.setInt(6, 1);
pst.setInt(7, id);
pst.execute(); 

pst2= conn.prepareStatement(sql1);

pst2.setString(1, "General");
pst2.setString(2,  RSub2A1);
pst2.setString(3,  RSub2A2);
pst2.setString(4,  RSub2A3);
pst2.setString(5,  RSub2E);
pst2.setInt(6, 2);
pst2.setInt(7, id);
pst2.execute(); 

pst3= conn.prepareStatement(sql1);

pst3.setString(1, "General");
pst3.setString(2,  RSub3A1);
pst3.setString(3,  RSub3A2);
pst3.setString(4,  RSub3A3);
pst3.setString(5,  RSub3E);
pst3.setInt(6, 3);
pst3.setInt(7, id);
pst3.execute(); 

pst4= conn.prepareStatement(sql1);

pst4.setString(1, "General");
pst4.setString(2, RSub4A1);
pst4.setString(3,  RSub4A2);
pst4.setString(4,  RSub4A3);
pst4.setString(5, RSub4E);
pst4.setInt(6, 4);
pst4.setInt(7, id);
pst4.execute(); 
        
            JOptionPane.showMessageDialog(null, "Successfully Added.");
            AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);
        
        
        } else {
            JOptionPane.showMessageDialog(null, "Fill All the fields and check id:");
            }
    } catch (Exception e){
        
    }
        
                
// Check Statements for Updating the specific feilds 

        

    } catch (SQLException ex) {
            Logger.getLogger(StudentUpd1.class.getName()).log(Level.SEVERE, null, ex);
        }} catch (Exception e){
            
        }
    
        
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(FacSResult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacSResult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacSResult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacSResult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacSResult1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SID;
    private javax.swing.JTextField Sub1A1;
    private javax.swing.JTextField Sub1A2;
    private javax.swing.JTextField Sub1A3;
    private javax.swing.JTextField Sub1E;
    private javax.swing.JTextField Sub2A1;
    private javax.swing.JTextField Sub2A2;
    private javax.swing.JTextField Sub2A3;
    private javax.swing.JTextField Sub2E;
    private javax.swing.JTextField Sub3A1;
    private javax.swing.JTextField Sub3A2;
    private javax.swing.JTextField Sub3A3;
    private javax.swing.JTextField Sub3E;
    private javax.swing.JTextField Sub4A1;
    private javax.swing.JTextField Sub4A2;
    private javax.swing.JTextField Sub4A3;
    private javax.swing.JTextField Sub4E;
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
