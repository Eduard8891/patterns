package observer;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    void update(String newPromotion) {
        System.out.println(name + " found out about the: " + newPromotion);
    }
}
