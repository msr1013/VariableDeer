package elseif;

import java.util.Scanner;

public class GradeMarks {
    public void CalculateGrade(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in Science");
        float scienceMarks = sc.nextFloat();

        System.out.println("Enter marks in Maths");
        float mathMarks = sc.nextFloat();

        String grade;

        if (scienceMarks >=90 & mathMarks >=90){
            grade="A";
        }
        else if(scienceMarks>=80 & mathMarks >=80){
            grade="B";
        }
        else if(scienceMarks>=70 & mathMarks >=70){
            grade="C";
        }
        else if(scienceMarks>=70 & mathMarks >=70){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("Grade:"+grade);


    }
}
