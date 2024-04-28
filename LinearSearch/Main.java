package LinearSearch;

public class Main {
    
    public static void main(String[] args) {
        
        /**
         * Linear Search:
         * Iterate through a collection - one element at a time.
         * 
         * - Has a run-time complexity of O(n) linear time.
         * 
         * Disadvantages:
         * - Slow for large data sets.
         * 
         * Advantages:
         * - Fast for search of small to medium data sets.
         * - Does not need to be sorted.
         * - Useful for data structures that do not have random access (LinkedList) .
         */

        int[] arr = { 3, 77, 9, 23, 1, 51, 81, 37, 1, 32, 6 };

        int index = linearSearch(arr, 3);

    }

    private static int linearSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println(val + " found at index: " + i);
                return i;
            }
        }
        System.out.println(val + " was not found!");
        return -1;
    }

}
