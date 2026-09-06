package Stack;

import java.util.Stack;

public class Basic {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // peek() -> return top element of the stack
        System.out.println(st.peek());

        // prints all elmnt
        System.out.println(st);

        // pop() -> remove & return top element from stack
        System.out.println(st.pop());

        // size() -> return lenght of stack
        System.out.println(st.size());

        // isEmpty() -> return boolean val
        System.out.println(st.isEmpty());

    }
}
