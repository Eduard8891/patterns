package fabric;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.buildCar("lada");
        Car car2 = factory.buildCar("uaz");
        System.out.println(car1.testCar());
        System.out.println(car2.testCar());
    }
}
