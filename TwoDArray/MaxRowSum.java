package TwoDArray;

public class MaxRowSum {
    public static void main(String[] args) {

        int[][] arr = { { 2, 1, 4, 7 }, { 4, 8, 9, 5 }, { 2, 4, 2, 6 } };

        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
