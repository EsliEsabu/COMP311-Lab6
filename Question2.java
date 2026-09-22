
public class Question2 {

    // This method calculates the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Calling the method with two different radius values
        double area1 = circleArea(2.0);
        double area2 = circleArea(5.5);

        System.out.println("Area with radius 2.0: " + area1);
        System.out.println("Area with radius 5.5: " + area2);
    }
}