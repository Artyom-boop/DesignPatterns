package org.example.adapter;

import org.example.adapter.adapter.PrinterAdapter;

import java.util.List;

// Клиент которому нужно печать список текстов
public class Client {

    public static void main(String[] args) {
        String text1 = "text1";
        String text2 = "text2";
        String text3 = "text3";

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(List.of(text1, text2, text3));
    }
}
