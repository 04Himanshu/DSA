package Recursion;

public class LinearSearch {
    public static int search(int[] arr, int target, int index) {
        if (index < arr.length) {
            if (arr[index] == target)
                return index;

            return search(arr, target, index + 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 14, 12, 6, 34, 2, 9 };

        System.out.println(search(arr, 34, 0));
    }
}
