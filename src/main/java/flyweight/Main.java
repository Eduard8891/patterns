package flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("shared");
        flyweight1.operation();

        Flyweight flyweight2 = factory.getFlyweight("shared");
        flyweight2.operation();

        Flyweight flyweight3 = factory.getFlyweight("unique");
        flyweight3.operation();
    }
}