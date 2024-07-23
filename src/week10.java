public class week10 {
    public static void main (String[] args){

    // For spacing between codes
    String space = "---------";
    System.out.println(space + "WEEK 10: Exceptions and Debugging | Tuesday 16th July, 2024"
            + space);

    //WEEK 10: Exceptions and Debugging | Tuesday 16th July, 2024

    /*
    Common Programming Errors: Syntax Errors
    Syntax errors occur when the code violates the rules of the programming language.
    These errors are caught by the compiler during the compilation process and prevent the program from running.
    Example
    public class SyntaxErrorExample {
        public static void main(String[] args) {
        // missing semicolon (5)
        int × = 5
        System.out.printin("value of x: " + :x);
        }
    }
     */


    /*
    Logic Errors
    Logic errors are mistakes in the design or implementation of the code that lead to incorrect or unexpected results.
    These errors don’t necessarily cause the program to crash, but they can produce inaccurate outcomes.
    Examples:
    public class LogicErrorExample {
        public static void main(String[] args) {
        int x = 5;
        int y = 10;
        / Subtraction instead of addition
        int result = X - y;
        system.out .printIn("Sum of x and y: " + result) ;
        }
     }
     */


    /*
    Runtime Errors:
    Runtime errors, also known as exceptions, occur during program execution.
    They are caused by unexpected conditions such as division by zero, accessing an out-of-bounds array index,
    or attempting to open a non-existent file.
    Example

    public class RuntimeErrorExample {
        public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 1];
        # Element at index 4 does not exist
        System.out .printIn(numbers [4]);
        }
    }
     */


        /*
        Exceptions:
        Exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions.
        They can be caused by various factors such as invalid inputs, system errors, and unexpected conditions.
        Java provides a robust exception-handling mechanism that allows programmers to gracefully handle and recover
        from exceptional situations.
         */
    }
}
