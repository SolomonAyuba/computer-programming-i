public class week9_FactorialRecursion{
        // Recursive function to calculate factorial
        static int factorial(int n){
            if (n== 0 || n==1){
                return 1; // Base Case
            } else {
                return n * factorial(n-1); // Recursive case
            }
        }

}
