public class Main {

    public static void main(String[] args) {

        /**
         * Arrays:
         * Used to store multiuple values in a single variable.
         */

        // Initialize an array of cars
        // String[] cars = { "Camaro", "Corvette", "Tesla" };

        // Access an element (first element)
        // System.out.println(cars[0]);

        // Access the last element
        // System.out.println(cars[cars.length - 1]);

        /**
         * Steps to insert an item into the array:
         * 1. Create a new array with one more element.
         * 2. Copy existing elements.
         * 3. Insert the new item.
         */

        // String[] newCars = new String[cars.length + 1];

        // for (int i = 0; i < cars.length; i++) {
        //      newCars[i] = cars[i];
        // }

        // newCars[cars.length] = "Mustang";

        // for(int i = 0; i < newCars.length; i++) {
        //     System.out.println(newCars[i]);
        // }

        /**
         * Steps to remove an item from an array:
         * 1. Create a new array with less element.
         * 2. Copy elements before the one to remove.
         */

        //  String[] newCars = new String[cars.length - 1];

        //  int indexToRemove = 1; // index of "Corvette"

        //  for (int i = 0, j = 0; i < cars.length; i++) {
        //     if (i != indexToRemove) {
        //         newCars[j] = cars[i];
        //         j++;
        //     } else {
        //         System.out.println("Removed: " + cars[i]);
        //     }
        // }

        // for (int i = 0; i < newCars.length; i++) {
        //     System.out.println(i + 1 + ". " + newCars[i]);
        // }

        // Update an item in the cars array
        // int index = 1;
        // String newValue = "Honda";

        // if (index >= 0 && index < cars.length) {
        //     // Update the item
        //     cars[index] = newValue;
        // } else {
        //     System.out.println("Index is out of bounds!");
        // }

        // System.out.println("New Value: " + cars[index]);

        // Find an item in an array
        // String carToFindIndex = "Corvette";

        // for (int i = 0; i < cars.length; i++) {
        //     if (cars[i] == carToFindIndex) {
        //         System.out.println(carToFindIndex + " is located at index: " + i);
        //     }
        // }

        // int indexToFind = 2;

        // for (int i = 0; i < cars.length; i++) {
        //     if (i == indexToFind) {
        //         System.out.println("Index " + indexToFind + " contains: " + cars[i]);
        //     }
        // }

        // Loop over an array:
        // for (int i = 0; i < cars.length; i++) {
        //     System.out.println(i + 1 + ". " + cars[i]);
        // }

        // Copy an array
        // Copy cars -> copyCars
        // String[] copyCars = new String[cars.length];
        // for (int i = 0; i < cars.length; i++) {
        //     copyCars[i] = cars[i];
        // }

        // for (int i = 0; i < copyCars.length; i++) {
        //     System.out.println(i + 1 + ". " + copyCars[i]);
        // }

        // Copy part of an array:
        // int[] longArray = { 77, 3, 507, 23, 19, 43, 26, 381, 22, 3198, 23, 128, 32, 12 };
        // //                      ^   ^   ^   ^   ^   ^

        // int indexFrom = 1, indexTo = 6;

        // int[] copiedArray = new int[(indexTo - indexFrom) + 1];

        // for (int i = 0, j = 0; i < longArray.length; i++) {
        //     if (i >= indexFrom && i <= indexTo) {
        //         copiedArray[j] = longArray[i];
        //         j++;
        //     }
        // }

        // for (int i = 0; i < copiedArray.length; i++) {
        //     System.out.println(copiedArray[i]);
        // }

        // System.out.println("copiedArray Length: " + copiedArray.length);

        /**
         * Manually sort an array (bubble sort vs selection sort)
         */

        // int[] longArray = { 77, 3, 507, 23, 19, 43, 26, 381, 22, 3198, 23, 128, 32, 12 };

        // System.out.print("Before sort: ");
        // for (int i = 0; i < longArray.length; i++) System.out.print(longArray[i] + ", ");
        // System.out.println();

        // // Bubble sort:
        // for (int i = 0; i < longArray.length - 1; i++) {
        //     for (int j = 0; j < longArray.length - i - 1; j++) {
        //         if (longArray[j] > longArray[j + 1]) {
        //             // Swap longArray[j + 1] and longArray[j]
        //             int temp = longArray[j];
        //             longArray[j] = longArray[j + 1];
        //             longArray[j + 1] = temp;
        //         }
        //     }
        // }

        // // Print the bubble sorted array
        // System.out.print("After bubble sort: ");
        // for (int i = 0; i < longArray.length; i++) System.out.print(longArray[i] + ", ");
         
        // Array.sort() is much easier than bubble sort

        // Reverse an array:

        // int[] longArray = { 77, 3, 507, 23, 19, 43, 26, 381, 22, 3198, 23, 128, 32, 12 };

        // for (int i = 0; i < longArray.length / 2; i++) {
        //     int temp = longArray[i];
        //     longArray[i] = longArray[longArray.length - 1 - i];
        //     longArray[longArray.length - 1 - i] = temp;
        // }

        // for (int i = 0; i < longArray.length; i++) System.out.print(longArray[i] + ", ");

        // Swapping two items
        
        // int[] longArray = { 77, 3, 507, 23, 19, 43, 26, 381, 22, 3198, 23, 128, 32, 12 };
        // //                         ^            ^

        // int a = 507, b = 43, aIndex = -1, bIndex = -1;

        // // Find both positons of a and b
        // for (int i = 0; i < longArray.length; i++) {
        //     if (longArray[i] == a) {
        //         aIndex = i;
        //     } else if (longArray[i] == b) {
        //         bIndex = i;
        //     }
        // }

        // // If both are found then swap the index
        // if (aIndex != -1 && bIndex != -1) {
        //     int temp = longArray[aIndex];
        //     longArray[aIndex] = longArray[bIndex];
        //     longArray[bIndex] = temp;
        //     System.out.println(longArray[aIndex] + " and " + longArray[bIndex] + " have been swapped successfully!");
        //     for (int i = 0; i < longArray.length; i++) System.out.print(longArray[i] + ", ");
        // }

        // Filter an array:
        // ex. filter all even numbers:

        // int[] longArray = { 77, 3, 507, 23, 19, 43, 26, 381, 22, 3198, 23, 128, 32, 12 };

        // int[] filteredArray = new int[longArray.length];

        // String filter = "even";

        // if (filter == "even") {
        //     for (int i = 0; i < longArray.length; i++) {
        //         if (longArray[i] % 2 == 0) {
        //             filteredArray[i] = longArray[i];
        //         }
        //     }
        // }

        // for (int i = 0; i < longArray.length; i++) {
        //     if (filteredArray[i] != 0){
        //         System.out.print(filteredArray[i] + ", ");
        //     }
        // }

        /**
         * ArrayList:
         * A better alternative to Arrays, allows of dynamic resizing.
         */


    }

}