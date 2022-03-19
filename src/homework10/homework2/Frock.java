package homework10.homework2;

public class Frock {
    static int currentNum = 100000; //起始值
    private int serialNumber;

    //返回序列号
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}
