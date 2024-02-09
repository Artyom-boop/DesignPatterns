package org.example.state.state;

public class MoveState implements TransformerState {
    @Override
    public void doAction() {
        System.out.println("Move!");
    }
}
