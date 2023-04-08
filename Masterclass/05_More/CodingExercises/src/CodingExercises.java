public class CodingExercises {
    public static void main(String[] args) {
        double num1 = -3.1445;
        double num2 = -3.1445;
        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);
        String[] arrStr1 = num1Str.split("\\.");
        String[] arrStr2 = num2Str.split("\\.");
        Boolean part1 = arrStr1[0].equals(arrStr2[0]);
        Boolean part2 = arrStr1[1].substring(0,3).equals(arrStr2[1].substring(0,3));
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part1 && part2);
    }
}
