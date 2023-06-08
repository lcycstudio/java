public class StringData {
    public static void main(String[] args) {
        /*
        Recap
        byte, short, int, long, float, double, char, boolean
         */

        /*
        A String is a class that contains a sequence of characters.
         */
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = "I wish I had \u00241,000,000.00";
        System.out.println(myString);

        {
            String numberString = "250.55";
            numberString = numberString + "49.45";
            System.out.println(numberString);
        }
    }
}
