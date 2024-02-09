package org.example.observer;

public class Main {

    public static void main(String[] args) {
        Subscruber1 subscruber1 = new Subscruber1();
        Subscruber2 subscruber2 = new Subscruber2();

        Publisher publisher = new Publisher();

        publisher.addListener(subscruber1);
        publisher.addListener(subscruber2);

        publisher.createNewMessage("Message! ");
    }
}
