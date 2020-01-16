package com.ttpsc.bitecodelab.coffee_machine.view.console;

import com.ttpsc.bitecodelab.coffee_machine.view.View;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String readString(String label) {
        System.out.print(label + ": ");
        return scanner.nextLine();
    }

    @Override
    public int readInt(String label) {
        System.out.print(label + ": ");
        int value = scanner.nextInt();
        scanner.nextLine(); // clear scanner buffer
        return value;
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}
