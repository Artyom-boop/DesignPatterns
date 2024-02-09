package org.example.decorator.component;

public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("draw TextView");
    }
}
