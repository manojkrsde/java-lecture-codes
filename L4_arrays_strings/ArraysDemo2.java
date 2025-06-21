package L4_arrays_strings;

public class ArraysDemo2 {

    public static void main(String[] args) {


        boolean[] test=new boolean[5];
        System.out.println("Element at index 0: " + test[0]);
        // 1. Declare an array using new keyword
        int[] numbers = new int[5]; // Creates an array of 5 integers, all initialized to 0
        System.out.println("Element at index 0: " + numbers[0]);

        // ArrayList => Dynamic

        // 2. Assign values to each index manually
        numbers[0] = 11;
        numbers[1] = 22;
        numbers[2] = 33;
        numbers[3] = 44;
        numbers[4] = 55;

        // 3. Access and print each element individually
        System.out.println("Accessing elements using index:");
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // 4. Update an element
        numbers[1] = 99;
        System.out.println("\nAfter updating index 1:");
        System.out.println("Element at index 1: " + numbers[1]);

        // 5. Show the size of the array
        System.out.println("\nSize of array: " + numbers.length);
    }
}
