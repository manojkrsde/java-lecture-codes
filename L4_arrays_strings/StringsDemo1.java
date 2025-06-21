package L4_arrays_strings;

public class StringsDemo1 {
    public static void main(String[] args) {
        // 1. Declare and initialize a character array directly
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        // 2. Access and print each character by index
        System.out.println("Character at index 0: " + vowels[0]);
        System.out.println("Character at index 1: " + vowels[1]);
        System.out.println("Character at index 2: " + vowels[2]);
        System.out.println("Character at index 3: " + vowels[3]);
        System.out.println("Character at index 4: " + vowels[4]);

        // 3. Update one character (e.g., change 'O' to 'X')
        vowels[3] = 'X';
        System.out.println("\nAfter updating index 3:");
        System.out.println("Character at index 3: " + vowels[3]);

        // 4. Display array length
        System.out.println("\nLength of the array: " + vowels.length);

        // 5. Assign value from one index to another (copying)
        vowels[1] = vowels[0];
        System.out.println("\nAfter copying value from index 0 to index 1:");
        System.out.println("Character at index 1: " + vowels[1]);
    }
}
