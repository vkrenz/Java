package InsertionSort;

public class Main {
    
    public static void main(String[] args) {
        
        /**
         * Inseration Sort:
         * After comparing elements to the left
         * shift elements to the right to make room to inser a value.
         * 
         * Insertion Sort has a time complexity of O(n^2) quadratic time.
         * Small data set = decent
         * Large data set = bad
         * 
         * Less steps than bubble sort.
         * Best case is O(n) comparedn to Selection Sort O(n^2).
         */

         int arr[] = { 9, 5, 61, 2, 90, 44, 21, 5, 32, 189, 5, 89 };

         insertionSort(arr);

         for (int num : arr) {
            if (arr[arr.length - 1] != num) System.out.print(num + ", ");
            else System.out.print(num + "\n");
         }

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--; 
            }
            arr[j + 1] = temp;
        }
    }

}
