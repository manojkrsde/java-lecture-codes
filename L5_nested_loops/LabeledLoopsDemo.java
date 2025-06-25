package L5_nested_loops;

public class LabeledLoopsDemo {
    public static void main(String[] args) {

        // Label for outer loop
        outerLoop:
        for (int i = 1; i <= 5; i++) {//runs for single time only
            System.out.println("Outer loop i = " + i);

            // Inner loop
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.println("  j = " + j + " → breaking to outer loop");
                    break outerLoop;  // breaks the outer loop directly
                }
                System.out.println("  Inner loop j = " + j);
            }
        }

        System.out.println("\n--- Now showing continue with labeled loop ---");

        // Another labeled loop example using continue
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue outer;  // skips to next iteration of outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
