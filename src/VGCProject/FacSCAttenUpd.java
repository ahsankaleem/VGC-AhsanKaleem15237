
package VGCProject;

//import static VGCProject.Attendance1.DB_URL;
//import static VGCProject.StudentReg.DB_URL;
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
public class FacSCAttenUpd extends javax.swing.JFrame {

    /**
     * Creates new form SAttendance
     */
    int idd;
     Attendance1 attn = new Attendance1();
    public FacSCAttenUpd() {
        initComponents();
        
    }
 public FacSCAttenUpd(int a) {
        idd = a; 
        initComponents();
        label();
        
    }
 
    String Sub1;
    String Sub2;
    String Sub3;
    String Sub4;
    String CourseID;
    String Searchquery;
    private Connection conn=null;
    ResultSet rs;
    Statement st;

     public void ListUsers(int idds){
      
        String newid= String.valueOf(idds);
        try{
             conn = DatabaseConnection.getConnection();
            st= conn.createStatement();
            //int numid = Integer.parseInt(idds);
            
            
           Searchquery="SELECT Sub1,Sub2,Sub3,Sub4,CourseID from course WHERE CourseID IN (SELECT CourseID from students where SID="
               +newid+
               ");";
           
            rs = st.executeQuery(Searchquery);
   while (rs.next()) {
              this.Sub1=rs.getString("Sub1");
              this.Sub2=rs.getString("Sub2");
              this.Sub3=rs.getString("Sub3");
              this.Sub4=rs.getString("Sub4");
              this.CourseID=rs.getString("CourseID");
   }
               
        
        
        
        
        
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
    }
     public void label(){
        
        ListUsers(idd);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        jTextSub1 = new javax.swing.JTextField();
        jTextSub2 = new javax.swing.JTextField();
        jTextSub3 = new javax.swing.JTextField();
        jTextSub4 = new javax.swing.JTextField();
        sub1 = new javax.swing.JLabel();
        sub2 = new javax.swing.JLabel();
        sub3 = new javax.swing.JLabel();
        sub4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SID1 = new javax.swing.JLabel();
        test = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jTextSub1.setText(" ");
        jTextSub1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextSub1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTextSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSub1ActionPerformed(evt);
            }
        });

        jTextSub2.setText(" ");
        jTextSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSub2ActionPerformed(evt);
            }
        });

        jTextSub3.setText(" ");

        jTextSub4.setText(" ");

        sub1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sub1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        sub2.setText("       ");
        sub2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sub2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        sub3.setText("       ");
        sub3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sub3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        sub4.setText("     ");
        sub4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sub4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Add Attendance");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SID1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SID1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        test.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                testAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sub2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(sub3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSub2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSub3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sub4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(test, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(SID1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SID1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sub3)
                            .addComponent(jTextSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sub4)
                            .addComponent(jTextSub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(submit)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Facattendanceup back =  new Facattendanceup();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sub1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sub1AncestorAdded
        // TODO add your handling code here:
  
         this.sub1.setText(Sub1);
        
    }//GEN-LAST:event_sub1AncestorAdded

    private void jTextSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSub2ActionPerformed

    private void sub2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sub2AncestorAdded
        // TODO add your handling code here:
        
         sub2.setText(String.valueOf(Sub2));
    }//GEN-LAST:event_sub2AncestorAdded

    private void sub3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sub3AncestorAdded
        // TODO add your handling code here:
        
        sub3.setText(String.valueOf(Sub3));
    }//GEN-LAST:event_sub3AncestorAdded

    private void sub4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sub4AncestorAdded
        // TODO add your handling code here:
        
        sub4.setText(String.valueOf(Sub4));
    }//GEN-LAST:event_sub4AncestorAdded

    private void jTextSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSub1ActionPerformed

    private void jTextSub1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextSub1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextSub1AncestorAdded

    private void SID1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SID1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SID1AncestorAdded

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String SID = String.valueOf(idd);
        String StudenID=SID;
        String subj1=jTextSub1.getText();
        String subj2=jTextSub2.getText();
        String subj3=jTextSub3.getText();
        String subj4=jTextSub4.getText();
        String courseid=this.CourseID;
        
        
        try {
        int crsid=Integer.parseInt(CourseID);
            
        conn = DatabaseConnection.getConnection();
        
        try (PreparedStatement checkAccountExists = conn.prepareStatement(
                
        "SELECT SID FROM studentattendance WHERE SID = ?")) {
    checkAccountExists.setInt(1, idd);

    try (ResultSet rs = checkAccountExists.executeQuery()) {
        
         if (rs.next()) {
             
       if(idd<0){
           JOptionPane.showMessageDialog(null, "Invalid Student ID:");
       }
       if(subj1==null){
           JOptionPane.showMessageDialog(null, "Invalid EntrySubject1:");
       }
       if(subj2==null){
           JOptionPane.showMessageDialog(null, "Invalid Entry Subject2:");
       }
       if(subj3==null){
           JOptionPane.showMessageDialog(null, "Invalid Entry Subject3:");
       }
       if(subj4==null){
           JOptionPane.showMessageDialog(null, "Invalid Entry Subject4:");
       }
       if(crsid<0){
           JOptionPane.showMessageDialog(null, "Invalid Entry Course ID:");
       }
        st= conn.createStatement();

        String sql = "UPDATE Studentattendance SET SID= ?,Sub1=?,Sub2=?,Sub3=?,Sub4=?,CourseID=? WHERE SID=" +idd+";";
        
       
       PreparedStatement pst ;
       pst= conn.prepareStatement(sql);

pst.setString(1, StudenID);
pst.setString(2, subj1);
pst.setString(3, subj2);
pst.setString(4, subj3);
pst.setString(5, subj4);
pst.setString(6, courseid);

pst.execute(); 
       
       
       JOptionPane.showMessageDialog(null, "Successfully Added!");
       

         }else{
         JOptionPane.showMessageDialog(null, "This Student isn't Already Added!");
             
         }
    }
      
        }
       
       
    } catch (SQLException ex) {
            Logger.getLogger(StudentReg.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_submitActionPerformed

    private void testAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_testAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_testAncestorAdded

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
            java.util.logging.Logger.getLogger(FacSCAttenUpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacSCAttenUpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacSCAttenUpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacSCAttenUpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FacSCAttenUpd().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SID1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextSub1;
    private javax.swing.JTextField jTextSub2;
    private javax.swing.JTextField jTextSub3;
    private javax.swing.JTextField jTextSub4;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel sub3;
    private javax.swing.JLabel sub4;
    private javax.swing.JButton submit;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
