package Recursion;

public class Binarysearch {

    public static int search(int[] arr, int target, int st, int end) {

        if (st > end)
            return -1;

        int mid = (st + end) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return search(arr, target, st, mid - 1);
        return search(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 9 };
        int target = 1;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
