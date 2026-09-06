package Array;

public class TraverseArrayTwice {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 }; // output - 1 2 3 4 1 2 3 4

        int[] ans = new int[arr.length * 2];
        int j = arr.length;

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[j++] = arr[i];
        }

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}