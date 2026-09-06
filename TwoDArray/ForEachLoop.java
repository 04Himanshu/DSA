package TwoDArray;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = { { 2, 1, 4, 7 }, { 4, 8, 9, 5 }, { 2, 4, 2, 6 } };

        // for (int i = 0; i < arr.length; i++) {
        // for (int ele : arr[i]) {
        // System.out.print(ele + " ");
        // }
        // System.out.println();
        // }

        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
