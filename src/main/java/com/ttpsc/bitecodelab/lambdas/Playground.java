package com.ttpsc.bitecodelab.lambdas;

import com.ttpsc.bitecodelab.interface_repetition.Computation;

public class Playground {

    public static void main(String[] args) {

    }

    // Example usage of anonymous class
    public double add(double first, double second) {
        Computation addition = new Computation() {
            @Override
            public double compute(double first, double second) {
                return first + second;
            }
        };
        return addition.compute(first, second);
    }

    // Implement with anonymous class
    public double multiply(double first, double second) {
        // ...
        throw new RuntimeException("Method - multiply not implemented");
    }


    public double addWithLambda(double first, double second) {
        Computation computation = (a, b) -> a + b;
        return computation.compute(first, second);
    }

    //Method reference
    public double addWithLambdaMethodReference(double first, double second) {
        Computation computation = Double::sum;
        return computation.compute(first, second);
    }

    // Implement multiplication with lambda and lambda method reference
    public double multiplyWithLambda(double firs, double second) {
        // ...
        throw new RuntimeException("Method - multiplyWithLambda not implemented");
    }

    public double multiplyWithLambdaMethodReference(double firs, double second) {
        // ...
        throw new RuntimeException("Method - multiplyWithLambdaMethodReference not implemented");
    }
}
