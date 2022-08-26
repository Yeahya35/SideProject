package com.userservice.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MockitoApplicationTest {

    Calculator underTest = new Calculator();

    @Test
    public void isAccurate() {
        // given
        int num1 = 20;
        int num2 = 30;

        // when
        int sum = underTest.add(num1, num2);

        // then
        int expected = 50;
        assertThat(sum).isEqualTo(expected);
    }

    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }
}
