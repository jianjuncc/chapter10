package homework10;

public class homework4 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork();
    }
}

interface Computer {
    public void work(double a, double b);
}

class Cellphone {
    public void testWork() {
        new Computer() {
            @Override
            public void work(double a, double b) {
                System.out.println("a+b="+(a+b));
            }
        }.work(7.5,6.5);
    }

}