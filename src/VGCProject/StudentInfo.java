
package VGCProject;

//import static VGCProject.Attendance1.DB_URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahsan Kaleem 15237
 */
public class StudentInfo extends javax.swing.JFrame {

    /**
     * Declaring Variables
     */
    
    String Searchquery;
    String Sub1;
    String Sub3;
    String Label;
    String column1;
    String column2;
    String column3;
    String column4;
    int idd;
    ResultSet rs;
    Statement st;
    private Connection conn=null;
    
     Studentlogin1 newid = new Studentlogin1();
         
    public StudentInfo() {
        initComponents();
        findUsers();
        
        
    }
    public StudentInfo(int id){
        initComponents();
        idd=id;
        findUsers();
        updTable();
        ColumnTitle();
        
    }
//Created a Array Method to read and store the Values
public ArrayList<user> ListUsers( int valtosearch){
        String userinput = String.valueOf(valtosearch);
        ArrayList usersList = new ArrayList<user>();
        Statement st;
        ResultSet rs;
        
        try{
            conn = DatabaseConnection.getConnection();
            st= conn.createStatement();
           Searchquery="SELECT * FROM students WHERE SID="+userinput+";";
           
            rs = st.executeQuery(Searchquery);
            
            user user;
            while (rs.next()){
                user = new user(
                rs.getInt("SID"),
                rs.getString("SName"),
                rs.getInt("SDOB"),
                rs.getString("SGender"),
                rs.getInt("Sphone"),
                rs.getString("SEmail"),
                rs.getInt("Year"),
                rs.getInt("CourseID"),
                rs.getString("Pass")        
                  //int Id,String name,int age,String gender,int phone,String email,int year,int courseID 
                        //SID SName SDOB SGender Sphone SEmail Year CourseID
                );
                 
           usersList.add(user);
                
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
        return usersList;
    }
 // Result Method
public ArrayList<StudentResult> StudResult( int valtosearch){
        String userinput = String.valueOf(valtosearch);
        ArrayList usersList = new ArrayList<StudentResult>();
        Statement st;
        ResultSet rs;
        
        try{
            conn = DatabaseConnection.getConnection();
            st= conn.createStatement();
           Searchquery="SELECT SID,Sub1,Sub2,Sub3,Sub4 FROM StudentAttendance WHERE SID="+userinput+";";
           
            rs = st.executeQuery(Searchquery);
            
            StudentResult StudentResult;
            while (rs.next()){
                StudentResult = new StudentResult(
                rs.getInt("SID"),
                rs.getInt("Sub1"),
                rs.getInt("Sub2"),
                rs.getInt("Sub3"),
                rs.getInt("Sub4")
                  //int Id,String name,int age,String gender,int phone,String email,int year,int courseID 
                        //SID SName SDOB SGender Sphone SEmail Year CourseID
                );
                 
           usersList.add(StudentResult);
                
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
        return usersList;
    }


// TO set General info Table and call the following method created
public void findUsers(){
       
        ArrayList<user> users = ListUsers(idd);
        DefaultTableModel model =new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","Name","Age","Gender","Phone","Email","Year","CourseID"});
        //int Id,String name,int age,String gender,int phone,String email,int year,int courseID
        Object[] row = new Object[8];
        for (int i=0; i<users.size(); i++){
            row[0]=users.get(i).getId();
            row[1]=users.get(i).getFname();
            row[2]=users.get(i).getAge();
            row[3]=users.get(i).getGender();
            row[4]=users.get(i).getPhone();
            row[5]=users.get(i).getEmail();
            row[6]=users.get(i).getYear();
            row[7]=users.get(i).getCourse();
            model.addRow(row);
        }
        jTable_Sinfo.setModel(model);
    }
//Getting Values from Database
public void ColumnTitle(){
     try{
            conn = DatabaseConnection.getConnection();
            st= conn.createStatement();
           String idtitle = String.valueOf(idd);
            
            
           Searchquery="SELECT Sub1,Sub2,Sub3,Sub4 from course WHERE CourseID IN (SELECT CourseID from students where SID="
               +idtitle+
               ");";
           
            rs = st.executeQuery(Searchquery);
   while (rs.next()) {
       
              this.column1=rs.getString("Sub1");
              this.column2=rs.getString("Sub2");
              this.column3=rs.getString("Sub3");
              this.column4=rs.getString("Sub4");
   }
               
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
}

//To Update the Table
public void updTable(){
       
       ColumnTitle();
        ArrayList<StudentResult> users = StudResult(idd);
        DefaultTableModel model =new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID",column1,column2,column3,column4});
        //int Id,String name,int age,String gender,int phone,String email,int year,int courseID
        Object[] row = new Object[5];
        for (int i=0; i<users.size(); i++){
            row[0]=users.get(i).getId();
            row[1]=users.get(i).getSubj1();
            row[2]=users.get(i).getSubj2();
            row[3]=users.get(i).getSubj3();
            row[4]=users.get(i).getSubj4();
            
            model.addRow(row);
        }
        jTable_Attendance.setModel(model);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Sinfo = new javax.swing.JTable();
        Exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Attendance = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        examscore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAutoscrolls(true);
        jPanel1.setName("Student Information"); // NOI18N

        jTable_Sinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "DOB", "Gender", "Phone", "EMaiil", "Year", "CourseID"
            }
        ));
        jTable_Sinfo.setToolTipText("");
        jTable_Sinfo.setDragEnabled(true);
        jTable_Sinfo.setName("Student Information"); // NOI18N
        jScrollPane1.setViewportView(jTable_Sinfo);

        Exit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Exit.setText("Exit");
        Exit.setAlignmentY(0.0F);
        Exit.setBorderPainted(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jTable_Attendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Course A", "Course B", "Course C", "Course D"
            }
        ));
        jScrollPane2.setViewportView(jTable_Attendance);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel1.setText("Student Genral Information");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel2.setText("Student Attendance CourseWise");

        examscore.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        examscore.setText("Exam Score");
        examscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examscoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(238, 238, 238))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(examscore)
                                .addGap(280, 280, 280))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(examscore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Exit)
                .addGap(9, 9, 9))
        );

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

        jPanel1.getAccessibleContext().setAccessibleName("Student Information");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Exit
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void examscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examscoreActionPerformed
        // TODO add your handling code here:
        conn= DatabaseConnection.getConnection();
        
        try (PreparedStatement checkAccountExists = conn.prepareStatement(
                
        "SELECT SID FROM studentresults WHERE SID = ?")) {
    checkAccountExists.setInt(1, idd);

    try (ResultSet rs1 = checkAccountExists.executeQuery()) {
        
         if (rs1.next()) {
            
        StudVresults Go1 =  new StudVresults(idd);
        Go1.setVisible(true);
        this.setVisible(false);
             
         }else{
             
              JOptionPane.showMessageDialog(null, "Your Result is not Available");
         }
         }  catch (SQLException ex) {
                Logger.getLogger(StudentInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
        
        
    }//GEN-LAST:event_examscoreActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton examscore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Attendance;
    private javax.swing.JTable jTable_Sinfo;
    // End of variables declaration//GEN-END:variables
}
