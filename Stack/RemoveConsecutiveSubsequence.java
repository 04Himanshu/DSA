package Stack;

import java.util.Stack;

public class RemoveConsecutiveSubsequence {
    public static void remove(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int prevPop = Integer.MIN_VALUE;
        for (int num : arr) {
            if (!stack.isEmpty() && num == stack.peek()) {
                prevPop = stack.pop();
            } else if (num != prevPop) {
                stack.push(num);
            } else {
                // reset so future values can be reconsidered
                prevPop = Integer.MIN_VALUE;
            }
        }
        System.out.println(stack);
    }

    public static void removeConsecutiveSubsequence(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(num);
            }
        }

        System.out.println(stack);
    }
    // stack -> 1, 2, 4, 1

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 1 };
        remove(arr); // 4, 1
    }
}
