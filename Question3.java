public class Question3 {

    // This method just prints the banner (doesn't return anything)
    public static void printBanner() {
        System.out.println("**********************");
    }

    // This method gives the banner back as text instead of printing it
    public static String getBanner() {
        return "**********************";
    }

    public static void main(String[] args) {
        // Calling the void method - it prints on its own
        printBanner();

        // Calling the method that returns text, then printing it ourselves
        String banner = getBanner();
        System.out.println(banner);
    }
}