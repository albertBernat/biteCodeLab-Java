package com.ttpsc.bitecodelab.coffee_machine.controller;


import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;

public class DisplayCoffeeStatisticsCommand implements Command {
    private CoffeeStatisticRepository coffeeStatisticRepository;
    private View view;

    public DisplayCoffeeStatisticsCommand(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.coffeeStatisticRepository = coffeeStatisticRepository;
        this.view = view;
    }

    @Override
    public void execute() {
        view.info(coffeeStatisticRepository.findAll().toString());
    }

//    @Override
//    public String getLabel() {
//        return "Coffee statistics";
//    }
}
