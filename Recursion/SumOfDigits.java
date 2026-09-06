package Recursion;

public class SumOfDigits {

    public static int digSum(int n) {
        if (n <= 0)
            return 0;

        return (n % 10) + digSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digSum(1234));
    }
}
