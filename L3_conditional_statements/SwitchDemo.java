package L3_conditional_statements;

public class SwitchDemo {

    public static void main(String[] args){
        String day="MONDAY";

        switch(day) {
            case "MONDAY":
                System.out.println("Monday");
                System.out.println("Monday");
                break;
            case "TUESDAY":
                System.out.println("Tuesday");
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }

        System.out.println("End ...");
    }
}
