package homework10;

public class homework4_1 {
    public static void main(String[] args) {
        cellPhone cellPhone = new cellPhone();
        cellPhone.testWork(new Computer1() {
            @Override
            public double calculate(double a, double b) {
                return a*b;
            }
        },4,10);
    }
}
interface Computer1{
    public double calculate(double a,double b);
}
class cellPhone{
    public void testWork(Computer1 computer1, double a, double b){
        double result = computer1.calculate(a, b);
        System.out.println("计算结果:"+result);
    }
}