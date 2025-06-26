package L5_nested_loops;

public class NestedLoopDemo {

    public static void main(String[] args) {

//        int[] row1=new int[5]; // default value 0
////        int[] row2=new int[3];
//        int[] row3=new int[7];// 1-d array
//
//        // outer array => array (not number)
//        int[][] twoDArray=new int[3][];
//        twoDArray[0]=new int[]{10,30,50};
//        twoDArray[1]=new int[3];
//        twoDArray[2]=row3;

//        for(int i=0;i<twoDArray.length;i++){//rows,
//            System.out.print("Row no : "+i+" => ");
//            for(int j=0;j<twoDArray[i].length;j++) {//columns : inside array values
//                System.out.print(twoDArray[i][j]+" ");
//            }
//            System.out.println();
//        }
//

        // -------------------------------
        // 1. Declare and Initialize 2D Array
        // -------------------------------
        int[][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};



        // -------------------------------
        // 2. Print the 2D Array (Matrix Format)
        // -------------------------------
//        System.out.println("2D Array (Matrix Format):");
//        for (int i = 0; i < matrix.length; i++) {              // Outer loop: rows
//            for (int j = 0; j < matrix[i].length; j++) {       // Inner loop: columns
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(); // Move to next row
//        }
//
        System.out.println();

        // -------------------------------
        // 3. Sum of All Elements in 2D Array
        // -------------------------------
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//        }
//        System.out.println("Sum of all elements: " + sum);
//
//        System.out.println();

        // -------------------------------
        // 4. Print Each Row Separately
        // -------------------------------
//        System.out.println("Print each row:");
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.print("Row " + i + ": ");
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int row=0;row<5;row++){//row

            //row => 1, col=1 2 3
            // 1
            // 1 2
            // 1 2 3, row=2
            for(int col=0;col<=row;col++){
                System.out.print((col+1)+" ");
            }
            System.out.println();
        }


        // -------------------------------
        // 1. Right-Angled Triangle Pattern
        // -------------------------------
        System.out.println("1. Right-Angled Triangle Pattern:");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {          // Outer loop for rows
            for (int j = 1; j <= i; j++) {          // Inner loop for columns
                System.out.print("* ");
            }
            System.out.println();                   // Move to next line
        }

        System.out.println(); // Line break for clarity

        // -------------------------------
        // 4. Multiplication Table Grid
        // -------------------------------
        System.out.println("5. Multiplication Table (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
