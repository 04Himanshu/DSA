package Array;

import java.util.HashSet;

public class leetcode_2461 {
    public static long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;

        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            long sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
                set.add(nums[j]);
            }

            if (set.size() == k)
                maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // nums = [1,5,4,2,9,9,9], k = 3
        int[] nums = {1,1,1,3,5,2,7,9,4,9,3,3};
         int k = 3;

        System.out.println(maximumSubarraySum(nums, k));
    }
}
