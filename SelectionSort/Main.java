package SelectionSort;

public class Main {

    public static void main(String[] args) {

        /**
         * Selection Sort:
         * Search through an array and keep track of the minimum value during each
         * iteration. At the end of the iteration, we swap variables.
         * 
         * Has a run time complexty of O(n^2) quadratic time complexity.
         * The more data the less efficient selection sort is.
         */

         int arr[] = { 6, 2, 89, 4, 1, 89, 98, 45, 9, 18, 22, 332 };

        //  selectionSort(arr);
        selectionSortDesc(arr);

         for (int num : arr) {
            if (arr[arr.length - 1] != num) {
                System.out.print(num + ", ");
            }
            else {
                System.out.print(num);
                System.out.println();
            }
         }
        
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    private static void selectionSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}
