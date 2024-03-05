package abstractfabric;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory carFactory1 = new CarFactory();
        AbstractCarFactory carFactory2 = new TruckFactory();
        Car car1 = carFactory1.createCar();
        Car car2 = carFactory2.createCar();
        System.out.println(car1.beep());
        System.out.println(car2.beep());
    }
}
