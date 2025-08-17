package ct.week02;

interface A{
    int w = 10;
    int h = 20;

    static int x =1, y =2;
    public static final int z = 3;
    void a();
    public void b();
}

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("w = " + A.w);
        System.out.println("h = " + A.h);
        System.out.println("x = " + A.x);
        System.out.println("y = " + A.y);
        System.out.println("z = " + A.z);

        B b = new B();
        b.a();
        b.b();
    }
}

class B implements A{
    @Override
    public void a() {
        System.out.println("Method");
    }

    @Override
    public void b() {
        System.out.println("Method");
    }
}
