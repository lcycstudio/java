public class SumOddRange {
    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd (int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }
        int sumofOdd = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumofOdd += i;
            }
        }
        return sumofOdd;
    }
}
