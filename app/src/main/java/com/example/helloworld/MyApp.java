package com.example.helloworld;

import android.app.Application;

public class MyApp extends Application {
    public IMessageCallback onMessage = null;
    public void registerMessageCallback(IMessageCallback callback) {
        this.onMessage = callback;
    }
}
