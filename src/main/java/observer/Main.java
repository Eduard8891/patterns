package observer;

public class Main {
    public static void main(String[] args) {
        Shop monetka = new Monetka();
        monetka.registerSubscriber(new Subscriber("Bill"));
        monetka.registerSubscriber(new Subscriber("Ivan"));
        monetka.registerSubscriber(new Subscriber("Pepe"));
        monetka.notifySubscribers("Promo-50%");
    }
}