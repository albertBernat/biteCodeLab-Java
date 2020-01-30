package com.ttpsc.bitecodelab.coffee_machine.config;

import com.ttpsc.bitecodelab.coffee_machine.controller.Command;
import com.ttpsc.bitecodelab.coffee_machine.controller.CreateCafeLatteCommand;
import com.ttpsc.bitecodelab.coffee_machine.controller.CreateExpressoCommand;
import com.ttpsc.bitecodelab.coffee_machine.controller.DisplayCoffeeStatisticsCommand;
import com.ttpsc.bitecodelab.coffee_machine.controller.ExitCommand;
import com.ttpsc.bitecodelab.coffee_machine.controller.GetCountOfAllCoffees;
import com.ttpsc.bitecodelab.coffee_machine.controller.ResetAllCoffeeStatisticCommand;
import com.ttpsc.bitecodelab.coffee_machine.controller.ResetStatisticForCoffeeCommand;
import com.ttpsc.bitecodelab.coffee_machine.menu.Menu;
import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.repository.inmemory.InMemoryCoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;
import com.ttpsc.bitecodelab.coffee_machine.view.console.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class AppConfig {

    private View view;
    private CoffeeStatisticRepository coffeeStatisticRepository;

    public AppConfig() {
        this.view = new ConsoleView();
        this.coffeeStatisticRepository = new InMemoryCoffeeStatisticRepository();
    }

    public AppConfig(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.view = view;
        this.coffeeStatisticRepository = coffeeStatisticRepository;
    }

    public List<Command> initializeCommands() {
        List<Command> commands = new ArrayList<>();
        commands.add(new CreateCafeLatteCommand(view, coffeeStatisticRepository));
        commands.add(new CreateExpressoCommand(view,coffeeStatisticRepository));
        commands.add(new DisplayCoffeeStatisticsCommand(view, coffeeStatisticRepository));
        commands.add(new GetCountOfAllCoffees(view, coffeeStatisticRepository));
        commands.add(new ResetAllCoffeeStatisticCommand(view, coffeeStatisticRepository));
        commands.add(new ResetStatisticForCoffeeCommand(view, coffeeStatisticRepository));
        commands.add(new ExitCommand());
        return commands;
    }

    public Menu initializeMenu() {
        return new Menu(view);
    }


    public enum COFFEE {
        ESPRESSO, SMALL_LATE, MEDIUM_LATE, BIG_LATE
    }
}
