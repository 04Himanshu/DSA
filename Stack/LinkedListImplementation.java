package Stack;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }
}

class LinkedStack {

    private int size;
    private int length;
    private Node head;

    LinkedStack(int size) {
        this.size = size;
        this.length = 0;
        this.head = null;
    }

    public void push(int element) {
        if (length == size)
            throw new RuntimeException("Stack Overflow");

        Node node = new Node(element);
        node.next = head;
        head = node;
        length++;
    }

    public int pop() {
        if (length == 0)
            throw new RuntimeException("Stack is Empty");

        int val = head.val;
        head = head.next;
        length--;
        return val;
    }

    public int peek() {
        if (length == 0)
            throw new RuntimeException("Stack is Empty");

        return head.val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isFull() {
        if (length == size)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if (length == 0)
            return true;
        return false;
    }
}

public class LinkedListImplementation {

    public static void main(String[] args) {
        LinkedStack st = new LinkedStack(5);

        // System.out.println(st.isEmpty());
        // System.out.println(st.isFull());

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        st.display();

    }
}