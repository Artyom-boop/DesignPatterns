package org.example.adapter.adapter;

import org.example.adapter.Printer;

import java.util.List;

public class PrinterAdapter implements PrinterList{
    Printer printer = new Printer();
    @Override
    public void print(List<String> texts) {
        for (String text: texts) {
            printer.print(text);
        }
    }
}
