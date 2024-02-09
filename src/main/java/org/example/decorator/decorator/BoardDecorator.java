package org.example.decorator.decorator;

import org.example.decorator.component.Component;

public class BoardDecorator extends Decorator {
    public BoardDecorator(Component component) {
        super(component);
    }
    @Override
    public void afterDraw() {
        System.out.println("add Board");
    }
}

