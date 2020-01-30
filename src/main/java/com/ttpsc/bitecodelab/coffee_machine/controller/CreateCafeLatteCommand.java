package com.ttpsc.bitecodelab.coffee_machine.controller;


import com.ttpsc.bitecodelab.coffee_machine.config.AppConfig;
import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;
import com.ttpsc.bitecodelab.coffee_machine.view.View;

public class CreateCafeLatteCommand implements Command {
    private final View view;
    private final CoffeeStatisticRepository coffeeStatisticRepository;

    public CreateCafeLatteCommand(View view, CoffeeStatisticRepository coffeeStatisticRepository) {
        this.view = view;
        this.coffeeStatisticRepository = coffeeStatisticRepository;
    }

    @Override
    public void execute() {
        view.info("Order is being processed...");
        view.info("Give me size: ");
        int a = view.readInt("1. Small; 2. Medium; 3. Big");

        // TODO 1
        //  Jest tutaj troche brzydko napisanego kodu.
        //  Pomijajac ten fakt przerob tę konstrukcję na switch expressions.
        //  A i możesz użyć var'a zamist stringa
        //  Oraz w bloku default wyświetl komunikat i rzuć wyjatek typu RuntimeException
        String ourString;
        if (a == 1) {
            ourString = AppConfig.COFFEE.SMALL_LATE.toString();
        } else if (a == 2) {
            ourString = AppConfig.COFFEE.MEDIUM_LATE.toString();
        } else if (a == 3) {
            ourString = AppConfig.COFFEE.BIG_LATE.toString();
        } else {
            view.info("There is no such size :(");
            return;
        }

        coffeeStatisticRepository.incrementCoffee(ourString);
        view.info("Here goes your coffee. Enjoy IT ;)");
    }

}
