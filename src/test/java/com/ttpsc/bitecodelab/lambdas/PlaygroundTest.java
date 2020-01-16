package com.ttpsc.bitecodelab.lambdas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlaygroundTest {

    private final Playground playground = new Playground();

    @Test
    void shouldReturn10WhenAdd() {
        assertThat(playground.add(6,4)).isEqualTo(10);
    }

    @Test
    void shouldReturn10WhenAddWithLambda() {
        assertThat(playground.addWithLambda(6,4)).isEqualTo(10);
    }

    @Test
    void shouldReturn10WhenAddWithLambdaMethodReference() {
        assertThat(playground.addWithLambdaMethodReference(6,4)).isEqualTo(10);
    }

    @Test
    void shouldReturn9WhenMultiply() {
        assertThat(playground.multiply(3,3)).isEqualTo(9);
    }

    @Test
    void shouldReturn9WhenMultiplyWithLambda() {
        assertThat(playground.multiplyWithLambda(3,3)).isEqualTo(9);
    }

    @Test
    void shouldReturn9WhenMultiplyWithLambdaMethodReference() {
        assertThat(playground.multiplyWithLambdaMethodReference(3,3)).isEqualTo(9);
    }
}
