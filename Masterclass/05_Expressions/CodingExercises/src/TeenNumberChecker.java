public class TeenNumberChecker {
    public static boolean hasTeen (int num1, int num2, int num3) {
        Boolean isTeen1 = num1 >= 13 && num1 <= 19;
        Boolean isTeen2 = num2 >= 13 && num2 <= 19;
        Boolean isTeen3 = num3 >= 13 && num3 <= 19;
        return isTeen1 || isTeen2 || isTeen3;
    }

    public static boolean isTeen (int num) {
        return num >= 13 && num <= 19;
    }
}
