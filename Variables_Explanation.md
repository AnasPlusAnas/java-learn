# Variables.java Explained

This file demonstrates the concept of variables in Java, covering different types, declaration, and naming conventions.

## What is a Variable?

A variable is a container for storing data that can be used and modified throughout a program. The file begins with this definition:

```java
// ❎ variable = a reusable container for storing data
```

## Types of Data in Java

Java has two main categories of data types:

### Primitive vs Reference Data Types

```java
// 🟥 Primitive Data Types = simple value stored directly in memory (stack)
// 🟦 Reference Data Types = stores reference (address) to the actual data (heap)
```

#### 🟥 Primitive Data Types
Primitive data types store simple values directly in memory (stack):
- `int`: Stores whole numbers
- `double`: Stores decimal numbers
- `char`: Stores a single character
- `boolean`: Stores true or false values

#### 🟦 Reference Data Types
Reference data types store a reference (address) to the actual data (heap):
- `String`: Stores text
- Arrays: Store collections of values
- Objects: Instances of classes

## Creating Variables

Creating a variable is a two-step process:

### 1. Declaration
Specify the data type and name:

```java
int age;       // declaration
String name;   // declaration
boolean isStudent; // declaration
double gpa;    // declaration
char initial;  // declaration
```

### 2. Assignment
Give the variable a value:

```java
int year = 2024;         // declaration + assignment
String city = "New York"; // declaration + assignment
boolean isEmployed = false; // declaration + assignment
double height = 5.9;     // declaration + assignment
char grade = 'A';        // declaration + assignment
```

### Multiple Variable Declaration

You can declare multiple variables of the same type in one line:

```java
int x = 10, y = 20, z = 30; // declaration + assignment
```

## Variable Naming Rules

When naming variables in Java:

1. Must start with a letter (A-Z or a-z), $ or _
2. Subsequent characters can be letters, digits (0-9), $ or _
3. Cannot use Java reserved keywords (e.g., int, class, public)
4. Case-sensitive (age, Age, and AGE are different variables)
5. Cannot contain spaces
6. Should be meaningful and descriptive
7. Use camelCase for multi-word variable names (e.g., studentName, isEmployed)

## Memory Concepts: Stack vs Heap

Understanding where and how variables are stored in memory:

- **Stack Memory**: Where primitive variables are stored directly with their values
- **Heap Memory**: Where objects (including Strings and arrays) are stored, with references to them on the stack

This is why primitive types are called "value types" and objects are called "reference types" - the stack stores either the actual value (for primitives) or a reference to the value's location in the heap (for objects).
