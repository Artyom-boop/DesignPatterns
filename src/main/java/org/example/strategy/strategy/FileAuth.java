package org.example.strategy.strategy;

import org.example.strategy.strategy.AuthStrategy;

import java.io.File;

public class FileAuth implements AuthStrategy {
    File file;
    public FileAuth(File file) {
        this.file = file;
    }
    @Override
    public boolean checkLogin(String login, String password) {
        System.out.println("Checking with file...");
        return checkWithFile();
    }
    private boolean checkWithFile() {
        //логика проверки через файл

        return true;
    }
}
