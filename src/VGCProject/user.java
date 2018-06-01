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
public class user {
 
private int ID;
private String Name;
private int Age;
private String Gender;
private int Phone;
private String Email;
private int Year;
private int CourseID;
private String Pass;
    


public user (int Id,String name,int age,String gender,int phone,String email,int year,int courseID,String pass){
this.ID=Id;
this.Name=name;
this.Age=age;
this.Gender=gender;
this.Phone=phone;
this.Email=email;
this.Year=year;
this.CourseID= courseID;
this.Pass=pass;

}
public int getId(){
    
    return ID;
}
public String getFname(){
    
    return Name;
}
public int getAge(){
    
    return Age;
}
public String getGender(){
    
    return Gender;
}


public int getPhone(){
    
    return Phone;
}
public String getEmail(){
    
    return Email;
}
public int getYear(){
    
    return Year;
}
public int getCourse(){
    
    return CourseID;
}
public String getPass(){
    
    return Pass;
}

//


}