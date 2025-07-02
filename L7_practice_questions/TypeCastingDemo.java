package L7_practice_questions;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // Step 1: Declare an int variable and assign a value
        // Step 2: Implicitly cast it to double and print the result
        // Step 3: Declare a double variable with a decimal value
        // Step 4: Explicitly cast it to int and print the result
        // Step 5: Explain what happens to the decimal part in a comment

        //implicit type casting

        int age=30;
        double newAge=age;//java will automatically converts this to double, widening
        System.out.println("AGE: "+age);
        System.out.println("New Age "+newAge);

        //explicit type casting
        double bankBalance=99000.7865;
        int newBankBalance=(int)bankBalance;
        System.out.println("Balance: "+bankBalance);
        System.out.println("New Balance: "+newBankBalance);

        //floor value:  largest whole number that is smaller than the current number
        //ceiling value: smallest whole number that is greater than the current number

        //1
        //2
        //3
        //3.56 decimal: floor value: 3, ceiling value: 4, 11.45 => 11, 12
        //4
        //5
        //99000.7865 : floor value: 99000,ceiling value: 99001
        // 5, 4.35 => 4 , 5, 4.98, 4 , 5


    }
}
