import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime, endTime, elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // LinkedList

        startTime = System.nanoTime();

        // Operations:
        // linkedList.get(0); // 13375ns
        // linkedList.get(500000); // 3233250ns
        // linkedList.get(999999); // 13208ns
        // linkedList.remove(0); // 16417ns
        // linkedList.remove(500000); // 3024083ns
        linkedList.remove(999999); // 14083ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + "\tns");


        // ArrayList

        startTime = System.nanoTime();

        // Operations:
        // arrayList.get(0); // 1375ns
        // arrayList.get(500000); // 4000ns
        // arrayList.get(999999); // 2250ns
        // arrayList.remove(0); // 384416ns
        // arrayList.remove(500000); // 218041ns
        arrayList.remove(999999); // 2500ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + "\tns");

    }

}