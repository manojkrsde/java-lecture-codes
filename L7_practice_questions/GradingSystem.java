package L7_practice_questions;

public class GradingSystem {

    // Method to return grade based on marks
    public static String getGrage(int marks){
        String grade="Fail";
        if(marks>80){
            grade="A";
        }else if(marks>70){
            grade="B";
        }else if(marks>60){
            grade="C";
        }
        return  grade;
    }


    public static void main(String[] args) {
        // Step 1: Take input marks for 5 students using loop
        // Step 2: Call getGrade() for each student
        // Step 3: Display each student’s grade
        int[] marks={80,60,50,70,85};
        for (int i=0;i<marks.length;i++){
            System.out.println("Grade for marks : "+marks[i]+" => "+getGrage(marks[i]));
        }


    }
}
