package org.example.state;

import org.example.state.context.TransformerContext;
import org.example.state.state.FireState;
import org.example.state.state.MoveState;
import org.example.state.state.TransformerState;

public class Main {

    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState fireState = new FireState();
        TransformerState moveState = new MoveState();

        context.setState(fireState);
        context.doAction();

        context.setState(moveState);
        context.doAction();
    }
}
