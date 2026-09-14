package Recursion;

public class CheckArrayIsSorted {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;

        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 9 };

        System.out.println(isSorted(arr, 0));
    }
}
