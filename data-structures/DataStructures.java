
/**
 * Notes:
 * A data structure is a named location that can be used to store and organize data.
 */

public class DataStructures {

    public static void main (String[] args) {

        /**
         * Stack:
         * LIFO data structure. Last-In First-Out.
         * Stores objects into a sort of 'vertical tower'.
         * Stack.push(object) to add to the top.
         * Stack.pop(object) to remove from the top.
         * 
         * Imagine:
         * Stack of books
         * Stack of CD's
         * 
         * Uses of stacks:
         * 1. undo/redo features in text editors
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms (maze, file directory)
         * 4. calling functions (call stack)
         */

        // Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty()); // true

        // stack.push("Minecraft");
        // stack.push("Skyrim");
        // stack.push("Doom");
        // stack.push("Borderlands");
        // stack.push("FFVII");

        // System.out.println(stack.empty()); // false

        // System.out.println(stack); // list all items in stack

        // stack.pop();

        // System.out.println(stack); // remove FFVII

        // // stack.pop() will return the object removed
        // String FavGame = stack.pop();
        // System.out.println(FavGame);
        // System.out.println(stack);

        // // View the top-most object in the stack
        // System.out.println(stack.peek());

        // // Search within the stack
        // System.out.println(stack.search("Skyrim")); // returns the index (not off-by-one)
        // // returns -1 if not found

        // with stacks we can run out of memory
        // for (int i = 0; i < 1000000000; i++) {
        //     stack.push("Fallout76");
        // }
        //will throw: Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

/** ------------------------------------------------------------------------------------------ */

        /**
         * Queue:
         * FIFO data structure. First-In First-Out (ex. a line of people).
         * A collection designed for holding elements prior to processing linear data structures.
         * 
         * add: enqueue, offer()
         * remove: dequeue, poll()
         * 
         * 2 Classes in Java implement Queues, as queue is not a class but an interface.
         * - LinkedList
         * - PriorityQueue
         */

        // Queue<String> queue = new LinkedList<String>();

        /**
         * Queue inherits add(), remove() and element() methods (will throw error/exception)
         * Better to use offer(E), poll(E) and peek() methods instead as they will not throw error/exception
         */

        // queue.offer("Karen");
        // queue.offer("Chad");
        // queue.offer("Steve");
        // queue.offer("Harold");

        // System.out.println(queue);

        // System.out.println(queue.peek()); // view the front of the queue

        // queue.poll();  // remove Karen from the front of the queue (Karen is the first in, first out)

        // System.out.println(queue);

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.contains("Bro"));
        // System.out.println(queue.contains("Chad"));
    
        /**
         * Where are queues useful?
         * 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
         * 2. Printer queue (Print jobs should be completed in order)
         * 3. Used in LinkedLists, PriorityQueues, Breadth-first search algorithms.
         */

/** ------------------------------------------------------------------------------------------ */

        /**
         * PriorityQueue:
         * A FIFO data structure that serves elements with the highest priorities first before mements with lower priority.
         */


        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(4.0);
        // queue.offer(1.5);
        // queue.offer(2.0);

        // while(!queue.isEmpty()) {

        //     System.out.println(queue.poll());

        // }

        // Queue<String> queue = new PriorityQueue<>();

        // queue.offer("B");
        // queue.offer("C");
        // queue.offer("A");
        // queue.offer("F");
        // queue.offer("D");

        // while (!queue.isEmpty()) {

        //     System.out.println(queue.poll());

        // }

/** ------------------------------------------------------------------------------------------ */

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
         * 2. Insertion and Deletion of nodes is easy. O(1) linear operation.
         * 3. No/low memory waste.
         */

/** ------------------------------------------------------------------------------------------ */

        /**
         * Dynamic Array:
         * 
         */



    }

}