package org.example.decorator.decorator;

import org.example.decorator.component.Component;

public class ColorDecorator extends Decorator {
    public ColorDecorator(Component component) {
        super(component);
    }
    @Override
    public void afterDraw() {
        System.out.println("add Color");
    }
}
