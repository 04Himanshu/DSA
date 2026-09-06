package Recursion;

public class PrintNtoOne {
    static void print(int n) {
        // base condition
        if (n < 1)
            return;

        // recursive work
        System.out.print(n + " ");

        // recursive call
        print(n - 1);

    }

    public static void main(String[] args) {
        print(30);
    }
}
