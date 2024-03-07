package composite;

public class Main {
    public static void main(String[] args) {
        AutoComponent car = new Car();
        AutoComponent carSalon = new CarSalon();
        AutoComponent mirror = new Mirror();
        AutoComponent seat = new Seat();
        car.add(carSalon);
        carSalon.add(mirror);
        carSalon.add(seat);

        car.getAll().forEach(AutoComponent::print);
        System.out.println("--------------------");
        car.getAll().get(0).getAll().forEach(AutoComponent::print);
    }
}
