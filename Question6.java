public class Question6 {

    public static void main(String[] args) {
        // Static method - we can call it using just the class name
        int sum = Calculator.add(4, 5);
        System.out.println("4 + 5 = " + sum);

        // Instance method - we first need to create a Calculator object
        Calculator calc = new Calculator();

        int product1 = calc.multiply(3, 6);
        int product2 = calc.multiply(2, 2);

        System.out.println("3 x 6 = " + product1);
        System.out.println("2 x 2 = " + product2);
        System.out.println("multiply() was called " + calc.getCallCount() + " times");
    }
}

class Calculator {
    // This keeps track of how many times multiply() has been used
    private int callCount = 0;

    // Static method - belongs to the class, doesn't need an object
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method - belongs to an object, and can use callCount
    public int multiply(int a, int b) {
        callCount = callCount + 1;
        return a * b;
    }

    // Gives back how many times multiply() has run
    public int getCallCount() {
        return callCount;
    }
}