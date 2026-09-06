package Recursion;

public class ReverseANumber {

    static int sum = 0;

    public static void reverse(int n) {
        if (n == 0)
            return;

        sum = sum * 10 + n % 10;

        reverse(n / 10);
    }

    public static void main(String[] args) {
        // reverse(1234);

        // System.out.println(sum);

        System.out.println(Math.log10(-1));

    }
}
