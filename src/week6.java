import java.util.InputMismatchException;
import java.util.Scanner;

public class week6 {
    public static void main(String[] args) {


        // For spacing between codes
        String space = "---------";
        System.out.println(space + "WEEK 6 Basic Input/Output and String Processing | Friday 18th June, 2024" + space);


        //WEEK 6: Basic Input/Output and. String Processing	Friday 18th June, 2024

        // Formatting Output with printf
        //System.out.printf() allows formatted output using format specifiers like %d (integer), %f (float), %s (string), etc.
        int age = 27;
        System.out.printf("I am %d years old.\n", age);

        System.out.println(space + "Input Operations with Scanner Class" + space);

    // To save running time i'm making this input code a comment. Delete comment opener to run

        // Input Operations with Scanner Class
        //The Scanner class is used to read input from the user.
        //Methods like nextInt(), nextDouble(), and nextLine() read different data types.
        //Example
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age2 = scanner.nextInt();
        System.out.println("your entered: " + age2 + " are your age");

        System.out.println(space + "Calculate the area of a circle" + space);

        //Codes to Calculate the area of a circle
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);


        System.out.println(space + "Exception handling with Try-catch for input" + space);
        //Exception handling with Try-catch for input
        // Scanner methods can throw exceptions if input is not of the expected type.
        //try-catch blocks are used to handle these exceptions gracefully.
        //Example
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        try {
            int age3 = scanner.nextInt();
            System.out.println("Your age is: " + age3);
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid age. Please enter a valid age.");
        }

    //Delete this comment tail to run the scanner code inside */


        System.out.println(space + "Creating Strings/String Concatenation" + space);
        // Creating Strings
        // Strings can be created using the String Class.
        // Strings can be declared as literal (On the go), or declared as an object
        // Examples
        String greeting = "Hello, earthling!"; // created as literal
        String nameSt = new String("Sowl"); // created as an object


        // String concatenation
        //Strings can be concatenated using the + operator.
        // Example
        String firstName = "Sowl";
        String lastName = "Brown";
        String fullName = firstName + " " + lastName;
        System.out.println("Welcome " + fullName);


        // String Literal vs. Object Creation
        //Strings created using string literals are stored in the string pool.
        // Strings created using new are stored in the heap memory. Example
        String str1 = "hello"; // Stored in the string pool
        String str2 = new String("hello"); //stored in heap memory

        //String Immutability
        //Strings are immutable, meaning they cannot be changed once created.
        // Operations on strings create new strings rather than modifying the original.
        //Example
        String original = "Hello";
        String modified = original.toUpperCase(); // Creates a new string


        System.out.println(space + "Mid-lesson question: Authentication System" + space);
// Delete comment start to run code

        //Mid-lesson question
        //Write a Java program that simulates a simple username and password authentication system.
        // The program should prompt the user to enter a username and password. If the username is “mivastudent"
        // and the password is “student345", the program should display a welcome message. Otherwise,
        // it should display an error message.

        Scanner scanner4 = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("mivastudent") && password.equals("student345")) {
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("Authentication failed. Please check username and password.");
        }
        scanner.close();
//Delete comment close to run */

        System.out.println(space + "String Equality" + space);
        //String Equality
        //Use the equals() method to compare the content of two strings.
        //Example:
        //string equality for strings declared as literal with same variable will be TRUE
        String str1a = "World";
        String str2a = "world";
        boolean isEqual = str1a.equals(str2a); //will result in TRUE
        System.out.println("Are the Literal Strings Equal: " + isEqual);

        //while string equality for strings declared as object with same variable  will be FALSE
        String str3a = new String("Miva");
        String str4a = new String("miva");
        boolean isEqual2 = str3a.equals(str4a); // will result in FALSE
        System.out.println("Are the Object Strings Equal: " + isEqual2); // The result came out as true oooo😂

        System.out.println(space + "String Length" + space);
        //String Length
        //The length() method returns the number of characters in a string. Example
        String message = "Awesome!";
        int length = message.length(); // Returns 8
        System.out.println("The length of the string 'awesome is: " + length);

        System.out.println(space + "String Indexing" + space);
        //String Indexing
        //Just like arrays, strings are zero-indexed, meaning the first character is at index 0.
        //Individual characters can be accessed using the charAt() method.
        // Example
        String text = "Java";
        char firstChar = text.charAt(1); // Returns 'a'
        System.out.println("The first indexed character of 'Java' is " + firstChar);

        System.out.println(space + "SubStrings" + space);
        //Substrings
        //Substrings can be extracted using the substring() method.
        // Example:
        String sentence = "Hello, world";
        String sub = sentence.substring(4, 10); // Returns "o, worl"
        System.out.println("Substring (4,10) of 'Hello, world' is: " + sub);

        System.out.println(space + "String Comparison" + space);
        // String Comparison
        //Use the compareTo() method to compare strings lexicographically.
        // Example:
        String str1c = "orange";
        String str2c = "cucumber";
        int result = str1c.compareTo(str2c); //Returns a negative value
        System.out.println("The result of the lexicographhical string comparison 'orange' & ' coucumber' is: " + result);

        System.out.println(space + "Concatenante two strings" + space);
        // More String Methods
        // concat(string): Concatenates two strings.
        // Example:
        String firstName2 = "Solomon";
        String lastName2 = "Ayuba";
        String fullName2 = firstName2.concat(" ").concat(lastName2);
        System.out.println("Concatenanted name is: " + fullName2);

        System.out.println(space + "UPPERCASE & lowercase string case" + space);
        //toUpperCase() and toLowerCase(): Converts the string’s case.
        // Example
        String text2 = "I love Java!";
        String upperCase = text.toUpperCase(); // Returns "I LOVE JAVA!"
        String lowerCase = text.toLowerCase(); // Returns "i love java!"
        System.out.println("uppercase string is: " + upperCase);
        System.out.println("lowercase string is: " + lowerCase);

        System.out.println(space + "String trim()" + space);
        //trim(): Removes leading and trailing whitespace.
        // Example:
        String input = "   I love java     ";
        String trimmed = input.trim(); // Returns "I love Java"
        System.out.println("Un t r i mm  ed string is: " + input);
        System.out.println("Trimmed string is: " + trimmed);


        System.out.println(space + "First String index" + space);
        //indexOf(string): Returns the index of the first occurrence of the specified substring.
        //Example:
        String sentence2 = "Java programming is always like java programming!";
        int firstIndex = sentence2.indexOf("Java"); // Returns 0
        System.out.println("The first indexed character of 'Java' is " + firstIndex);

        System.out.println(space + "Last String index " + space);
        //lastIndexOf(string): Returns the index of the last occurrence of the specified substring.
        String sentence3 = "Java programming is always like java programming!";
        int lastIndex = sentence2.lastIndexOf("Java"); // Returns 32
        System.out.println("The last index character of 'Java' is " + lastIndex);

        System.out.println(space + "prefix and suffix string finder" + space);
        //startsWith(prefix) and endsWith(suffix): Checks if the string starts or ends with the specified prefix or suffix.
        //Example
        String fileName = "assignment.txt";
        boolean startsWithDoc = fileName.startsWith("ass"); // Returns true
        boolean endsWithTxt = fileName.endsWith(".txt"); // Returns true
        System.out.println("Does the filename start with 'ass': " + startsWithDoc);
        System.out.println("Does the filename end with '.txt': " + endsWithTxt);

    }

    // Check week6StringReversal.java and week6StringManipulation.java files for the final exercise on Week 6


}

