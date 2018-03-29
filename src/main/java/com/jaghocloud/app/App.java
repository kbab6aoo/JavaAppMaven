package com.jaghocloud.app;

/**
 * Welcome to Jagho Cloud Solutions..!
 */
public class App
{

    private final String message = "Welcome to Jagho Cloud Solutions..!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
