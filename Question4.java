public class Question4 {

    // Same method name "combine", but for two whole numbers
    public static int combine(int a, int b) {
        return a + b;
    }

    // Same method name "combine", but for two pieces of text
    public static String combine(String a, String b) {
        return a + b;
    }

    // Same method name "combine", but for two decimal numbers
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Java picks the right version depending on what you give it
        System.out.println(combine(3, 4));
        System.out.println(combine("Hello, ", "World"));
        System.out.println(combine(2.5, 3.5));
    }
}