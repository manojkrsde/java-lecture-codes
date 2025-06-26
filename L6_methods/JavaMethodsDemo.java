package L6_methods;

public class JavaMethodsDemo {

    //method declaration part
    private String convertToUppercase(String name){
        return name.toUpperCase();
    }

    // 1. No return type, no parameters
    private static void greet() {
        System.out.println("Hello! Welcome to Java Functions.");
    }

    //"Manoj" => function which takes this value and transform it to uppercase => output
    //should be "MANOJ"

    // 2. No return type, with parameters
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
        return;
    }

    // 3. Return type, no parameters
    public static String getGreetingMessage() {
        printSum(10,20);
        return "Have a great day!";
        //return => keyword, it is used to return the value from the function
        //also, it will exit the function and removed it from the call stack
    }
    //---------------
    //
    //getGreetingMessage() => return keyword will return the value and removed the function from the call stack
    // main() => local variables comes into the memory
    //-------------
    // call stack memory--------

    //camel casing
    // sumofthreenumbers (wrong)
    // sumOfThreeNumbers (camel casing)




    // 4. Return type, with parameters
    protected static int multiply(int x, int y) {
        return x * y;
    }

    //main
    // 5. Method calling another method
    public static void calculateAndPrintProduct(int x, int y) {
        int result = multiply(x, y); // calling another function
        System.out.println("Product = " + result);
    }

    // 6. Main method to run all demos
    public static void main(String[] args) {

//        JavaMethodsDemo obj=new JavaMethodsDemo();
//        String convertedName=obj.convertToUppercase("Manoj");
//        System.out.println(convertedName);


//        // Calling method with no return and no parameters
//        greet();
//
        // Calling method with parameters
//        printSum(10, 20);
//
////        // Calling method that returns a value
//        String message = getGreetingMessage();
//        System.out.println(message);
//
//        // Calling method with return and parameters
//        int product = multiply(5, 6);
//        System.out.println("Returned Product = " + product);
//
//        // Method calling another method
        calculateAndPrintProduct(3, 7);
    }

}
