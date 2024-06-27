public class simpleCalculator {
        public static void main(String[] args) {
          /*
        WEEK 5: METHODS
        Mid-Lesson Question
        Write a Java program that simulates a simple calculator with four basic arithmetic operations:
         addition, subtraction, multiplication, and division. Implement each operation as a separate method
         */
            double num1 = 20;
            double num2 = 5;

            System.out.println("Addition: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " + divide(num1, num2));
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a / b;

        }


    }

