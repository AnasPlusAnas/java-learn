public class IfStatements {
  public static void main(String[] args) {
    int age = 25;

    if (age >= 18) {
      System.out.println("You are an adult.");
    } else if (age < 0) {
      System.out.println("You have not been born yet.");
    } else if (age == 1) {
      System.out.println("You are a baby.");
    } else {
      System.out.println("You are not an adult.");
    }

  }
}
