package com.company.Java;


public class StudentMarks1 {
    public String takeInput(int numOfStudents,int[] stuGrades){
        for(int index=0;index<numOfStudents;index++){
            try{
                if(stuGrades[index]<0 || stuGrades[index]>100) {
                    throw new MarksOutOfRange(stuGrades[index]);
                }
            }
            catch (MarksOutOfRange marksOutOfRange) {
                marksOutOfRange.printStackTrace();
                return "error";
            }

        }
        return "no error";
    }
}
