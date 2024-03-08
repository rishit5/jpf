package com.dpatterns.observable.publishers;

import com.dpatterns.observable.subscribers.Subscriber;

import java.util.LinkedList;
import java.util.List;

public class PublisherImpl implements Publisher {

    List<Subscriber> subscriberList;

    public PublisherImpl() {
        this.subscriberList = new LinkedList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    @Override
    public void publish() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.getNotified();
        }
    }

    @Override
    public void update() {
        System.out.println("Updating");
        this.publish();
    }
}
