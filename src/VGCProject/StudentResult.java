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
public class StudentResult {
 
private int ID;
private int Subj1;
private int Subj2;
private int Subj3;
private int Subj4;

    


public StudentResult (int Id,int sub1,int sub2,int sub3,int sub4){
this.ID=Id;
this.Subj1=sub1;
this.Subj2=sub2;
this.Subj3=sub3;
this.Subj4=sub4;


}
public int getId(){
    
    return ID;
}
public int getSubj1(){
    
    return Subj1;
}
public int getSubj2(){
    
    return Subj2;
}
public int getSubj3(){
    
    return Subj3;
}

public int getSubj4(){
    
    return Subj4;
}





}