public class Main {

    public static void main(String[] args) {

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

    }

}