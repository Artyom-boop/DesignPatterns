package org.example.state.state;

public class FireState implements TransformerState {
    @Override
    public void doAction() {
        System.out.println("Fire!");
    }
}
