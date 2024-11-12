package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.function.IntFunction;


public class FibonacciTest {

    @Test
    public void testAllFibonacci() {
        testFibonacci(Fibonacci::linear);
        testFibonacci(Fibonacci::tail);
        testFibonacci(Fibonacci::multiple);
        testFibonacci(Fibonacci::mutual);
        testFibonacci(Fibonacci::nested);
    }
    
    private void testFibonacci(IntFunction<Integer> f) {
        assertAll(
            () -> assertEquals(0, f.apply(0)),
            () -> assertEquals(1, f.apply(1)),
            () -> assertEquals(1, f.apply(2)),
            () -> assertEquals(13, f.apply(7)),
            () -> assertEquals(21, f.apply(8)),
            () -> assertEquals(55, f.apply(10))
        );
    }

}
