package com.dpatterns.observable;

import com.dpatterns.observable.publishers.Publisher;
import com.dpatterns.observable.publishers.PublisherImpl;
import com.dpatterns.observable.subscribers.Subscriber;
import com.dpatterns.observable.subscribers.SubscriberImpl;

public class ObservablePatternMain {
    public static void main(String[] args) {
        Publisher publisher = new PublisherImpl();

        Subscriber subscriber1 = new SubscriberImpl();
        Subscriber subscriber2 = new SubscriberImpl();

        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);

        publisher.update();
    }
}
