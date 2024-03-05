package abstractfabric;

public class TruckFactory implements AbstractCarFactory{
    @Override
    public Car createCar() {
        return new Truck();
    }
}
