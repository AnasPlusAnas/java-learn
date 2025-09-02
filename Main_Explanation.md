# Main.java Explained

This file contains basic Java concepts for beginners, demonstrating how to create a simple Java program.

## Understanding the Main Class

Every Java application starts with a class:

```java
public class Main {
    // Code goes here
}
```

- `public`: An access modifier that makes the class accessible from anywhere
- `class`: Keyword used to define a class in Java
- `Main`: The name of our class (class names conventionally start with a capital letter)

## The Main Method

```java
public static void main(String[] args) {
    // Code goes here
}
```

The `main` method is the entry point of any Java application:

- `public`: Makes the method accessible from anywhere
- `static`: Means this method belongs to the class, not to objects of the class
- `void`: Indicates that this method doesn't return any value
- `main`: The name of the method (this name is required for the entry point)
- `String[] args`: An array of strings that can receive command-line arguments

## Variables in Java

The example shows how to declare and use a variable:

```java
int age = 25;
```

- `int`: The data type (integer in this case)
- `age`: The variable name
- `25`: The value assigned to the variable

## Printing Output

Java uses `System.out.println()` to display output to the console:

```java
System.out.println("Hello, World!");
```

This prints "Hello, World!" to the console.

## Escape Sequences

Escape sequences are special characters that perform specific functions:

```java
System.out.println("Hello, \nWorld!");
```

- `\n`: Creates a new line, so "World!" appears on the line below "Hello,"

The output looks like:
```
Hello, 
World!
```

## String Concatenation

You can combine text and variables using the `+` operator:

```java
System.out.println("I am " + age + " years old.");
```

This prints "I am 25 years old." to the console.

## Comments in Java

Comments are used to explain code and are ignored by the compiler:

### Single-line Comments

```java
// out put text to the console
```

Used for brief explanations.

### Multi-line Comments

```java
/*
 * This is a multi-line comment.
 * It can span multiple lines.
 */
```

Used for longer explanations or temporarily disabling blocks of code.