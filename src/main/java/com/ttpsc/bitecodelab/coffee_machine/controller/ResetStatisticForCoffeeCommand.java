package com.ttpsc.bitecodelab.coffee_machine.controller;


import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;

public class ResetStatisticForCoffeeCommand implements Command {
    private View view;
    private CoffeeStatisticRepository coffeeStatisticRepository;


    public ResetStatisticForCoffeeCommand(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.view = view;
        this.coffeeStatisticRepository = coffeeStatisticRepository;
    }

    @Override
    public void execute() {
        String coffeeName = view.readString("Enter name of kawa");

        if (coffeeStatisticRepository.resetStatisticFor(coffeeName)) {
            view.info("Statistic for " + coffeeName + " set 0");
        } else
            view.error("No coffee with this name");
    }

//    @Override
//    public String getLabel() {
//        return "Reset single coffee statistic";
//    }
}