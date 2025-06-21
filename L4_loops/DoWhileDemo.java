package L4_loops;
import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        // do while loop
        // runs for at least one time
        // used in menu-driven programs
        int inp=0;
        do{
            System.out.println("1: To greet");
            System.out.println("2: To exit");
            System.out.println("Your choice: ");
            inp=sc.nextInt();

            if(inp==1){
                System.out.println("Hello!");
            }
        }while (inp!=2);

        sc.close();
    }
}
