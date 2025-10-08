public class PrintF {
  public static void main(String[] args) {
    // printf() is a method used to format output
    // syntax = %[flags][width][.precision][specifier-character]

    String name = "Spongebob";
    char firstLetter = 'S';
    int age = 30;
    double height = 60.5;
    boolean isEmployed = true;

    // s = string
    System.out.printf("Hello %s\n", name);
    // c = character
    System.out.printf("Your name starts with a %c\n", firstLetter);
    // d = digits
    System.out.printf("You are %d\n", age);
    // f = floats
    System.out.printf("You are %f inches tall\n", height);
    // b = boolean
    System.out.printf("Employed: %b\n", isEmployed);

    // multiple variables
    System.out.printf("%s is %d years old", name, age);

    double price1 = 9.99;
    double price2 = 100.15;
    double price3 = -54.01;

    System.out.printf("\n%.1f", price1); // 1 decimal place
    System.out.printf("\n%.2f", price2); // 2 decimal places
    System.out.printf("\n%.3f", price3); // 3 decimal places
  }
}
