package com.ttpsc.bitecodelab.lambdas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LambdaPlaygroundTest {

    private final LambdaPlayground lambdaPlayground = new LambdaPlayground();

    @Test
    void shouldReturn10WhenAdd() {
        assertThat(lambdaPlayground.add(6,4)).isEqualTo(10);
    }

    @Test
    void shouldReturn10WhenAddWithLambda() {
        assertThat(lambdaPlayground.addWithLambda(6,4)).isEqualTo(10);
    }

    @Test
    void shouldReturn10WhenAddWithLambdaMethodReference() {
        assertThat(lambdaPlayground.addWithLambdaMethodReference(6,4)).isEqualTo(10);
    }

    @Test
    void shouldReturn9WhenMultiply() {
        assertThat(lambdaPlayground.multiply(3,3)).isEqualTo(9);
    }

    @Test
    void shouldReturn9WhenMultiplyWithLambda() {
        assertThat(lambdaPlayground.multiplyWithLambda(3,3)).isEqualTo(9);
    }

    @Test
    void shouldReturn9WhenMultiplyWithLambdaMethodReference() {
        assertThat(lambdaPlayground.multiplyWithLambdaMethodReference(3,3)).isEqualTo(9);
    }
}
