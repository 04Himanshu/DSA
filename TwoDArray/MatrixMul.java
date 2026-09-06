package TwoDArray;

public class MatrixMul {

    public static void printArray(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static int[][] mul(int[][] nums1, int[][] nums2) {
        int r1 = nums1.length;
        int c1 = nums1[0].length;

        int r2 = nums2.length;
        int c2 = nums2[0].length;

        if (c1 != r2)
            return null;

        int[][] ans = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                int val = 0;

                for (int k = 0; k < r2; k++) {
                    val += nums1[i][k] * nums2[k][j];
                }

                ans[i][j] = val;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] nums1 = { { 1, 1, 2}, { 4, 5, 6 } };
        int[][] nums2 = { { 2, 2 }, { 3, 3 }, { 4, 4 } };

        int[][] result = mul(nums1, nums2);

        printArray(result);
    }
}
