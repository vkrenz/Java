import java.util.Stack;
public class Practice {


    public static void loopStack(Stack<Integer> stack) {
        for (int grade : stack) System.out.print(grade + " ");
        System.out.println();
    }

    public static void reverseStack(Stack<Integer> stack) {
        int i = 0, j = stack.size() - 1;

        while (i < j) {
            // Swap i and j
            int temp = stack.get(i);
            stack.set(i, stack.get(j));
            stack.set(j, temp);

            i++;
            j--;
        }

        // Print the reversed stack
        for (int key : stack) System.out.print(key + " ");
        System.out.println();
    }

    public static int getSize(Stack<Integer> stack) {
        int size = 0;
        for (int key : stack) size++;
        return size;
    }

    
    public static void main(String[] args) {

        Stack<Integer> grades = new Stack<Integer>();

        // Push an item to a stack
        grades.push(78);
        grades.push(51);
        grades.push(100);
        grades.push(48);
        grades.push(33);
        grades.push(70);
        grades.push(49);
        grades.push(59); // removed

        // Pop an item from a stack
        grades.pop();

        // loop over a stack
        loopStack(grades);

        // Peek at the top of the stack
        System.out.println("Peek stack: " + grades.peek());

        // Reverse the stack
        reverseStack(grades);

        // Get stack size
        System.out.println("Stacl size: " + getSize(grades));

        // or

        System.out.println("Stack size: " + grades.size()); // built-in method

    }

}