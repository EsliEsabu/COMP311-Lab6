import java.util.Scanner; // lets us read what the user types

public class Question10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the length and width
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        // Use the Rectangle class to do the calculations
        double area = Rectangle.area(length, width);
        double perimeter = Rectangle.perimeter(length, width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}

class Rectangle {
    // Works out the area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Works out the perimeter of a rectangle
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }
}