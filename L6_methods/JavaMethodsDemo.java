package L6_methods;

public class JavaMethodsDemo {
    // 1. No return type, no parameters
    public static void greet() {
        System.out.println("Hello! Welcome to Java Functions.");
    }

    // 2. No return type, with parameters
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // 3. Return type, no parameters
    public static String getGreetingMessage() {
        return "Have a great day!";
    }

    // 4. Return type, with parameters
    public static int multiply(int x, int y) {
        return x * y;
    }

    // 5. Method calling another method
    public static void calculateAndPrintProduct(int x, int y) {
        int result = multiply(x, y); // calling another function
        System.out.println("Product = " + result);
    }

    // 6. Main method to run all demos
    public static void main(String[] args) {
        // Calling method with no return and no parameters
        greet();

        // Calling method with parameters
        printSum(10, 20);

        // Calling method that returns a value
        String message = getGreetingMessage();
        System.out.println(message);

        // Calling method with return and parameters
        int product = multiply(5, 6);
        System.out.println("Returned Product = " + product);

        // Method calling another method
        calculateAndPrintProduct(3, 7);
    }

}
