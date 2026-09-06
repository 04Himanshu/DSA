package Array;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoArrays {
    public static List<Integer> sum(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int carry = 0;
        while (i >= 0 || j >= 0) {
            int s = arr1[i] + arr2[j] + carry;
            if (s >= 10) {
                result.add(s % 10);
                carry = s / 10;
            } else {
                result.add(s);
                carry = 0;
            }

            i--;
            j--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 4, 6, 3 };
        int[] arr2 = { 5, 2, 9, 1, 0 };

        List<Integer> result = sum(arr1, arr2);

        for (int val : result)
            System.out.print(val + " ");
    }
}
