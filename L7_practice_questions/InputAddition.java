package L7_practice_questions;

import java.util.Scanner;

public class InputAddition {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to take user input
        // Step 2: Prompt the user to enter two numbers
        // Step 3: Read and store the two numbers using appropriate data types
        // Step 4: Add the numbers and store the result
        // Step 5: Display the sum to the user
        // Step 6: Use try-catch block to handle input errors

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is "+sum);
    }
}
