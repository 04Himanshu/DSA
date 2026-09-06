package TwoDArray;

public class PrintArrayColumnWise {
    public static void main(String[] args) {

        int[][] arr = { { 2, 1, 4, 7 }, { 4, 8, 9, 5 }, { 2, 4, 2, 6 } };

        System.out.println("Row Wise");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Column Wise");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
