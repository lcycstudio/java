public class OperatorChallenge {
    public static void main(String[] args) {
        /*
        Challenge
         */
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double mySumDouble = myFirstDouble + mySecondDouble * 100.00d;
        System.out.println("MySumDouble = " + mySumDouble);

        double myRemainder = mySumDouble % 40.00d;
        boolean isZero = myRemainder == 0.00 ? true : false;
        System.out.println("The remainder is zero? " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }

        /*
        Summary of Operators
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        Java Operator Precedence Table
        https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
         */
    }
}
