package L4_loops;

public class LoopsControlDemo {

    // break : exit from the current loop
    // continue: skip iteration

    public static void main(String[] args){

        //find out if loop has a neg value or not

        //i =0 ; numbers: 1, OP: 13
        int[] numbers = {1, 5, 0, 7, -3, 8, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Break when negative found
            if (numbers[i] < 0) {
                break;
            }
            // Skip zeros
            if (numbers[i] == 0) {
                continue;
            }
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum); // Outputs: 13
    }
}
