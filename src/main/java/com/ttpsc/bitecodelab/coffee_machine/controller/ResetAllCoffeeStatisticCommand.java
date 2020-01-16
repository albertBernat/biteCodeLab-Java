package com.ttpsc.bitecodelab.coffee_machine.controller;


import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;

public class ResetAllCoffeeStatisticCommand implements Command {

    private final View view;
    private final CoffeeStatisticRepository coffeeStatisticRepository;

    public ResetAllCoffeeStatisticCommand(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.view = view;
        this.coffeeStatisticRepository = coffeeStatisticRepository;
    }

    @Override
    public void execute() {
        if (coffeeStatisticRepository.resetAllStatistics()) {
            view.info("Wyzerowano pomyślnie");
        } else {
            view.error("Błąd");
        }
    }

//    @Override
//    public String getLabel() {
//        return "Reset All Coffee Statistics";
//    }
}
