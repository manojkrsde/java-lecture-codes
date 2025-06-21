package L4_loops;

public class ForLoopDemo {

    public static void main(String[] args){

        //For loop
        //initialization=> starting state of any loop
        //condition i.e. termination condition
        //statements to execute
        //update / modify the loop variables to support termination condition

//        int i=1;//initialization
//
//        while(i<5){
//            System.out.println(i);
//            i++;
//        }

        // initialization, condition, updation => all in the same line
//        for(int j=1;j<5;j++){
//            System.out.println(j);
//        }

        //i=5, op: 1 2 3 4
        int[] numbers = {10, 20, 30, 40, 50};

        for(int i=0;i<numbers.length;i++){
            System.out.println("Elem at Index "+i+" => "+numbers[i]);
        }

//        System.out.println("Length of numbers: "+numbers.length);
//        int i=0;
//        while(i<numbers.length){
//            System.out.println("Elem at Index "+i+" => "+numbers[i]);
//            i++;
//        }

    }
}
