package org.example.oopWithNLayeredApp.core.loging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanina loglandi : " + data);

    }
}
