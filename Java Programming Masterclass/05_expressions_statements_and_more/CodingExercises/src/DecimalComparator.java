public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        if (num1 * num2 < 0) {
            return false;
        }
        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);
        String[] arrStr1 = num1Str.split("\\.");
        String[] arrStr2 = num2Str.split("\\.");
        Boolean part1 = arrStr1[0].equals(arrStr2[0]);
        Boolean part2 = arrStr1[1].substring(0,3).equals(arrStr2[1].substring(0,3));
        return part1 && part2;
    }
}
