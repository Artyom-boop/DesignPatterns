package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PublisherInterface{
    private List<PublisherActionListener> listeners = new ArrayList<>();
    @Override
    public List<PublisherActionListener> getListeners () {
        return listeners;
    }
    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }
    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }
    @Override
    public void removeAllListeners() {
        listeners.clear();
    }
    @Override
    public void notifySubscribers(String message){
        for (PublisherActionListener actionListener : listeners) {
            actionListener.doAction(message);
        }
    }
    public void createNewMessage (String message){
        System.out.println("Publisher printed message " + message);
        notifySubscribers(message);
    }
}