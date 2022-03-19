package homework10;

@SuppressWarnings("all")
public class homework5 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}

@SuppressWarnings("all")
class A {
    private String name = "李四";

    public void print() {
        class B {
            private final String NAME = "张三";

            public void show() {
                System.out.println("这是外部类的的名字:" + A.this.name);
                System.out.println("这是内部类的的名字:" + NAME);
            }
        }
        B b = new B();
        b.show();
    }
}