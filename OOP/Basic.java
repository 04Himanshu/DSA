package OOP;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Basic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Himanshu";
        s1.age = 44;

        s1.printInfo();

        Student s2 = new Student();
        s2.age = 22;
        s2.name = "Kabir";

        s2.printInfo();
    }
}
