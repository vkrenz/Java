package BubbleSort;

public class Main {

    public static void main(String[] args) {
        
        /**
         * Bubble Sort:
         * Pairs of adjacent elemts are compares, and the elements
         * swapped if they are not in order.
         * 
         * Has a run time complexity of O(n^2) quadratic time.
         * The larger the data set the worse the time complexity is.
         */

         int arr[] = { 5, 29, 3, 98, 67, 32, 145, 23, 44, 682, 31, 59, 99, 238, 92 };

         bubbleSort(arr);
         bubbleSortDesc(arr);

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

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
}
