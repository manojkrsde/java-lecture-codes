package L4_loops;

import java.lang.StringBuilder;
public class EnhanceForLoop {

    public static void main(String[] args){

        int[] numbers = {10, 20, 30, 40, 50};

        // no need of condition, starting index, it will get all the elements one by one
        // from the collection
        // no risk of infinite loop

//        for(int elem:numbers)

//        for(int elem:numbers){
//            System.out.println("Elem => "+elem);
//        }

        char[] name={'M','a','n','o','j'};
        StringBuilder sb=new StringBuilder();
        for(char elem:name){
            sb.append(elem);//"Manoj"
        }
        System.out.println("Your name :"+sb);

    }
}
