package TwoDArray;

public class MaxMinElement {
    public static void main(String[] args) {
        int[][] arr = { { 2, 1, 4, 7 }, { 4, 8, 9, 5 }, { 2, 4, 2, 6 } };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];

                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}
