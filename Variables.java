@SuppressWarnings("unused")
public class Variables {
    // ❎ variable = a reusable container for storing data

    // 🟥 Primitive Data Types = simple value stored directly in memory (stack)
    // 🟦 Reference Data Types = stores reference (address) to the actual data (heap)

    // 🟥 Primitive vs 🟦 Reference
    //    ----------      ----------
    //    int               string
    //    double            array
    //    char              object
    //    boolean   
    
    // 2 Steps to creating a variable
    // -------------------------------
    // 1. Declare the variable (give it a name and data type)
    
    int age; // declaration
    String name; // declaration
    boolean isStudent; // declaration
    double gpa; // declaration
    char initial; // declaration
    
    // 2. Assignment (give it a value)
    int year = 2024; // declaration + assignment
    String city = "New York"; // declaration + assignment
    boolean isEmployed = false; // declaration + assignment
    double height = 5.9; // declaration + assignment
    char grade = 'A'; // declaration + assignment

    // Multiple variable declaration
    int x = 10, y = 20, z = 30; // declaration + assignment

    // Variable naming rules
    // ----------------------
    // 1. Must start with a letter (A-Z or a-z), $ or _
    // 2. Subsequent characters can be letters, digits (0-9), $ or _
    // 3. Cannot use Java reserved keywords (e.g., int, class, public, etc.)
    // 4. Case-sensitive (age, Age, and AGE are different variables)
    // 5. Cannot contain spaces
    // 6. Should be meaningful and descriptive (e.g., age, studentName, isEmployed)
    // 7. Use camelCase for multi-word variable names (e.g., studentName, isEmployed)   
}
