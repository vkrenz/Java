public class Main {
    
    public static void main(String[] args) {

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

    }

}