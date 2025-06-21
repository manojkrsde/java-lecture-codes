package L4_arrays_strings;

public class ArraysDemo1 {

    public static void main(String[] args) {
        // 1. Declare and initialize an array with values
        int[] numbers = {10, 20, 30, 40, 50};
        // 2. Accessing elements using index (starting from 0)
        System.out.println("Accessing elements:");
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // 3. Modifying an element
        numbers[2] = 99; // Change value at index 2
        System.out.println("\nAfter modifying index 2:");
        System.out.println("Element at index 2: " + numbers[2]);

        // 4. Showing the size of the array
        System.out.println("\nSize of the array: " + numbers.length);

        // 5. Trying to access an out-of-bounds index (commented to avoid error)
         System.out.println(numbers[4]); // This will throw ArrayIndexOutOfBoundsException
    }

}
