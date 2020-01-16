package com.ttpsc.bitecodelab.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        final List<String> words = Arrays.asList("foo", "bar", "something");
        final List<Integer> numbers = Arrays.asList(1, 7, 11);
        // Functional interfaces are interfaces with exactly one abstract method
        presentFunction(words);
        presentFunction2(words);

        presentSupplier();
        presentSupplier2();

        presentPredicate(numbers);
        presentPredicate2(numbers);

        presentConsumer();

    }

    private static void presentConsumer() {
        System.out.println("-- CONSUMER --");
        // Consumer performs an action based on an input
        Consumer<String> yellAtMe = (sentence) -> {
            System.out.println(sentence.toUpperCase() + "!!!1");
        };
        yellAtMe.accept("Java is awesome");
    }

    private static void presentPredicate(List<Integer> numbers) {
        System.out.println("-- PREDICATE --");
        // Predicate returns a boolean based on an object input
        Predicate<Integer> greaterThanTen = (num) -> {
            return num > 10;
        };
        for (int i : numbers) {
            System.out.println(i + " greater than ten? " + greaterThanTen.test(i));
        }
    }

    private static void presentPredicate2(List<Integer> numbers) {
        System.out.println("-- PREDICATE --");
        // Predicate returns a boolean based on an object input
        IntPredicate greaterThanTen = num -> num > 10;
        for (int i : numbers) {
            System.out.println(i + " greater than ten? " + greaterThanTen.test(i));
        }
    }
    private static void presentSupplier() {
        System.out.println("-- SUPPLIER --");
        // Supplier returns an object
        Supplier<Long> giveMeANumber = () -> {
            return System.currentTimeMillis();
        };
        System.out.println(giveMeANumber.get());
    }


    private static void presentSupplier2() {
        System.out.println("-- SUPPLIER --");
        // Supplier returns an object
        LongSupplier giveMeANumber = System::currentTimeMillis;
        System.out.println(giveMeANumber);
    }

    private static void presentFunction(List<String> words) {
        System.out.println("-- FUNCTION --");
        // Function takes an object and returns an object
        Function<String, String> makeTag = (name) -> {
            return "<" + name + "/>";
        };
        for (String s : words) {
            System.out.println(makeTag.apply(s));
        }
    }

    private static void presentFunction2(List<String> words) {
        System.out.println("-- FUNCTION --");
        // Function takes an object and returns an object
        UnaryOperator<String> makeTag = name -> "<" + name + "/>";
        for (String s : words) {
            System.out.println(makeTag.apply(s));
        }
    }
}
