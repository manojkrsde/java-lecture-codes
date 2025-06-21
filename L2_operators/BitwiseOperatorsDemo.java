package L2_operators;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {

        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        // Bitwise AND =>  0001
        int andResult = a & b;
        System.out.println("a & b = " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");

        // Bitwise OR => 0111
        int orResult = a | b;
        System.out.println("a | b = " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");

        // Bitwise XOR => 0110
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");

        // Bitwise NOT 0-> 1->1 => 0
        int notA = ~a;
        System.out.println("~a = " + notA + " (Binary: " + Integer.toBinaryString(notA) + ")");

        // Left Shift
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");

        // Right Shift
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");
    }
}
