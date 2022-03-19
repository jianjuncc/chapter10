public class enum02 {
    public static void main(String[] args) {
        gender boy = gender.BOY;
        gender boy2 = gender.BOY;
        System.out.println(boy);
        System.out.println(boy == boy2);
       // Enum
    }
}

enum gender {
    BOY, GIRL;
}