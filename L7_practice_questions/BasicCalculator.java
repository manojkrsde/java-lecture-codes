package L7_practice_questions;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Step 1: Take two integers and one operator (+, -, *, /) from the user
        // Step 2: Use switch-case to perform the operation
        // Step 3: Handle division by zero error
        // Step 4: Handle invalid operator using default case

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int numb2=sc.nextInt();
        System.out.println("Enter the operation + , -, *, /, %");
        String op=sc.next();// strings input, till we encounter a white space

        switch (op){
            case "+":
                System.out.println("Sum = "+(num1+numb2));
                break;
            case "-":
                System.out.println("Sub = "+(num1-numb2));
                break;
            case "*":
                System.out.println("MUL = "+(num1*numb2));
                break;
            case "%":
                System.out.println("Modulus = "+(num1%numb2));
                break;
            case "/":
                System.out.println("Div = "+(num1/numb2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
