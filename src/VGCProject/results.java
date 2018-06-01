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
public class results {
 
private int ID;
private String ResultDesc;
private int Assignment1;
private int Assignment2;
private int Assignment3;
private int Exam;
private int SubjectID;
private int SID;

//ResultID,ResultDesc,Assignment1,Assignment2,Assignment3,Exam,SubjectID,SID

public results (int Id,String resultD,int assign1,int assign2,int assign3,int exam,int SubjectID,int SID){
this.ID=Id;
this.ResultDesc=resultD;
this.Assignment1=assign1;
this.Assignment2=assign2;
this.Assignment3=assign3;
this.Exam=exam;
this.SubjectID=SubjectID;
this.SID=SID;

}
public int getId(){
    
    return ID;
}
public String getResultDesc(){
    
    return ResultDesc;
}
public int Assignment1(){
    
    return Assignment1;
}
public int getAssignment2(){
    
    return Assignment2;
}


public int getAssignment3(){
    
    return Assignment3;
}
public int getExam(){
    
    return Exam;
}
public int getSubjectID(){
    
    return SubjectID;
}

public int getSID(){
    
    return SID;
}

//


}