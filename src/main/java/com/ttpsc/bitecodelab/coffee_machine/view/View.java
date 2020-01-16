package com.ttpsc.bitecodelab.coffee_machine.view;

public interface View {
    String readString(String label);

    int readInt(String label);

    void info(String message);

    void error(String message);
}
