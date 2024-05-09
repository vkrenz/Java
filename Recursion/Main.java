package Recursion;

public class Main {

    public static void main(String[] args) {
        
        /**
         * Recursion:
         * When a thing is defined in terms of itself. (Wikipedia).
         * Apply the result of a procsude, to a procedure.
         * A recursive method calls itself. Can be a substiture for iteration.
         * Divide a problem into sub-problems of the same type as the original.
         * Commonly used with advanced sorting algorithms and navigating trees.
         * 
         * Advtantages:
         * - Easier to read/write.
         * - Easier to debug.
         * 
         * Disadvantages:
         * - Sometimes slow.
         * - Uses more memory.
         * */

        //  walk(5);

        // int result = factorial(7);

        // System.out.println(result);

        int result = power(2, 8);
        System.out.println(result);

    }

    private static int power(int base, int exp) {
        if (exp < 1) return 1;
        return base * power(base, exp - 1);
    }

    // private static int factorial(int num) {
    //     if (num < 1) return 1;
    //     return num * factorial(num - 1);
    // }

    // private static void walk(int steps) {
    //     if (steps < 1) return; // Base case
    //     System.out.println("You take a step!");
    //     walk(steps-1); // Recursive case
    // }

    // private static void walk(int steps) {
    //     for (int i = 0; i < steps; i++) {
    //         System.out.println("You take a step!");
    //     }
    // }
    
}
