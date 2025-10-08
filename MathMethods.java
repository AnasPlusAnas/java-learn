import java.util.Scanner;

public class MathMethods {
  public static void main(String[] args) {
    // math constants
    System.out.println(Math.PI);
    System.out.println(Math.E);

    // math methods
    System.out.println(Math.pow(2, 2));
    System.out.println(Math.abs(-5));
    System.out.println(Math.sqrt(9));
    System.out.println(Math.round(2.45));
    System.out.println(Math.ceil(3.24));
    System.out.println(Math.floor(3.99));
    System.out.println(Math.max(2, 3));
    System.out.println(Math.min(2, 3));

    // exercises
    Scanner sc = new Scanner(System.in);

    double a;
    double b;
    double c;
    double radius;
    double circumference;
    double area;
    double volume;

    // HYPOTENUSE c = Math.sqrt(a^2 + b^2)
    System.out.print("Enter the length of side A: ");
    a = sc.nextDouble();
    System.out.print("Enter the length of side B: ");
    b = sc.nextDouble();
    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("The hypotenuse (side c) is: " + c + "cm");

    // CIRCUMFERENCE 2 * PI * radius
    System.out.print("Enter radius: ");
    radius = sc.nextDouble();
    circumference = 2 * Math.PI * radius;
    System.out.println("The circumference is: " + circumference);

    // AREA Math.PI * Math.pow(radius, 2)
    area = Math.PI * Math.pow(radius, 2);
    System.out.println("The area is: " + area);

    // VOLUME (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    System.out.println("The volume is: " + volume);

    sc.close();
  }
}
