package Array;

public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int limit = 0;

        for (int ele : piles) {
            if (ele > limit)
                limit = ele;
        }

        for (int i = 1; i <= limit; i++) {
            int hours = 0;

            for (int pile : piles) {
                hours = hours + Math.ceilDiv(pile, i);
            }

            if (hours <= h)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
    }
}
