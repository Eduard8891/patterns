package abstractfabric;

public class CarFactory implements AbstractCarFactory {

    @Override
    public Car createCar() {
        return new Cherry();
    }
}
