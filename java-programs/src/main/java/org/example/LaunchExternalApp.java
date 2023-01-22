package org.example;

import java.io.IOException;

public class LaunchExternalApp {
    public static void main(String[] args) {
        Runtime runtime= Runtime.getRuntime();

        try {
            runtime.exec("notepad.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
