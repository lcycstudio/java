public class Main {
    public static void main(String[] args) {
        /*
        Keywords
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

        The Expression - An expression computes to a single value.
        The Statement - Statements are standalone units of work.
        The Code Blocks - A code block is a set of zero, one, or more statements,
        usually grouped together in some way to achieve a single goal.
         */

        // int int = 5; // this is wrong
        double kilometers = (100 * 1.609344);

        int highScore = 50; // an expression

        if (highScore > 25) {   // highScore > 25 is an expression
            highScore = 1000 + highScore;   // add bonus points
        }

        int health = 100;
        if ((health < 25) && (health > 1000)) {
            highScore = highScore - 1000;
        }

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                "another" +
                "still more.");

        int anotherVariable = 50; myVariable--;System.out.println("myVariable =" + myVariable);

        /*
        Whitespace is any extra spacing, horizontally or vertically, placed around Java source code.
        It is usually added for human readability purposes.
        In Java, all these extra spaces are ignored.
         */

        int                          soMuchSpace
                =
                50
                ;

        // Code -> Reformat Code
    }
}
