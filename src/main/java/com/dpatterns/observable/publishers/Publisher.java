package com.dpatterns.observable.publishers;

import com.dpatterns.observable.subscribers.Subscriber;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void publish();

    void update();
}
