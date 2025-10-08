import java.util.Random;

public class RandomNumbers {
  public static void main(String[] args) {
    Random random = new Random();

    int number;
    double doubles;
    boolean booleans;

    // origin is inclusive and the bound is exclusive
    number = random.nextInt(1, 6);
    doubles = random.nextDouble();
    booleans = random.nextBoolean();

    System.out.println(number);
    System.out.println(doubles);
    System.out.println(booleans);
  }
}
