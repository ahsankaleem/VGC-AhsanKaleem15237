package VGCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Adminlogin extends javax.swing.JFrame {

    /**
     * Author Ahsan Kaleem 15237 -- Creates new form loginPage
     */

    public Adminlogin() {
        initComponents();
    }
    //Definin Variables
    String Sub2;
    private Connection conn=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        userpassword = new javax.swing.JTextField();
        loginsubmit = new javax.swing.JButton();
        loginexit = new javax.swing.JButton();
        loginback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login ");
        setAlwaysOnTop(true);

        jLabel1.setText("Username: ");

        jLabel2.setText("Password: ");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        loginsubmit.setText("Submit");
        loginsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsubmitActionPerformed(evt);
            }
        });

        loginexit.setText("Exit");
        loginexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginexitActionPerformed(evt);
            }
        });

        loginback.setText("Back");
        loginback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbackActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Login Information");

        welcome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        welcome.setText(" Administrator Login");
        welcome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                welcomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        welcome.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                welcomeComponentShown(evt);
            }
        });
        welcome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                welcomeInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginsubmit)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginexit)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(loginsubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginexit)
                    .addComponent(loginback))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsubmitActionPerformed
        // TODO add your handling code here:
        
        conn= DatabaseConnection.getConnection();
        
        String abs =username.getText();
        
        //String password="aki";
        String a = username.getText();
        String jpasswod = userpassword.getText();
        try{
            int adminid = Integer.parseInt(a);
        Sub2=a;
   
       
        PreparedStatement ps;
        
        
       
        try (PreparedStatement checkAccountExists = conn.prepareStatement(
                
        "SELECT AdminID FROM admin WHERE Pass='"+jpasswod+"' AND AdminID = ?")) {
    checkAccountExists.setInt(1, adminid);

    try (ResultSet rs = checkAccountExists.executeQuery()) {
        
         if (rs.next()) {
           
            // handle account already exists
           
        AdminDashb submitID = new AdminDashb();
        submitID.setVisible(true);
        this.setVisible(false);
        
        } else {
            JOptionPane.showMessageDialog(null, "Username or Password is incorrect!");
            }
         
         
         
        } catch(Exception e){
            
    }
}catch(Exception e){
    JOptionPane.showMessageDialog(null, "Incorrect info");
}}catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Value Not Found");
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_loginsubmitActionPerformed

    private void loginexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginexitActionPerformed
        // TODO add your handling code here:
        
        
        System.exit(0);
    }//GEN-LAST:event_loginexitActionPerformed

    private void loginbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbackActionPerformed
        // TODO add your handling code here:
        

        VGCMainint mainint =  new VGCMainint();
        mainint.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginbackActionPerformed

    private void welcomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_welcomeAncestorAdded
        // TODO add your handling code here:
      
    }//GEN-LAST:event_welcomeAncestorAdded

    private void welcomeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_welcomeComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_welcomeComponentShown

    private void welcomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_welcomeInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginback;
    private javax.swing.JButton loginexit;
    private javax.swing.JButton loginsubmit;
    private javax.swing.JTextField username;
    private javax.swing.JTextField userpassword;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
