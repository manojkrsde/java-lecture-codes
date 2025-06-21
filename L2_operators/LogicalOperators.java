package L2_operators;

public class LogicalOperators {

    public static void main(String[] args){

        // && =>  Logical AND Operator, || =>  Logical OR Operator , ! => Logical NOT Operator

        // && , gives true if both the inputs are true, otherwise false
        // || , gives true if either the inputs is true, gives false when both the inputs are false
        // ! , reverse the input, if input is false, we will get true as the output
        // true && true ==> true

        boolean isBcaStudent=true;
        boolean duesCleared=false;
        boolean isMcaStudent=false;

        System.out.println("Allowed to sit in the placement : "+(isBcaStudent && duesCleared));
        System.out.println("Allowed to participate in the event : "+(isBcaStudent || isMcaStudent));
        System.out.println("Reverse of isBcaStudent"+(!isBcaStudent));
        System.out.println("Reverse of isMcaStudent"+(!isMcaStudent));

        // 15

    }
}
