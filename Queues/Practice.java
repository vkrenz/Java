import java.util.LinkedList;
import java.util.Queue;
public class Practice {


    
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        // Enque items to the queue
        queue.add("Bob");
        queue.add("John");
        queue.add("Victor");
        queue.add("Bro");

        System.out.println(queue);
        
        // Dequeue items from the queue
        String removed = queue.remove(); // Will remove Bob (FIFO)
        System.out.println("Removed: " + removed);
    }
    
}