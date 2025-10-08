public class Arithmetics {
  public static void main(String[] args) {
    // arithmetic operators: +, -, *, /, %
    int x = 10;
    int y = 2;
    int z;

    // addition
    z = x + y;

    // subtraction
    z = x - y;

    // multiplication
    z = x * y;

    // division
    z = x / y;

    // modulus
    z = x % y;

    // augmented assignment operators: +=, -=, *=, /=, %=
    x += y; // x = x + y
    x -= y; // x = x - y
    x *= y; // x = x * y
    x /= y; // x = x / y
    x %= y; // x = x % y

    // increment and decrement operators: ++, --
    x++; // x = x + 1
    x--; // x = x - 1

    // ORDER OF OPERATIONS [P-E-M-D-A-S] (parentheses, exponents, multiplication and
    // division, addition and subtraction)
    z = (x + y) * (x - y) / y; // parentheses
    z = x * y + x / y - x % y; // multiplication, division, modulus
    z = x + y - x + y; // addition, subtraction
  }
}
