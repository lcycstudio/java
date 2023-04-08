public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Geeday!");

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        Integer x = myFirstNumber;
        System.out.println("myFirstNumber: " + x.toString());

        myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int mylastOne = 1000 - myTotal;
        System.out.println(mylastOne);
    }
}
