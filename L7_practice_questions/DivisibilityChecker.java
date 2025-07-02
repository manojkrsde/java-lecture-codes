package L7_practice_questions;

import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        // Step 1: Take input number from the user
        // Step 2: Check if it's divisible by 3 and/or 5 using logical operators
        // Step 3: Display messages accordingly using if-else
        // Step 4: Repeat the logic using ternary operator (for practice)

        // 5/3=> 1, rem 2, remainder 0, 4/2 2,0
        // 3 =>
        // 5 =>
        // 3 and 5 => 15, 3 & 5, 5
        //if else, else if, else

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of your choice : ");
        int num=sc.nextInt();

        //25
        if(num%3==0 && num%5==0){
            //conditional and operator if both the input are true=> True ,
            //if either of the input is false, we will get false
            System.out.println("Divided by both 3 and 5");
        }else if(num%3==0){
            System.out.println("Divided by 3");
        }else if(num%5==0){
            System.out.println("Divided by 5");
        }else {
            System.out.println("Divided by neither 5 nor 3");
        }

        sc.close();
    }
}
