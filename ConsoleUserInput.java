// Scanner is a not built-in class in Java, so we need to import it
import java.util.Scanner;

public class ConsoleUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // 1. to read a string input, we can use nextLine() method
        // ------------------------------------------------------------
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        // 2. to read an integer input, we can use nextInt() method
        // ------------------------------------------------------------
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input as an integer

        // 3. to read a double input, we can use nextDouble() method
        // ------------------------------------------------------------
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // Read user input as a double

        // 4. to read a boolean input, we can use nextBoolean() method
        // ------------------------------------------------------------
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // Read user input as a boolean

        // Output the collected inputs
        System.out.println("Hello, " + name + "!"); // Output user input
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");
        System.out.println("Student status: " + isStudent);

        // theres a common problem in Java when using Scanner
        // if we use nextInt(), nextDouble(), or nextBoolean() methods
        // and then use nextLine() method, it will skip the input
        // to solve this problem, we can add an extra nextLine() method to clear the input buffer
        // after using nextInt(), nextDouble(), or nextBoolean() methods
        // ------------------------------------------------------------
        int dummy = scanner.nextInt(); // Read an integer input
        scanner.nextLine(); // Consume the leftover newline character
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine(); // Now we can safely read a string input
        System.out.println("Your favorite color is " + color + ".");

        // it is a good practice to close the scanner after use
        scanner.close();
    }
}
