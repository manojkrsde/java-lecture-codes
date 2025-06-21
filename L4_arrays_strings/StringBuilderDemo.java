package L4_arrays_strings;

import java.lang.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args){

        //String s1=new String("Manoj");
        //mutable
        StringBuilder sb1=new StringBuilder("Manoj");
        StringBuilder sb2=sb1;

        System.out.println("Sb1: "+sb1);
        System.out.println("Sb2: "+sb2);

        sb2=sb2.append(" Kumar");

        System.out.println("After update: ");
        System.out.println("Sb1: "+sb1);
        System.out.println("Sb2: "+sb2);
    }
}
