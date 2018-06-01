package VGCProject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Kaleem 15237
 */
public class VGCLogin {
    
    int LoginID;
    String welcome1;
    String admin;
    
    

    public void loginid(int loginid) {
        this.LoginID=loginid;
         }
    
    public int getLoginId(){
        
        return LoginID;
    }
    
    public String getWelcom(){
        
        if (LoginID==1){
            welcome1="Adiministrator";
          }
          else if (LoginID==2){
            welcome1="Student";  
          }
          else if (LoginID==3){
            welcome1="Faculty";
          }else{
            welcome1="FAIL"; 
            }
        
        
        
        return welcome1;
    }
    
}
