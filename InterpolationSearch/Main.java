package InterpolationSearch;

public class Main {
    public static void main(String[] args) {
        
        /**
         * Interpolation search:
         * improvment over vinary search best used for "uniformly" distributed data
         * "guesses" where a value might be based on calculated probe results if probe is
         * incorrect, search area is narrowed, and a new probe is calculated.
         * 
         * Average case: O(log(log(n))).
         * Worst case: O(n) - values increase exponentially.
         */

        //  int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] array = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1024, 2048, 4096, 8192, 16384 };

         int index = interpolationSearch(array, 32);

         if (index != -1) System.out.println("Element found at index: " + index);
         else System.out.println("Element not found!");

    }

    private static int interpolationSearch(int[] array, int val) {
        int high = array.length -1, low = 0;
        while (val >= array[low] && val <= array[high] && low <= high) {
            int probe = low + (high - low) * (val - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: " + probe);

            if (array[probe] == val) {
                return probe;
            }
            else if (array[probe] < val) {
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
