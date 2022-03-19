public class enum03 {
    public static void main(String[] args) {
        Week[] week = Week.values();
        System.out.println("===所有星期的信息如下===");
        for (Week w :
                week) {
            System.out.println(w);
        }
    }
}
@SuppressWarnings({"all"})
@Deprecated
enum Week {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNSDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}