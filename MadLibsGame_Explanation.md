# MadLibsGame.java Explained

This file implements a simple Mad Libs game in Java. Mad Libs is a word game where players fill in blanks with different types of words to create a funny story.

## Program Overview

The MadLibsGame program:
1. Asks the user for various words (adjectives, nouns, verbs)
2. Inserts these words into a pre-defined story template
3. Displays the completed story

## Importing the Scanner

```java
import java.util.Scanner;
```

We import the Scanner class to get user input, just like in the ConsoleUserInput example.

## Variable Declarations

```java
String adjective1;
String noun1;
String adjective2;
String verb1;
String adjective3;
```

The program declares String variables to store each word that the user will enter. Notice that these are just declared but not initialized yet - they'll get their values from user input.

## Getting User Input

```java
System.out.print("Enter an adjective (description): ");
adjective1 = scanner.nextLine();
System.out.print("Enter a noun (animal or person): ");
noun1 = scanner.nextLine();
System.out.print("Enter an adjective (description): ");
adjective2 = scanner.nextLine();
System.out.print("Enter a verb ending with -ing (action): ");
adjective3 = scanner.nextLine();
System.out.print("Enter an adjective (description): ");
verb1 = scanner.nextLine();
```

For each variable:
1. The program displays a prompt telling the user what kind of word to enter
2. It reads the user's input using `scanner.nextLine()`
3. It assigns that input to the appropriate variable

Notice how the program gives examples in parentheses to help the user understand what type of word to enter. This is good practice for user interfaces.

## Generating the Mad Libs Story

```java
System.out.println("\nToday, I went to a " + adjective1 + " zoo.");
System.out.println("In an exhibit, I saw a " + noun1 + ".");
System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
System.out.println("I was " + adjective3 + "!");
```

After collecting all the words, the program:
1. Starts with a blank line (`\n`) for better formatting
2. Prints each line of the story, inserting the user's words where appropriate using string concatenation with the `+` operator

## Closing the Scanner

```java
scanner.close();
```

The program properly closes the Scanner object when it's done using it.

## Programming Concepts Demonstrated

1. **User Input**: Using Scanner to get input from users
2. **Variables**: Declaring and using variables to store data
3. **String Concatenation**: Combining strings and variables to create output
4. **Console Output**: Displaying text to the user
5. **Resource Management**: Properly closing resources when done

## Possible Improvements

1. Add input validation to ensure users enter appropriate types of words
2. Create multiple story templates and randomly select one
3. Allow the user to play again without restarting the program
4. Save the story to a file
5. Add color or formatting to the console output

## How to Run the Program

1. Save the file as `MadLibsGame.java`
2. Compile it: `javac MadLibsGame.java`
3. Run it: `java MadLibsGame`
4. Follow the prompts to enter different words
5. Enjoy the funny story that results!
