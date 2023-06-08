public class CharBoolean {
    public static void main(String[] args) {
        char myChar = 'D';
        // char myChar = 'DD';
        // java: unclosed character literal
        System.out.println(myChar);
        System.out.println(Character.SIZE);

        /*
        Unicode: an international encoding standard for use with different languages and scripts
        by which each letter, digit or symbol is assigned to a unique numeric value that applies
        across different platforms and programs. In the English alphabet, we've got the letters
        A through Z, meaning only 26 characters are needed in total to represent the entire
        English alphabet. But other languages need more characters, and often a lot more.
        http://unicode-table.com/en/
        D
        - unicode number: U+0044 -- Row 0044 + Col 4
        - HTML-code: &#68;
        - Dec: 68 (decimal number)
         */

        char myUnicode = '\u0044';
        System.out.println(myUnicode);
        char myDecimalCode = 68;
        System.out.println(myDecimalCode);

        /*
        Challenge
         */
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are " + mySimpleChar + myUnicodeChar + myDecimalChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        System.out.println(isCustomerOverTwentyOne);
    }
}
