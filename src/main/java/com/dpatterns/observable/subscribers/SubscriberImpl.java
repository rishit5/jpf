package com.dpatterns.observable.subscribers;

public class SubscriberImpl implements Subscriber {
    @Override
    public void getNotified() {
        System.out.println("I have been notified");
    }
}
