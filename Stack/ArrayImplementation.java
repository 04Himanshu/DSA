package Stack;

class Stack {

    private int[] arr;
    private int ptr;

    Stack(int size) {
        arr = new int[size];
        ptr = -1;
    }

    public int size() {
        return ptr + 1;
    }

    public void push(int element) {
        if (ptr == arr.length - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        arr[++ptr] = element;
    }

    public int pop() {
        if (ptr == -1) {
            throw new RuntimeException("Stack Underflow");
        }
        return arr[ptr--];
    }

    public int peek() {
        if (ptr == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return arr[ptr];
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        if (ptr == arr.length - 1)
            return true;

        return false;
    }

    public boolean isEmpty() {
        if (ptr == -1)
            return true;

        return false;
    }
}

public class ArrayImplementation {

    public static void main(String[] args) {
        Stack st = new Stack(5);

        System.out.println(st.isEmpty());
        System.out.println(st.isFull()); 

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
