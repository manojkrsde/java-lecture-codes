package L7_practice_questions;

public class SecondLargest {
    public static void main(String[] args) {
        // Step 1: Take array size input (ensure n >= 2)
        // Step 2: Read n integers from the user into an array
        // Step 3: Initialize two variables: largest and secondLargest
        // Step 4: Traverse array and update largest and secondLargest accordingly
        // Step 5: Handle duplicate values appropriately
        // Step 6: Display second-largest value

        //largest=> 5
        //secondLargest=1 => 3
        // -5


        int[] arr={100,5,5,3,2,-5,10,30,40,50,60,7,61};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("First Largest "+largest);
        System.out.println("Second Largest "+((secondLargest==Integer.MIN_VALUE)?"No second largest elem":secondLargest));

    }
}
