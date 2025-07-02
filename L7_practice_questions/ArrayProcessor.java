package L7_practice_questions;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayProcessor {
    public static void main(String[] args) {
        // Step 1: Create an integer array of size 10
        // Step 2: Use loop to take input for the array
        // Step 3: Use 'continue' to skip negative numbers
        // Step 4: Use 'break' if input is -999
        // Step 5: Calculate sum and average of valid numbers
        // Step 6: Display results
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] arr=new int[n];//
        Arrays.fill(arr,-1);

        for(int i=0;i<n;i++){
            System.out.println("Enter +ve numbers: negative numbers will be ignored : -999 to exit");
            int num=sc.nextInt();

            if(num==-999) break;
            if(num<0) continue;
            arr[i]=num;
        }

        int sum=0;
        int validNumber=0;
        for(int i=0;i<n;i++){
            if(!(arr[i]<0)){
                sum+=arr[i];
                validNumber++;
            }
        }

        if(validNumber==0) validNumber=1;
        int avg=sum/validNumber;
        System.out.println("Sum : "+sum);
        System.out.println("Avg : "+avg);
        System.out.println("Valid Numbers : "+validNumber);
        sc.close();
    }
}
