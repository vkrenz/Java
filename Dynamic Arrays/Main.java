public class Main {
    
    public static void main(String[] args) {

        /**
         * Dynamic Arrays are known as:
         * Java: ArrayList
         * C++: Vector
         * Javascript: Array
         * Python: List
         */

        // Static Array ex:
        //  String[] staticArray = new String[10];
        // Fixed capacity
        // We can randomly access an element in O(1) constant time.
        // Searching for a stored value still takes O(n) time, as the data set increases so does the time.

        // Dynamic Array will instantiate a new array when the static array reaches capacity.
        // It will increase automatically ~1.5-2x in size and copy over all the elements.

        // Advantages of dynamic arrays:
        // 1. Random access of elements O(1).
        // 2. Good locality of reference and data cache utilization.
        // 3. Easy to insert/delete elements at the end.

        // Disadvantages of dynamic arrays:
        // 1. Wastes more memory than a static array
        // 2. Shifting elements is time consuming O(n).
        // 3. Expanding and shrinking the array is time consuming O(n).
        
        // To create a dynamic array (built-in):
        // ArrayList<String> arrayList = new ArrayList<String>();

        // Creating our own dynamic array (ArrayList is better use in general):
        DynamicArray da = new DynamicArray(3);

        da.add("Bob");
        da.add("Bill");
        da.add("John");
        da.add("Alex");
        da.add("Michael");
        da.add("Emma");
        da.add("Victor");

        da.insert(1, "Bro");

        da.delete("John");
        da.delete("Alex");
        da.delete("Michael");
        da.delete("Emma");
        da.delete("Victor");

        System.out.println("Alex is at index: " + da.search("Alex"));

        System.out.println(da);
        System.out.println("Empty: " + da.isEmpty());
        System.out.println("Capacity: " + da.cap);
        System.out.println("Size: " + da.size);

    }

}