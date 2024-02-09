package org.example.state.context;

import org.example.state.state.TransformerState;

public class TransformerContext implements TransformerState {
    TransformerState state;
    public TransformerState getState() {
        return state;
    }
    public void setState(TransformerState state) {
        this.state = state;
    }
    @Override
    public void doAction() {
        this.state.doAction();
    }
}
