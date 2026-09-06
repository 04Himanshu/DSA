package Array;

import java.util.TreeMap;

class ReversePairs {
    public static int reversePairs(int[] nums) {
        int reversePairs = 0;
        TreeMap<Long, Integer> tree = new TreeMap<>();

        for (int i = 0; i < nums.length; i++)
            tree.put((long) (2 * nums[i]), i);

        for (int i = 0; i < nums.length; i++) {
            long n = nums[i];

            if (tree.lowerKey(n) != null && i > tree.lowerKey(n))
                reversePairs++;
        }

        return reversePairs;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 3, 1 };
        int ans = reversePairs(nums);
        System.out.println(ans);
    }
}
