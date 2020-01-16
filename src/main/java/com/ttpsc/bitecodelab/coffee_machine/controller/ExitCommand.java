package com.ttpsc.bitecodelab.coffee_machine.controller;


public class ExitCommand implements Command {

    public static final int SUCCESSFUL = 0;

    @Override
    public void execute() {
        System.exit(SUCCESSFUL);
    }

//    @Override
//    public String getLabel() {
//        return "Exit";
//    }
}
