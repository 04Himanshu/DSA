package Practice;

import java.io.PrintWriter;

public class ExceptionTest {
    public static void main(String[] args) {
        // try {
        // System.out.println(4 / 0);
        // } catch (ArithmeticException ae) {
        // System.out.println("ArithmeticException ");
        // } catch (Exception e) {
        // System.out.println(" Exception ");
        // }
        // System.out.println("Exception Caught by Above Catch blocks");

        // Thread thread = new Thread(new Runnable() {
        // public void run() {
        // System.out.println("Hii");
        // }
        // },
        // "Hello");

        // thread.start();
        // System.out.println(Thread.activeCount());

        try {
            PrintWriter writer = new PrintWriter(System.out);
            writer.write(9 + 97);
            char ch = 9 + 97;
            System.out.println("Char 9 + 97 = " + ch);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
