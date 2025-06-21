package L3_conditional_statements;

public class EnhanceSwitchDemo {

    public static void main(String[] args){
        String day="MONDAY";
        switch(day) {
            case "MONDAY"->System.out.println("Monday");
            case "TUESDAY"->System.out.println("Tuesday");
            default->System.out.println("Other day");
        }
    }
}
