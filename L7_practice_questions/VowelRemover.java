package L7_practice_questions;

import java.lang.StringBuilder;
public class VowelRemover {
    public static void main(String[] args) {
        // Step 1: Take string input from the user
        // Step 2: Use StringBuilder to build a new string without vowels
        // Step 3: Iterate through each character and skip vowels
        // Step 4: Count number of vowels removed
        // Step 5: Display original string, modified string, and number of vowels removed

        // abcdefghijklmnopqrst
        // a => a,e,i,o,u
        // b => append this in the result

        String str="AbCdEefghiIjK";//13
        StringBuilder sb=new StringBuilder();
        int numberOfVowels=0;

        for(int i=0;i<str.length();i++){
            String ch=String.valueOf(str.charAt(i)).toLowerCase();//all the characters to lower case
            if(ch.equals("a") || ch.equals("e") || ch.equals("o") || ch.equals("i") || ch.equals("u")){
                numberOfVowels++;
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }

        System.out.println("Original String : "+str);
        System.out.println("Updated String : "+sb);
        System.out.println("Count of Vowel : "+numberOfVowels);

    }
}
