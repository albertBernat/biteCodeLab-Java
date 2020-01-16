package com.ttpsc.bitecodelab.coffee_machine;

import com.ttpsc.bitecodelab.coffee_machine.config.AppConfig;
import com.ttpsc.bitecodelab.coffee_machine.controller.Command;
import com.ttpsc.bitecodelab.coffee_machine.menu.Menu;

import java.util.List;

public class CoffeMachine {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        List<Command> commands = appConfig.initializeCommands();
        Menu menu = appConfig.initializeMenu();

        while (true) {
            menu.show(commands);
            Command command = menu.getChoice(commands);
            command.execute();
        }
    }
}
