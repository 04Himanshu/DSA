package Recursion;

public class PrintOnetoN {
    static void print(int n) {

        // base condition
        if (n < 1)
            return;

        // recursive call
        print(n - 1);

        // recursive work
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        print(10);
    }
}
