public class DynamicArray {

    int size, cap = 10;
    Object[] arr;

    // DynamicArray default constructor
    public DynamicArray() {
        this.arr = new Object[cap];
    }

    // DynamicArray constructor with cap given
    public DynamicArray(int cap) {
        this.cap = cap;
        this.arr = new Object[cap];
    }

    public void add(Object data) {
        if (size >= cap) {
            grow();
        }
        arr[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= cap) {
            grow();
        }
        // Shift everything over to the right
        for (int i =  size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                // Shift all of the elements to the left
                for (int j = 0; j < (size - i - 1);  j++) {
                    arr[i + j] = arr[i + j + 1];
                }
                arr[size - 1] = null;
                size--;
                if (size <= (int)(cap / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCap = (int)(cap * 2);
        Object[] newArr = new Object[newCap];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        cap = newCap;
        arr = newArr;

        System.out.println("Array has grown. New capacity: " + cap);
    }

    private void shrink() {
        int newCap = (int)(cap / 2);
        Object[] newArr = new Object[newCap];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        cap = newCap;
        arr = newArr;

        System.out.println("Array has shrunk. New capacity: " + cap);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < size; i++) {
            str += arr[i] + ", ";
        }
        if (str != "") {
            str = "[" + str.substring(0, str.length() - 2) + "]";
        }
        else {
            str = "[]";
        }
        return str;
    }

}   