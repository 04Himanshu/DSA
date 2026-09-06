package Practice;

class Main {
    public static int var;

    // 3
    Main() {
        System.out.println("Main Constructor...");
    }

    // 2
    {
        System.out.println("Comman initializer block.");
        var = 30;
    }

    // 4
    public static void display() {
        System.out.println(var);
    }

    // 1
    static {
        System.out.println("I am static block");
        // var = 10;
    }
}

class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}

class RecursiveConstructorCall {
    RecursiveConstructorCall() {
        // RecursiveConstructorCall rCall = new RecursiveConstructorCall();
    }
}

public class Test {

    // Test() {
    // System.out.println("Test Constructor...");
    // }

    // public static void display() {
    // System.out.println("this is overridden method");
    // }

    public static void main(String[] args) {

        // for (int i = 2; i < 3; i += 1) {
        // System.out.println(i++ + i); // ans = 5
        // }

        // char[] nptl = { 's', 'w', 'a', 'y', 'a', 'm' };
        // System.out.println("" + nptl[1] + nptl[nptl.length - 1]);

        // System.arraycopy(args, 0, nptl, 0, 0);

        // for (String s : args) {
        // System.out.println(s + args[0]);
        // }

        // Main main = new Main();
        // main.display();

        // int x = 10;
        // System.out.println(++x + x++);

        // A obj = new B();
        // obj.show();

        // RecursiveConstructorCall rCall = new RecursiveConstructorCall();

    }
}
