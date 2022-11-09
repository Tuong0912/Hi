# 
public class Students {
    private final int rollno;
    private final String name;
    private static String college = "BBDIT";

    Students(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college );
    }

public static class TestStaticMethod{
    public static void main(String[] args) {
        Students.change();

        Students a = new Students(111 , "Tuong");
        Students b = new Students(222 , "Toan");
        Students c = new Students(333 , "Bach");

        a.display();
        b.display();
        c.display();
    }
}
}
