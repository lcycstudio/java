public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count ++;
                sum += i;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);

        Sum3And5();
    }

    public static void Sum3And5() {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }

            if (countOfMatches == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sumOfMatches);
    }
}
