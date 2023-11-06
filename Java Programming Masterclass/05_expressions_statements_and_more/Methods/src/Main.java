public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The next high score is " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    /*
    Declaring the Method
    - Declaring Modifiers. These are keywords in Java with special meanings, we've seen
      public and static as examples, but there are others.
    - Declaring the return type.
      - void is a Java keyword meaning no data is returned from a method.
      - Alternatively, the return type can be any primitive data type or class.
    - Declaring the method name. Lower camel case is recommended for method names.
    - Declaring the method parameters in parentheses. A method is not required to have
      parameters, so a set of empty parentheses would be declared in that case.
    - Declaring the method block with opening and closing curly braces. This is also called
      the method body.

    Declaring the Parameters
    - Parameters are declared as a list of comma-separated specifiers, each of which has a
      parameter type and a parameter name (or identifier).
    - Parameter order is important when calling the method.
    - The calling code must pass arguments to the method, with the same or comparable type,
      and in the same order, as the declaration.
    - The calling code must pass the same number of arguments, as the number of parameters
      declared.

    Declaring the Return Type
    - When declaring a return type, void is a valid return type, and means no data is required.
    - Any other return type requires a return statement, in the method code block.
    - if a method declares a return type, meaning it's not void, then a return type is required at
      any exit point from the method block.
     */
}
