package VGCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ahsan Kaleem 15237
 */
public class TeacSearch1 extends javax.swing.JFrame {

    
    public TeacSearch1() {
        initComponents();
        findUsers();
    }
   
 
    int ButtonId=0;
    String Searchquery;
   private Connection conn=null;
    
   public ArrayList<Teacher> ListUsers(int id, String valtosearch){
        ArrayList usersList = new ArrayList<Teacher>();
        Statement st;
        ResultSet rs;
        
        try{
             conn = DatabaseConnection.getConnection();
            st= conn.createStatement();
            if (id==0){
                Searchquery="SELECT * FROM teacher WHERE CONCAT(TeacherID,TName,DOB,Gender,Phone,Email,HEducation,Department) LIKE '%"+valtosearch+"%';";
            }else if(id==2){
            Searchquery="SELECT * FROM teacher WHERE TeacherID="+valtosearch+";";
        }
            
           
            rs = st.executeQuery(Searchquery);
            
            Teacher Teacher;
            while (rs.next()){
                Teacher = new Teacher(
                rs.getInt("TeacherID"),
                rs.getString("TName"),
                rs.getInt("DOB"),
                rs.getString("Gender"),
                rs.getInt("Phone"),
                rs.getString("Email"),
                rs.getString("HEducation"),
                rs.getString("Department"),
                rs.getString("pass")
                 
                );
                 
           usersList.add(Teacher);
                
            }
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
        return usersList;
    }
public void findUsers(){
        ArrayList<Teacher> Teachers = ListUsers(ButtonId,jText_Search.getText());
        DefaultTableModel model =new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"TeacherID","Name","Age","Gender","Phone","Email","Education","Department","Password"});
        
        Object[] row = new Object[9];
        for (int i=0; i<Teachers.size(); i++){
            row[0]=Teachers.get(i).getId();
            row[1]=Teachers.get(i).getFname();
            row[2]=Teachers.get(i).getAge();
            row[3]=Teachers.get(i).getGender();
            row[4]=Teachers.get(i).getPhone();
            row[5]=Teachers.get(i).getEmail();
            row[6]=Teachers.get(i).getTedu();
            row[7]=Teachers.get(i).getDepartment();
            row[8]=Teachers.get(i).getPass();
            model.addRow(row);
        }
        jTable_Users.setModel(model);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_Search = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "DOB", "Gender", "Phone", "Email", "Year", "Course", "Password"
            }
        ));
        jTable_Users.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_UsersFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users);
        if (jTable_Users.getColumnModel().getColumnCount() > 0) {
            jTable_Users.getColumnModel().getColumn(3).setResizable(false);
            jTable_Users.getColumnModel().getColumn(5).setResizable(false);
            jTable_Users.getColumnModel().getColumn(8).setResizable(false);
        }

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("By Student ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Search Student");

        jText_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_SearchActionPerformed(evt);
            }
        });

        jButton3.setText("General Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Exit button
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jText_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_SearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jText_SearchActionPerformed

    private void jTable_UsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_UsersFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_UsersFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ButtonId=0;
        findUsers();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ButtonId=2;
        findUsers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AdminDashb back =  new AdminDashb();
        back.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(TeacSearch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacSearch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacSearch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacSearch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacSearch1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField jText_Search;
    // End of variables declaration//GEN-END:variables
}
