package OOP;

class Test {
    private int x = 10;

    public void setX(int x) {
        this.x = x;
        System.out.println("setMethod Calling...");
    }

    Test() {
        System.out.println("Contructor calling...");
    }

    public int getX() {
        return x;
    }
}

class ContructorDemo {
    int x, y, z, p;

    ContructorDemo() {
        System.out.println("Default Cons...");
    }

    ContructorDemo(int x) {
        this();
        System.out.println("Single param Cons...");
    }

    ContructorDemo(int x, int y) {
        this(x);
        System.out.println("Double param Cons...");
    }

    ContructorDemo(int x, int y, int z) {
        this(x, y);
        System.out.println("Triple param Cons...");
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        // Test t = new Test();
        // t.setX(50);
        // System.out.println(t.getX());

        // ContructorDemo c = new ContructorDemo();
        new ContructorDemo(8, 2, 4);

    }
}
