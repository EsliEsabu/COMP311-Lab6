public class Question5 {

    // Prints just the name
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Same method name, but this version also takes an age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("Amantle");        // uses the name-only version
        displayInfo("Kagiso", 21);     // uses the name-and-age version
    }
}