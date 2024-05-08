/**
 * Big O Notation:
 * ** How code slows as data grows **
 * 
 * 1. Describes the performance of an algorithm as the amount of data increases.
 * 2. Machine independent (# of steps to completion).
 * 3. Ignore smaller operations O(n + 1) = O(n).
 * 
 * Examples:
 * O(1)
 * O(n)
 * O(log n)
 * O(n^2)
 * 
 * n = amount of data (it's a variable like x)
 * 
 * 
 */

public class Main {

    // Example of O(n) linear time
    // n = 1,000,000
    // steps = ~1,000,000
    // int addUp(int n) {
    //     int sum = 0;
    //     for (int i = 0; i <= n; i++) {
    //         sum += i;
    //     }
    //     return sum;
    // }

    // Example of O(1) constant time
<<<<<<< Updated upstream
    // n = 1000000
    //steps = 3
=======
    // n []
>>>>>>> Stashed changes
    int addUp(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
    }

}
