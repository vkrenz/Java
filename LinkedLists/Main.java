public class Main {

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

    }

}