package BinarySearch;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        /**
         * Binary Search:
         * Search algorithm that finds the position of a targer value within a sorted array.
         * Half of the array is eliminated during each "step".
         * 
         * value = "H";
         * index = ?;
         * 
         *    0   1   2   3   4   5   6   7   8   9   10
         *   --- --- --- --- --- --- --- --- --- --- ---
         * | A | B | C | D | E | F | G | H | I | J | K |
         * --- --- --- --- --- --- --- --- --- --- ---
         * 
         * - Always begin in the middle of the array and check to see if the value is equal to the value
         * we are looking for.
         * - If the value we are looking for is greater than the middle value we can safely remove the first half of the array.
         * - Then in the second half we again begin in the middle of the array and check if the value we are looking for is in the middle.
         * ... and so on until the value is found.
         * 
         * - Binary search isn't effeciant when working with small data sets. 
         * 
         * - The time complexity of a binary search is O(log n) logorithmic time.
         */

        int array[] = new int[1000000];
        int target = 609566;
        // binarySearch only takes 19 steps to find 609566 as opposed to a linear search

        //  Populate `array[]`
        for (int i = 0; i < array.length; i++) array[i] = i;

        // Built in Arrays method
        // int index = Arrays.binarySearch(array, target);

        // Custom written binarySearch
        int index = binarySearch(array, target);

        if (index == -1) System.out.println(target + " not found");
        else System.out.println("Element found at index: " + index);
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1, i = 1;
        while(low <= high) {
            // Find the middle index of the array
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println(i + ". Middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; // Target is found;

            i++;
        }
        return -1;
    }

}
