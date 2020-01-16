package com.ttpsc.bitecodelab.coffee_machine.controller;


import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;

public class GetCountOfAllCoffees implements Command {

    private final View view;
    private final CoffeeStatisticRepository coffeeStatisticRepository;

    public GetCountOfAllCoffees(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.view = view;
        this.coffeeStatisticRepository = coffeeStatisticRepository;
    }

    @Override
    public void execute() {
        view.info(coffeeStatisticRepository.getCountOfAllCoffees().toString());
    }

//    @Override
//    public String getLabel() {
//        return "Get Count Of All Coffees";
//    }
}
