package observer;

import java.util.List;

public interface Shop {
    void registerSubscriber(Subscriber subscriber);
    void notifySubscribers(String promotion);
}
