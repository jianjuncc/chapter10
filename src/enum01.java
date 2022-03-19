public class enum01 {
    public static void main(String[] args) {
        enum11[] enum11s = enum11.values();
        for (enum11 e:
             enum11s) {
            System.out.println(e);
        }
        enum11 op = enum11.SUMMER;
        System.out.println("\n序列号"+op.ordinal());
        System.out.println(op.compareTo(enum11.SPRING));
        System.out.println(op.name());
        System.out.println(op.valueOf("WINTER"));

    }
}
enum enum11{
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热");
    private String name;
    private String desc;

    private enum11(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", desc='" + desc + '\''
                ;
    }
}