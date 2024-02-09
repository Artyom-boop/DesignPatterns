package org.example.observer;

public class Subscruber2 implements PublisherActionListener{
    @Override
    public void doAction(String message) {
        System.out.println(message + this.getClass().getName());
    }
}
