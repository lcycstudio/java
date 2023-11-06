public class PrimitiveTypes {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);
        System.out.println("An int value ranges from (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        /* Primitive    Wrapper Class
            byte            Byte
            short           Short
            char            Character
            int             Integer
            long            Long
            float           Float
            double          Double
            boolean         Boolean
        */
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        long myLongValue = 100L;
        System.out.println(myLongValue);
        System.out.println("A long has a width of " + Long.SIZE);
        System.out.println("A long value ranges from (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        long bigLongLiteralValue = 2_147_483_647;
        System.out.println(bigLongLiteralValue);
        bigLongLiteralValue = 2_147_483_647_234L;   // need to add "L" at the end
        System.out.println(bigLongLiteralValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);
        System.out.println("A short has a width of " + Short.SIZE);
        System.out.println("A short value ranges from (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
    }
}
