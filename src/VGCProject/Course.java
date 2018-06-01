package VGCProject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Kaleem
 */
public class Course {
 
private int ID;
private String Name;
private int Fees;
private String Sub1;
private String Sub2;
private String Sub3;
private String Sub4;
private int TeacherID;

    


public Course (int Id,String name,int fee,String sub1,String sub2,String sub3,String sub4,int teachid){
this.ID=Id;
this.Name=name;
this.Fees=fee;
this.Sub1=sub1;
this.Sub2=sub2;
this.Sub3=sub3;
this.Sub4=sub4;
this.TeacherID= teachid;

}
public int getId(){
    
    return ID;
}
public String getCname(){
    
    return Name;
}
public int getFees(){
    
    return Fees;
}
public String getSub1(){
    
    return Sub1;

}

public String getSub2(){
    
    return Sub2;
}
public String getSub3(){
    
    return Sub3;
}
public String getSub4(){
    
    return Sub4;
}
public int getTeacherID(){
    
    return TeacherID;
}


//


}