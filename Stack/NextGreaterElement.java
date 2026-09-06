package Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterByHashMap(int[] num1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num2.length; i++) {
            map.put(num2[i], i);
        }

        for (int i = 0; i < num1.length; i++) {
            int index = map.get(num1[i]) + 1;
            int preVal = num1[i];

            while (index < num2.length) {
                if (num2[index] > num1[i] && num1[i] != num2[index]) {
                    num1[i] = num2[index];
                    break;
                } else
                    index++;
            }

            if (num1[i] == preVal)
                num1[i] = -1;
        }

        return num1;
    }

    public static int[] nextGreater(int[] num1, int[] num2) {
        int[] ans = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {

            ans[i] = -1;

            for (int j = 0; j < num2.length; j++) {

                if (num1[i] == num2[j]) {
                    int idx = j + 1;
                    while (idx < num2.length) {
                        if (num1[i] < num2[idx]) {
                            ans[i] = num2[idx];
                            break;
                        }
                        idx++;
                    }
                }
            }
        }

        return ans;
    }

    public static void nextGreaterUsingStack(int[] num) {
        Stack<Integer> stack = new Stack<>();
        int n = num.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                ans[i] = -1;
                stack.push(num[i]);
            }
            if (!stack.isEmpty() && stack.peek() > num[i]) {
                ans[i] = stack.peek();
                stack.push(num[i]);
            } else {
                ans[i] = -1;
                stack.push(num[i]);
            }

        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        // int[] num1 = { 4, 1, 2 };
        // int[] num2 = { 1, 3, 4, 2 };

        // int[] res = nextGreaterByHashMap(num1, num2);
        // int[] res = nextGreaterUsingStack(num1, num2);
        // int[] res = nextGreater(num1, num2);

        int[] num = { 6, 8, 0, 1, 3 };
        nextGreaterUsingStack(num);

        // for (int i : res) {
        // System.out.print(i + " ");
        // }
    }
}
