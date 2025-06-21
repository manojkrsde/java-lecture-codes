package L4_arrays_strings;

public class StringsDemo3 {

    public static void main(String[] args){

        String s1="Manoj"; //literal style , 2xb
        String s2="Manoj"; //2xb
        String s3=new String("Manoj");//eg 2xa

        System.out.println("s1 == s2 "+(s1==s2)); //true
        System.out.println("s1 == s2 "+(s1==s3)); // false

        s2=s2+" Kumar";//make the copy of Manoj and then update it with Manoj Kumar, it starts pointing new memory location

        System.out.println("After modification: ");
        System.out.println("s1 => "+s1);
        System.out.println("s2 => "+s2);

        System.out.println("s1 == s2 "+(s1==s2));//false
        System.out.println("s1 == s2 "+(s1==s3));//false


        System.out.println(s1.equals(s3));
        System.out.println(s2.length());

    }
}
