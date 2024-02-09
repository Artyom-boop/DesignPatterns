package org.example.decorator;

import org.example.decorator.component.Component;
import org.example.decorator.component.TextView;
import org.example.decorator.component.Window;
import org.example.decorator.decorator.BoardDecorator;
import org.example.decorator.decorator.ColorDecorator;

public class Main {
    private static Component textView;
    private static Component window;

    public static void main(String[] args) {
        window = new ColorDecorator(new BoardDecorator(new Window()));
        window.draw();
    }
}
