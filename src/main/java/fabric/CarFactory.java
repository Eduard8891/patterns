package fabric;

public class CarFactory {

    Car buildCar(String brand) {
        if ("uaz".equalsIgnoreCase(brand)) {
            return new UAZ();
        } else if ("lada".equalsIgnoreCase(brand)) {
            return new Lada();
        }
        return null;
    }
}
