package L4_arrays_strings;

public class StringsDemo2 {
    public static void main(String[] args) {
        // 1. Declare and create a character array of size 5
        char[] vowels = new char[5];

        // 2. Assign values to each index
        vowels[0] = 'A';
        vowels[1] = 'E';
        vowels[2] = 'I';
        vowels[3] = 'O';
        vowels[4] = 'U';

        // 3. Access and print each character by index
        System.out.println("Character at index 0: " + vowels[0]);
        System.out.println("Character at index 1: " + vowels[1]);
        System.out.println("Character at index 2: " + vowels[2]);
        System.out.println("Character at index 3: " + vowels[3]);
        System.out.println("Character at index 4: " + vowels[4]);

        // 4. Update a character
        vowels[3] = 'X';
        System.out.println("\nAfter updating index 3:");
        System.out.println("Character at index 3: " + vowels[3]);

        // 5. Print length of array
        System.out.println("\nLength of character array: " + vowels.length);
    }
}
