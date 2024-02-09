package org.example.strategy.strategy;

public class DBAuth implements AuthStrategy {
    String uri;
    public DBAuth(String uri) {
        this.uri = uri;
    }
    @Override
    public boolean checkLogin(String login, String password) {
        System.out.println("Checking with DB...");
        return checkWithDB();
    }
    private boolean checkWithDB() {
        //логика проверки через базу данных

        return true;
    }
}
