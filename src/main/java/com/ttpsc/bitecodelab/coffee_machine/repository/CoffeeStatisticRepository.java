package com.ttpsc.bitecodelab.coffee_machine.repository;


import java.util.Map;

public interface CoffeeStatisticRepository {
    boolean incrementCoffee(String coffeeName);

    Map<String, Integer> findAll();

    Integer getCountOfAllCoffees();

    boolean resetAllStatistics();

    boolean resetStatisticFor(String coffeeName);
}
