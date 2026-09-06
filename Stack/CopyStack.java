package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < 6; i++) {
            stack.push(i * 2);
        }
        System.out.println("Original Stack: " + stack); // [2, 4, 6, 8, 10]

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = stack.size(); i > 0; i--) {
            list.add(stack.pop());
        }

        System.out.println("Empty Stack: " + stack);

        // Stack<Integer> copiedStack = new Stack<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
        }

        System.out.println("Copied Stack: " + stack);
    }
}
