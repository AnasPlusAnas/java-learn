# ConsoleUserInput.java Explained

This file demonstrates how to get user input from the console in Java using the `Scanner` class.

## Importing the Scanner Class

```java
import java.util.Scanner;
```

The Scanner class is not built into Java's core libraries, so we need to import it from the `java.util` package.

## Creating a Scanner Object

```java
Scanner scanner = new Scanner(System.in);
```

- We create a new Scanner object that reads input from `System.in` (standard input/console)
- This scanner object provides methods to read different types of data from the console

## Reading Different Types of Input

### 1. Reading String Input

```java
System.out.print("Enter your name: ");
String name = scanner.nextLine(); // Read user input
```

- `nextLine()` reads an entire line of text (until the Enter key is pressed)
- Good for reading names, sentences, or any text input

### 2. Reading Integer Input

```java
System.out.print("Enter your age: ");
int age = scanner.nextInt(); // Read user input as an integer
```

- `nextInt()` reads an integer value from the input
- Will cause an error if the user enters anything that's not a valid integer

### 3. Reading Double Input

```java
System.out.print("Enter your height in meters: ");
double height = scanner.nextDouble(); // Read user input as a double
```

- `nextDouble()` reads a decimal number from the input
- Useful for measurements, calculations, etc.

### 4. Reading Boolean Input

```java
System.out.print("Are you a student? (true/false): ");
boolean isStudent = scanner.nextBoolean(); // Read user input as a boolean
```

- `nextBoolean()` reads a boolean value (true or false) from the input
- The user must enter exactly "true" or "false" (case insensitive)

## Displaying the Collected Input

```java
System.out.println("Hello, " + name + "!"); 
System.out.println("You are " + age + " years old.");
System.out.println("Your height is " + height + " meters.");
System.out.println("Student status: " + isStudent);
```

- After collecting input, we display it back to the user
- This uses string concatenation with the `+` operator to combine text and variables

## Handling the Scanner Input Buffer Issue

```java
int dummy = scanner.nextInt(); // Read an integer input
scanner.nextLine(); // Consume the leftover newline character
System.out.print("Enter your favorite color: ");
String color = scanner.nextLine(); // Now we can safely read a string input
```

This section demonstrates a common issue with Scanner:

- When using `nextInt()`, `nextDouble()`, or `nextBoolean()` methods, they don't consume the newline character that the user enters after their input
- If you then call `nextLine()`, it will read this leftover newline character (not the actual input you want)
- To fix this, add an extra `nextLine()` call to consume the leftover newline before your next meaningful `nextLine()` call

## Closing the Scanner

```java
scanner.close();
```

- It's good practice to close the Scanner when you're done using it
- This releases the resources associated with it
- Failing to close resources can cause resource leaks in larger applications

## Common Errors with Scanner

1. **InputMismatchException**: Occurs when the input doesn't match the expected type (e.g., entering text when `nextInt()` is called)
2. **NoSuchElementException**: Occurs when trying to read beyond the end of the input
3. **Buffer Issues**: The problem described above with the newline character

## Best Practices

1. Always validate user input
2. Add clear prompts to tell users what to enter
3. Handle potential exceptions
4. Close the Scanner when done
5. Be aware of the buffer issue when mixing different input methods
