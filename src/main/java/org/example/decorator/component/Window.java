package org.example.decorator.component;


public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("draw Window");
    }
}
