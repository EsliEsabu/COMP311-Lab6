public class Question9 {

    public static void main(String[] args) {
        Shape shape = new Shape();

        // Two methods with the same name "describe", used differently
        shape.describe();
        shape.describe("a plain shape");

        // Circle replaces Shape's describe() with its own version
        Shape circle = new Circle();
        circle.describe();
    }
}

class Shape {
    // Version 1 - no extra details
    public void describe() {
        System.out.println("This is a shape.");
    }

    // Version 2 - same name, but takes extra text
    public void describe(String detail) {
        System.out.println("This is " + detail + ".");
    }
}

// Circle is a type of Shape
class Circle extends Shape {
    // Replaces the parent's describe() with a circle-specific message
    @Override
    public void describe() {
        System.out.println("This is a circle.");
    }
}