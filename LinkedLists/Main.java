import java.util.LinkedList;
public class Main {

    public static int findNode(LinkedList<String> list, String val) {
        int index = 0;
        for (String key : list) {
            if (key.equals(val)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void loopOverLinkedList(LinkedList<String> list) {
        for (String key : list) {
            System.out.println(key);
        }
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        int i = 0, j = list.size() - 1;
        while ( i < j) {
            // Swap the elements at indicies i and j
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            // Move towards the middle of the list
            i++;
            j--;
        }

        return list;
    }

    public static LinkedList<String> swapTwoNodes(LinkedList<String> list, int indexA, int indexB) {
        String temp = list.get(indexA);
        list.set(indexA, list.get(indexB));
        list.set(indexB, temp);
        return list;
    }

    public static void main(String[] args) {


        /**
         * Singly LinkedList:
         * [ Data | Address ] -> [ Data | Address ] -> [ Data | Address ]
         *      Node                  Node                  Node
         * 
         * Doubly LinkedList:
         * [ Address | Data | Address ] <-> [ Address | Data | Address ]
         *             Node                             Node
         */

        /**
         * LinkedList (singly):
         * LinkedLists have the advantage of easily adding and deleting new elements over an array. A linked list is made up of a long chain of nodes. Each node contains two (2) parts.
         * 
         * Part 1: Data which is stored.
         * Part 2: Address to the next node in line. (Pointer)
         * 
         * LinkedLists to do not have index like arrays do
         * 
         * Important: These nodes are 'non-contiguous'
         * Each node knows where the next one recides.
         * 
         * The last node should have an address of 'null'.
         * 
         * Steps to insert a node in a LinkedList:
         * 1. Take address stored in the prev node and assign it to the new node address so that the new node is pointing to the next node in line.
         * 2. Change the prev address to point to the new node address.
         * 
         * Steps to delete a node in a LinkedList:
         * 1. Change the prev node to point to the next node in line.
         * 
         * LinkedList tends to be infior to arrays because they are bad at searching for elements. We cannot randomly access an elements in a LinkedList, simply because LinkedLists to do not have indexes. To locate an element in a LinkedList we must start from the head (first) node and work our way down. This would take linear time O(n).
         * 
         * The insertion or deletion of a node is constant O(1)
         * 
         * LinkedList (doubly):
         * A doubly LinkedList requires even more memory to store two (2) addresses. One is for the previous node address and the other is for the next node address. The benefit of a doubly LinkedList is that we can traverse forward and backwards. Each node knows the the next and previous node is. 
         */

        //  LinkedList<String> linkedList = new LinkedList<String>();

        //  // We're also able to treat a LinkedList as a Stack or a Queue
        //  // push() or offer() to add elements to linkedList
        //  // pop() or poll() to remove elements from linkedList
        //  linkedList.push("A");
        //  linkedList.push("B");
        //  linkedList.push("C");
        //  linkedList.push("D");
        //  linkedList.push("F");

        //  System.out.println(linkedList);

        //  linkedList.pop(); // Remove "F"

        //  System.out.println(linkedList);

        //  linkedList.add(4, "E"); // 4 is the index
        //  System.out.println(linkedList);
        
        //  linkedList.remove("E");
        //  System.out.println(linkedList);

        //  // view the index of element (searching for an element)
        //  System.out.println(linkedList.indexOf("C"));

        //  // Few more important methods to know for LinkedLists:
        //  System.out.println(linkedList.peekFirst());
        //  System.out.println(linkedList.peekLast());

        //  // We can add new nodes to the head or the tail of the LinkedLists using:
        //  linkedList.addFirst("E");
        //  linkedList.addLast("G");

        //  // Store in a variable
        //  String first = linkedList.removeFirst();
        //  String last = linkedList.removeLast();

        /**
         * Advtantages of a LinkedList?
         * 1. Dynamic Data Strcture (allocates memory while running).
         * 2. Insertion and Deletion of nodes is easy. O(1).
         * 3. No/low memory waste.
         * 
         * Disatvantages?
         * 1. Greater memory usage (because of the additional pointer)
         * 2. No random access of leements (no index [i])
         * 3. Accessing/searching elements is more time consuming. O(n) or linear time complexity.
         * 
         * Uses?
         * 1. Implement Stacks/Queues.
         * 2. GPS navigation.
         * 3. Music Playlist.
         */

         LinkedList<String> linkedList = new LinkedList<String>();

         linkedList.add("Red");
         linkedList.add("Green");
         linkedList.add("Blue");

        // int index = linkedList.indexOf("Red");

        // if (index >= 0 && index <= linkedList.size()) {
        //     // Validate index, then update the node
        //     linkedList.set(index, "Purple");
        // }

        // System.out.println(linkedList);

        // String valToFind = "Blue";
        // int index = 0;
        // boolean found = false;

        // for (String val :  linkedList) {
        //     // Check if current node's value matches valToFind
        //     if (val.equals(valToFind)) {
        //         found = true;
        //         break;
        //     }
        //     index++;
        // }

        // System.out.println(valToFind + " is located at index: " + index);

        // // I also wrote a method to find the index of a node
        // System.out.println(findNode(linkedList, "Green"));

        // loopOverLinkedList(linkedList);

        // LinkedList<String> reversed = reverseLinkedList(linkedList);
        // System.out.println(reversed);
        
        // LinkedList<String> swapped = swapTwoNodes(linkedList, 0, 2);
        // System.out.println(swapped);

    }

}