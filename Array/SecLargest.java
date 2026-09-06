package Array;

public class SecLargest {
    public static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        int secLar = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < largest && secLar < nums[i])
                secLar = nums[i];
        }
        return secLar;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 8, 7, 6, 5 };

        System.out.println(secondLargestElement(nums));
    }
}