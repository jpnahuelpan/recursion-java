package org.example;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.stream.Stream;


public class FibonacciTest {
    private static Stream<Arguments> fibonacciInputs() {
        return Stream.of(
            Arguments.of(0, 0),
            Arguments.of(1, 1),
            Arguments.of(1, 2),
            Arguments.of(2, 3),
            Arguments.of(3, 4),
            Arguments.of(5, 5),
            Arguments.of(8, 6),
            Arguments.of(13, 7),
            Arguments.of(21, 8),
            Arguments.of(55, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputs")
    public void testFibonacciLinear(int expected, int n) {
        assertEquals(expected, Fibonacci.linear(n));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputs")
    public void testFibonacciTail(int expected, int n) {
        assertEquals(expected, Fibonacci.tail(n));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputs")
    public void testFibonacciMultiple(int expected, int n) {
        assertEquals(expected, Fibonacci.multiple(n));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputs")
    public void testFibonacciMutual(int expected, int n) {
        assertEquals(expected, Fibonacci.mutual(n));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputs")
    public void testFibonacciNested(int expected, int n) {
        assertEquals(expected, Fibonacci.nested(n));
    }    
}
