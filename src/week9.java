public class week9 {
    public static void main(String[] args){

        // For spacing between codes
        String space = "---------";
        System.out.println(space + "WEEK 9: Recursion | Tuesday 16th July, 2024"
                + space);

        //WEEK 9: Recursion | Tuesday 16th July, 2024

        int n = 5;
        int result = week9_FactorialRecursion.factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
        // Output
        // Factorial 5 is 120
    }
}
        /*
        Recursive vs Iterative Approaches
        Recursive solutions often lead to concise and elegant code.
        However, recursion may have performance overhead due to function calls and stack usage.
        Iterative solutions are often more efficient and straightforward for certain problems.
         */

        // Factorial: Recursive vs Iterative Solutions
        static int factorialRecursion(int n){
            if (n== 0 || n==1){
                return 1; // Base Case
            } else {
                return n * week9_FactorialRecursion.factorial(n-1); // Recursive case
            }
        }

         static int factorialIteration(int n){
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
         }

         // Fibonacci: Recursive vs Iterative Solutions
         static int fibonacciRecursive(int n2){
             if (n2 <= 0) {
                 return 0;
             } else if (n2 == 1){
                 return 1;
             } else {
                 return fibonacciRecursive(n2 - 1) + fibonacciRecursive(n2 - 2);
             }
         }

        static int[] fibonacciIterative(int n2){
            int[] fibSequence = new int[n2];
            if (n2 >= 1){
                fibSequence[0] = 0;
            }
            if (n2 >= 2){
                fibSequence[1] = 1;
            }
            for (int i = 2; i < n2; i++){
                fibSequence[i] = fibSequence[i-1] + fibSequence[i-2];
            }
            return fibSequence;
        }


    public void main() {
        int n = 5;
        // Output: Factorial using recursion: 120
        System.out.println("Factorial using recursion: " + factorialRecursion(n));

        //Output: Factorial using iteration: 120
        System.out.println("Factorial using iteration: " + factorialIteration(n));

        //Fibonacci: Recursive vs Iterative Solutions
        int n2 = 10; // Calculate the first 10 Fibonacci numbers

        // Recursive approach
        System.out.println("Recursive Fibonacci:");
        for (int i = 0; i < n2; i++){
            System.out.println(fibonacciRecursive(i)+ " ");
        } // Output: Recursive Fibonnaci: 0 1 1 2 3 5 8 13 21 34

        // Iterative approach
        System.out.println("Iterative Fibonacci:");
        int[] result = fibonacciIterative(n2);
        for (int fib : result){
            System.out.println(fib + " ");
        } // Output: Iterative Fibonacci: 0 1 1 2 3 5 8 13 21 34


        }
