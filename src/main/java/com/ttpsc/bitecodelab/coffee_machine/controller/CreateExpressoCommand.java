package com.ttpsc.bitecodelab.coffee_machine.controller;


import com.ttpsc.bitecodelab.coffee_machine.config.AppConfig;
import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;

public class CreateExpressoCommand implements Command {

    View view;
    CoffeeStatisticRepository coffeeStatisticRepository;

    public CreateExpressoCommand(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.view = view;
        this.coffeeStatisticRepository = coffeeStatisticRepository;
    }

    @Override
    public void execute() {
        view.info("Order is being processed...");
        view.info("Give me size: ");
        int a = view.readInt("1. Single; 2. Double; 3. Triple");

        String ourString = AppConfig.COFFEE.ESPRESSO.toString();

        for (int i = 0; i < a; i++)
            coffeeStatisticRepository.incrementCoffee(ourString);
    }

//    @Override
//    public String getLabel() {
//        return "Create Expresso";
//    }

}
