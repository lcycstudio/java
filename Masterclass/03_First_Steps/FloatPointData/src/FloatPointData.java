public class FloatPointData {
    public static void main(String[] args) {
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println(myIntValue / 2);
        System.out.println(myFloatValue / 2f);
        System.out.println(myDoubleValue / 2d);

        System.out.println(myIntValue / 3);
        System.out.println(myFloatValue / 3f);
        System.out.println(myDoubleValue / 3d);

        /*
        Why should we choose double?
        - First, it's actually faster to process on many modern computes
        - That's because computers have, at the chip level, the functionality
        - to actually deal with these double numbers faster than the equivalent float.
        - Second, the Java libraries that we'll get into later in the course,
        - particularly math functions, are often written to process doubles and
        - not floats, and to return the results as a double.
        - The creators of Java selected the double because it's more precise,
        - and it can handle a larger range of numbers.
         */

        /*
        Challenge: double type to float with pound to kilogram
        */
        double poundValue = 100d;
        float kilogramValue = (float) (poundValue * 0.45359237d);
        System.out.println(kilogramValue);
    }
}
