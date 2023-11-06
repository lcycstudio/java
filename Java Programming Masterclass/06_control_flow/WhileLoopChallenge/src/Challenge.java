public class Challenge {
    public static void main(String[] args) {
        int loopNumber = 5;
        int countOdd = 0;
        int countEven = 0;
        while (loopNumber <= 20) {
            if (isEvenNumber(loopNumber)) {
                countEven ++;
            } else {
                countOdd ++;
            }
            System.out.println(loopNumber + " is " + (isEvenNumber(loopNumber) ? "even" : "odd"));
            loopNumber ++;
            if (countEven == 5) {
                break;
            }
        }
        System.out.println("Total odd numbers found = " + countOdd);
        System.out.println("Total even numbers found = " + countEven);
    }
    public static boolean isEvenNumber (int number) {
        if (number < 0) { return false;}
        return number % 2 == 0;
    }
}
