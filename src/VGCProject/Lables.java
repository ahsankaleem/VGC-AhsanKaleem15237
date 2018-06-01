/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VGCProject;

/**
 *
 * @author Ahsan Kaleem 15237
 * 
 */
public class Lables {
    String Lable1;
   String Lable2;
   String Lable3;
   String Lable4;
    public  Lables(){
        
    }
    public Lables(String label1,String label2, String label3, String label4){
        
        Lable1=label1;
        Lable2=label2;
        Lable3=label3;
        Lable4=label4;
    }
    
    public String getSub1 (){
        
        return Lable1;
    }
     public String getSub2 (){
        
        return Lable2;
    }
      public String getSub3 (){
        
        return Lable3;
    }
       public String getSub4 (){
        
        return Lable4;
    }
    
}
