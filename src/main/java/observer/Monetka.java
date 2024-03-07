package observer;

import java.util.ArrayList;
import java.util.List;

public class Monetka implements Shop {
    String promotion;
    List<Subscriber> subscribers;

    public void setPromotion(String promotion) {
        this.promotion = promotion;
        notifySubscribers(promotion);
    }

    public Monetka() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void notifySubscribers(String promotion) {
        subscribers.forEach(it -> it.update(promotion));
    }
}
