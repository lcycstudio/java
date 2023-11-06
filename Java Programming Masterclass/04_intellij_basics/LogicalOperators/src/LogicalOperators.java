public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Hello, Lewis");

        boolean isAlien = false;

        // A code block allows more than one statement to be executed, in other
        // words, a block of code.
        if (isAlien == false) {
            System.out.println("This is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 90;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not a car");
        }
    }
}
