package TwoDArray;

public class TransposeOfSquareMatrix {

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                if (i != j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 1, 4 }, { 4, 8, 9 }, { 2, 4, 2 } };

        System.out.println("Original Matrix");
        printMatrix(arr);

        transpose(arr);

        System.out.println("\nTranspose Matrix");
        printMatrix(arr);
    }
}
