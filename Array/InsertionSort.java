package Array;

public class InsertionSort {
    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i], prev = i - 1;
            while (prev >= 0 && curr < arr[prev]) {

                arr[prev + 1] = arr[prev];
                prev--;
            } 
            arr[prev + 1] = curr;
        } 
    } 

    public static void main(String[] args) { 
        // int[] arr = { -1, 5, 3, 4, 0 };
        int[] arr = { 11, 5, 33, 4, 10 };

        sort(arr);

        for (int val : arr)
            System.out.print(val + " ");

    }
}
