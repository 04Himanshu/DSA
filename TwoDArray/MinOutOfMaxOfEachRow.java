package TwoDArray;

public class MinOutOfMaxOfEachRow {
    public static void main(String[] args) {

        int[][] arr = { { 2, 1, 4, 7 }, { 4, 8, 9, 5 }, { 2, 4, 2, 6 } };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            min = Math.min(max, min);
        }

        System.out.println(min);
    }
}
