package com.ttpsc.bitecodelab.coffee_machine.repository;


import java.util.Map;

public interface CoffeeStatisticRepository {
    boolean incrementCoffee(String coffeeName);

    Map<String, Integer> findAll();

    Integer getCountOfAllCoffees();

    boolean resetAllStatistics();

    boolean resetStatisticFor(String coffeeName);

    //TODO ZADANIE 2 dodać metodę która zresetuje statystyki dla wielu kaw, których nazwy są podane w tablicy stringów
}
