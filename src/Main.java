import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }


        // For spacing between codes
        String space = "--------------------------------Space--------------------------------------------------";
        System.out.println(space);
        // For spacing between codes

        // Refer to Week 3 Control Flow.pdf for the following codes in this workspace

        /*
        Boolean AND Operator (&&)
        The AND operator returns true only if both operands are true.
        */
        boolean isSunny = true;
        boolean isWarm = true;
        boolean ANDresult = isSunny && isWarm; // result is true
        System.out.println("Boolean && Operator Result is: " + ANDresult);

        System.out.println(space);

        /*
        Boolean OR Operator (||)
        The OR operator returns true if at least one of the operands is true.
        */
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean ORresult = isWeekend || isHoliday; // result is true
        System.out.println("Boolean || Operator Result is: " + ORresult);

        System.out.println(space);

        /*
        Boolean NOT Operator (!)
        The NOT operator reverses the value of a boolean expression.
        */
        boolean hasPermission = false;
        boolean NOTresult = !hasPermission; // result is true
        System.out.println("Boolean NOT Operator Result is: " + NOTresult);

        System.out.println(space);

        /*
        Combining Boolean Operators
        You can combine multiple boolean expressions using boolean operators and parentheses.
         */
        boolean isSunnyb = true;
        boolean isWarmb = false;
        boolean isWeekendb = true;
        boolean CBresult = (isSunnyb && isWarmb) || isWeekendb; // result is true
        System.out.println("Boolean Combination Result is: " + CBresult);

        System.out.println(space);

        /*Short-Circuit Evaluation
        Java uses short-circuit evaluation for boolean operators.
        For &&, if the first operand is false, the second is not evaluated. For ||,
         if the first operand is true, the second is not evaluated. */
        /*
        boolean operand1 = false;
        boolean operand2 = true;
        No division by zero error due to short-circuit
        boolean SCresult = operand1 && (operand2 / 0);
        System.out.println("Short-Circuit Evaluation Result is: " + SCresult);
        */

        // System.out.println(space);

        /*
        Practical Application of Boolean Operators
        Applying boolean operators in an if statement:
        */
        int age = 16;
        boolean ifhasPermission = true;
        if (age >= 18 || ifhasPermission) {
            System.out.println("You're an adult. You can enter the event");
        } else {
            System.out.println("Sorry, you cannot enter the event.");
        }

        System.out.println(space);

        //CONDITIONAL STATEMENTS

        /*
        The "if" Statement
        The IF statement is the simplest form of conditional statement.
        It allows us to execute a block of code only if a certain condition is true.
         */
        int voteage = 25;
        if (voteage >= 18) {
            System.out.println("You are eligible to vote.");
        }

        System.out.println(space);

        /*
        The "if-else" Statement
        The IF-ELSE statement extends the if statement by providing an alternative code block to
        execute when the condition is false.
         */
        int score = 82;
        if (score >= 50) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You did not pass the exam.");
        }

        System.out.println(space);

        /*
        The "if-else if" Construct
        The if-else if construct allows us to check multiple conditions sequentially and
        execute different blocks of code accordingly.
        */

        int ieinum = 5;
        if (ieinum > 0) {
            System.out.println(ieinum + " is a positive number.");
        } else if (ieinum < 0) {
            System.out.println(ieinum + " is a negative number.");
        } else {
            System.out.println(ieinum + " is zero.");
        }

        System.out.println(space);

        /*
        The "switch" Statement
        The switch statement simplifies decision-making by evaluating a
        single expression against multiple cases.
         */
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday");
                break;
            // ... other cases ...
            default:
                System.out.println("Invalid Day");
        }

        System.out.println(space);

        //Conditional Statements
        int temperature = 24;
        if (temperature >= 29) {
            System.out.println("It's a hot day.");
        } else if (temperature >= 19) {
            System.out.println("It's a pleasant day.");
        } else {
            System.out.println("It's a cold day.");
        }

        System.out.println(space);

        // A Program to determine whether a given year is a leap year or not
        int givenYear = 2024;
        int division = 4;

        if (givenYear % division == 0 && (givenYear % 100 != 0 || givenYear % 400 == 0)) {
            System.out.println(givenYear + " is a leap year");
        } else {
            System.out.println(givenYear + " is not a leap year");
        }

        System.out.println(space);

        /*
        The "while" Loop
        The while loop repeatedly executes a block of code as long as a
        given condition remains true.
         */
        int count = 2;
        while (count <= 7) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println(space);


        /*
        Do-while loop
        The do-while loop ensures that the code block is executed at least once,
        even if the condition is false initially.
         */
        int num = 7;
        do {
            System.out.println("Number: " + num);
            num--;
        } while (num > 1);

        System.out.println(space);

        /*
        FOR loop
        The for loop provides a concise way to iterate over a range of values, such as arrays.
         */

        for (int i = 2; i <= 7; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println(space);

        /*
        BREAK Statement
        The break statement terminates the loop prematurely based on a specified condition.
         */

        for (int i = 0; i <= 8; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("Values: " + i);
        }

        System.out.println(space);

        /*
        Loop Control Statements: The "continue" Statement
        The continue statement skips the current iteration and proceeds to the next one.
        */

        for (int i = 0; i <= 8; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("Values: " + i);
        }

        System.out.println(space);

        /*
        Practical Application of Loop
        Applying loops to automate repetitive tasks:
         */

        int sum = 0;
        for (int i = 0; i <= 8; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        System.out.println(space);

        //Week 4 - Arrays | Thursday 7th June, 2024

        // Declaring and Initializing Arrays
        // Declare an integer array
        int[] numbers;

        // Declare and initialize a double array
        double[] grades = {90.5, 85.0, 78.2};

        // index 0 1 2 3 4
        int[] numbers1 = {10, 20, 30, 40, 50};

        // Accessing the third element (30)
        int thirdNumber = numbers1[2];

        // Error: Index 5 is out of bounds
        // int invalidNumber = numbers1 [5];

        System.out.println(space);

        //using Loops for Access

        //Code not working - debug
        /*
        int dumnum = 2;

        for (int i = 0; i < dumnum.length; i++) {
            System.out.println(array[i]);
        }
        */

        System.out.println(space);


        /*
        Storing student grades
        Suppose you have a class of students and you want to store their exam grades
         */
        double[] examGrades = {95.5, 88.0, 76.5, 92.3, 81.3};
        System.out.println("Student Exam Grades:");
        for (int i = 0; i < examGrades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + examGrades[i]);
        }

        System.out.println(space); //Space to seperate code

        /*
        Mid-Lesson Question:
            Write a java program to find the largest and smallest elements in an array of integers.
         */
        // int[] numberS = {10,6,3,7,9,15}; // produces false lowest number
        int[] numberS = {45, 18, 73, 27, 92, 15, 64, 3}; // same as first variable
        int smallestNumber = numberS[0];
        int largestNumber = numberS[0];

        for (int i = 1; i < numberS.length; i++) {
            if (numberS[i] < smallestNumber) {
                smallestNumber = numberS[i];
            }
            if (numberS[i] > largestNumber) {
                largestNumber = numberS[i];
            }
        }
        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println("The largest number is: " + largestNumber);

        System.out.println(space); //Space to seperate code

        // Common Array  Operations: INSERTION
        int[] numbersInsertion = {10, 20, 40, 50};
        // Insert 30 at index 2
        for (int i = numbersInsertion.length - 1; i > 2; i--) {
            numbersInsertion[i] = numbersInsertion[i - 1];
        }
        System.out.println(Arrays.toString(numbersInsertion));


        // DELETION
        int[] numbersDeletion = {10, 20, 30, 40, 50};
        // Delete element at index 2
        for (int i = 2; i < numbersDeletion.length - 1; i++) {
            numbersDeletion[i] = numbersDeletion[i + 1];
        }
        System.out.println(Arrays.toString(numbersDeletion));

        // UPDATING AND MODIFYING
        int[] numbersUpdate = {2, 10, 15};
        numbersUpdate[1] = 12; // Update the second element to 12
        System.out.println(Arrays.toString(numbersUpdate));

        // SEARCHING: Linear Search & Binary Search

        //Linear Search
        int[] ages = {25, 30, 22, 18, 40};
        int target = 22;
        int index = -1;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == target) {
                index = i;
                break;
            }
        }


        //Sorting
        int[] unsorted = {45, 10, 78, 23, 56};
        Arrays.sort(unsorted); // sort in ascending order
        System.out.println(Arrays.toString(unsorted));

        System.out.println(space);

        // Iterating through arrays
        String[] namesIteration = {"Alice", "Bob", "Charlie"};
        for (String names : namesIteration) {
            System.out.println(names);
        }
        System.out.println(space);

        // Finding Maximum and Minimum
        int[] values = {34, 78, 12, 56, 90};
        int min = values[0];
        int max = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        System.out.println(space);

        //Aggregate Operations
        //Summing
        int[] quantities = {5, 10, 15, 8, 13};
        int zum = 0;
        for (int quantity : quantities) {
            zum += quantity;
        }
        int avg = zum / quantities.length;

        System.out.println("The sum of " + Arrays.toString(quantities) + " is = " + zum + " and average = " + avg);

        System.out.println(space);

        /*
        Array Length
        The length of an array can be accessed using the length property.
        This property indicates the number of elements in the array.
         */

        int[] numArr = {10, 20, 30, 40, 50};
        int arrayLength = numArr.length; // 5
        System.out.println("Length of the array is: " + arrayLength);

        System.out.println(space);

        // MODIFYING ARRAYS

        int[] arrays = {1, 2, 3};
        arrays[0] = 5;
        System.out.println("Modified first element of the array is: " + arrays[0]);

        System.out.println(space);

        // Practical Application of Arrays
        int[] scores = {90, 85, 95, 80, 75};
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = (double) total / scores.length;
        System.out.println("Average score is: " + average);

        System.out.println(space);

        //Multi-dimensional Arrays
        // Declaring a 2D array with 3 rows and 2 columns

        int[][] matrix = new int[3][2];

        // Initializing a 2D array
        int[][] numbers2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing an element in the 2D array
        int element = numbers2[1][2]; //6

        System.out.println(space);

        // Practical Example: Displaying a 2D array
        int[][] numbers3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                System.out.print(numbers3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(space);

        //Practical Application of Arrays
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum2 = 0;

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                sum2 += matrix2[i][j];
            }
        }

        System.out.println("Sum of all elements in the 2D array is: " + sum2);

        System.out.println(space);

        //String Arrays
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println(space);

        // Practical Example: Counting the number of vowels in a string
        String text = "Hello, world!";
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the text: " + vowelCount);

        System.out.println(space);

        /*
        String Methods
        Strings in Java come with several useful methods to manipulate and process text.
         */

        // Concatenation
        String str1 = "Hello";
        String str2 = "world";
        String message = str1 + ", " + str2 + "!";
        System.out.println("The message is: " + message);

        //Length
        String text1 = "Hello, world!";
        int textLength = text1.length(); // 13
        System.out.println("Length of the text is: " + textLength);

        System.out.println(space);

        //Week 5 - Methods and Functions

        //Creating a Simple Method
        // Declare a simple method
        //Method that takes two numbers as arguments and returns their sum
        int number1 = 5;
        int number2 = 3;

        int sumresult = add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sumresult);

        System.out.println(space);

        //Practical Example: Calculating the square of a number using a method
        int inputNumber = 7;
        int square = square(inputNumber);
        System.out.println("The square of " + inputNumber + " is: " + square);

        System.out.println(space);

        // Practical Example: Calculating the average of an array of numbers using a method
        int[] numbers4 = {10, 20, 30, 40, 50};
        double average2 = calculateAverage(numbers4);
        System.out.println("The average is: " + average2);

        System.out.println(space);

        // Method Overloading
        // Practical Example: Calculating the sum of integers using method overloading

        int sum1a = add(2, 3); // Uses the first add method
        int sum2b = add(1, 4, 5); // Uses the second add method
        System.out.println("Sum of two integers: " + sum1a);
        System.out.println("Sum of three integers: " + sum2b);

        System.out.println(space);

        // Recursion
        // Practical Example: Calculating the factorial of a number using recursion
        int factNumber = 5;
        int factorial = calculateFactorial(factNumber);
        System.out.println("Factorial of " + factNumber + " is: " + factorial);

        System.out.println(space);

        //Practical Example: Calculating the sum of an array of integers using recursion
        int[] numbers5 = {1, 2, 3, 4, 5};
        int totalSum = calculateSum(numbers5, numbers5.length);
        System.out.println("The sum of the array is: " + totalSum);

        System.out.println(space);

        // Practical Example: Calculating the power of a number using recursion
        int base = 2;
        int exponent = 3;
        int powerResult = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);

        System.out.println(space);
    }

    // Method that adds two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    //Method that returns the square of a number
    public static int square(int num) {
        return num * num;
    }

    // Method to calculate the average of an array of numbers
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return (double) total / numbers.length;
    }

    //Method Overloading Example
    // Method to add two integers
     /*
      public static int add(int a, int b) {
        return a + b;
    }
    */

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Recursion Example
    // Method to calculate the factorial of a number using recursion
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Method to calculate the sum of an array of integers using recursion
    public static int calculateSum(int[] numbers, int length) {
        if (length == 0) {
            return 0;
        }
        return numbers[length - 1] + calculateSum(numbers, length - 1);
    }

    // Method to calculate the power of a number using recursion
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }
    // Refer to simplecalculator.java for Week 5 Mid-Week Question on Simple Calculator code

    /*
        // For spacing between codes
        String spacex = "--------------------------------Space--------------------------------------------------";
        System.out.println(spacex);
        // For spacing between codes
        System.out.println(spacex + "WEEK 5 Basic Input/Output and String Processing | Friday 18th June, 2024");
    */

    //Refer to week6.java for Week 6 lesson


}

























































































