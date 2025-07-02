package L7_practice_questions;

import  java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        // Step 1: Declare a 2D array with 2 rows and 3 columns
        // Step 2: Use nested loops to take input from the user
        // Step 3: Use nested loops to display elements row-wise
        // Step 4: Display each row on a new line with proper formatting
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];

        for(int i=0;i<arr.length;i++){
            // outer loop: GETTING THE ROW
            for(int j=0;j<arr[i].length;j++){
                //inner loop to get the values and store inside column
                System.out.println("Enter number: ");
                int num=sc.nextInt();
                arr[i][j]=num;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print("Row number : "+(i+1)+" =>");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        sc.close();

    }
}

