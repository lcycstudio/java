public class Operators {
    public static void main(String[] args) {
        /*
        Operators in Java are special symbols that perform specific operations on one, two, or
        three operands, and then return a result.
        An operand is a term used to describe any object that is manipulated by an operator.

        Operator        Symbol
        Addition        +
        Subtraction     -
        Multiplication  *
        Division        /
        Remainder       %
        Increment       ++
        Decrement       --
        Assignment      = += -= *= /= %= &= ^= |= <<= >>= >>>=
         */

        {
            int result = 1;
            result = result + 1;
            System.out.println("result = " + result);
        }

        {
            int result = 1;
            result += 1;
            System.out.println("result = " + result);
        }

        {
            int result = 1;
            result++;
            System.out.println("result = " + result);
        }

        /*
        int result = 10;
        result -= 5.5;   // is equivalent to
        result = (int) (result - 5.5)
         */
    }
}
