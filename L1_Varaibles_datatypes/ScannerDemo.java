package L1_Varaibles_datatypes;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=scanner.next(); // It will give me input till the first white character

        System.out.println("Enter your age: ");
        byte age=scanner.nextByte();

        System.out.println("Your name: "+name);

//        "Manoj" => number

        System.out.println("Your age: "+age);

        scanner.close();
    }
}
