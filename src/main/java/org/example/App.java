package org.example;

import java.util.Scanner;

public class App {
    private Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("Enter something:");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }
}
