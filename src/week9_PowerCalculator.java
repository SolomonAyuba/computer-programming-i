public class week9_PowerCalculator {
    public static void main(String[] args) {
   /*
    Mid-lesson question
    Create a Java program to calculate the result of raising a number to a non-negative integer power using recursion.
    Implement a method calculatePower() that takes two integers base and exponent as parameters and returns the
    result of raising base to the power of exponent.
    */

        int base = 3;
        int exponent = 4;

        int result = Main.calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int calculatorPower(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else {
            return base * calculatorPower(base, exponent - 1);
        }
    }
}
