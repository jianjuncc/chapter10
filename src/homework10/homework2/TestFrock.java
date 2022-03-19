package homework10.homework2;

public class TestFrock {
    public static void main(String[] args) {

        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getNextNum());
        System.out.println(frock2.getNextNum());
        System.out.println(frock3.getNextNum());
    }
}
