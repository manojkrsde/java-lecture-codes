package L3_conditional_statements;

public class IfDemo {

    public static void main(String[] args){

     int number=10;

     //2, 3, 5  (2 and 5 )%=> rem

     if(number%2==0) {
         System.out.println("Number is divided by 2");
     }else if(number % 3==0){
         System.out.println("Number is divided by 3 ");
     }else if(number % 5==0){
         System.out.println("Number is divided by 5 ");
     }else{
         System.out.println("Not divisible by 2,3,5 ");
     }

    }
}
