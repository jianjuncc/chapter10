package homework10;

public class homework7 {
    public static void main(String[] args) {
        Car_1 car_1 = new Car_1(45);
        Car_1.Air air = new Car_1.Air();

        car_1.getAir().flow(45);
        car_1.getAir().flow(-876);
        car_1.getAir().flow(45);
    }
}
class Car_1 {
    private double temperature;

     static class Air {
        public void flow(double temperature) {
            if (temperature > 40) {
                System.out.println("吹冷气");
            } else if (temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public Car_1(double temperature) {
        this.temperature = temperature;
    }

    public Air getAir(){
         return new Air();
    }
}