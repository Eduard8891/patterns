package builder;


public class Main {
    public static void main(String[] args) {
        Car car = Car
                .builder()
                .setBrand("toyota")
                .setType("electro")
                .setPrice(5000000)
                .build();
        System.out.println(car);
    }
}
