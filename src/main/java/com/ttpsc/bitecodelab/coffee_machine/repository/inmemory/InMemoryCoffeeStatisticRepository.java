package com.ttpsc.bitecodelab.coffee_machine.repository.inmemory;



import com.ttpsc.bitecodelab.coffee_machine.config.AppConfig;
import com.ttpsc.bitecodelab.coffee_machine.repository.CoffeeStatisticRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCoffeeStatisticRepository implements CoffeeStatisticRepository {

    private Map<String, Integer> coffees;

    public InMemoryCoffeeStatisticRepository() {
        initRepository();
    }

    @Override
    public boolean incrementCoffee(String coffeeName) {
        int x = coffees.get(coffeeName);
        coffees.replace(coffeeName, x + 1);
        return true;
    }

    @Override
    public Map<String, Integer> findAll() {
        return coffees;
    }

    @Override
    public Integer getCountOfAllCoffees() {
        return coffees.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public boolean resetAllStatistics() {
        initRepository();
        return true;
    }

    @Override
    public boolean resetStatisticFor(String coffeeName) {
        coffees.replace(coffeeName, 0);
        return true;
    }

    private void initRepository() {
        coffees = new HashMap<>();
        for (AppConfig.COFFEE value : AppConfig.COFFEE.values()) {
            coffees.put(value.toString(), 0);
        }
    }
}
