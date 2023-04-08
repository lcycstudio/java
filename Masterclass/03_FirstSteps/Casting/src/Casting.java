public class Casting {
    public static void main(String[] args) {
        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMinIntValue);

        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        // byte myNewByte = (myMinByteValue / 2);
        // // incompatible types: possible lossy conversion from int to byte

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
    }
}
