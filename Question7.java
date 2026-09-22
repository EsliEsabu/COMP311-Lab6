public class Question7 {

    // Doubles the number, but only inside this method
    public static void tryToDouble(int number) {
        number = number * 2;
        System.out.println("Inside method, number is now: " + number);
    }

    public static void main(String[] args) {
        int value = 10;

        // Java gives the method a copy of "value", not the real thing
        tryToDouble(value);

        // So "value" here is still unchanged
        System.out.println("Back in main, value is still: " + value);
    }
}