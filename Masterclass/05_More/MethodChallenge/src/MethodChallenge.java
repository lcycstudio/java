public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Jackie", calculateHighScorePosition(1500));
        displayHighScorePosition("Vivian", calculateHighScorePosition(1000));
        displayHighScorePosition("Bill", calculateHighScorePosition(500));
        displayHighScorePosition("May", calculateHighScorePosition(100));
        displayHighScorePosition("Lewis", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;
    }
}
