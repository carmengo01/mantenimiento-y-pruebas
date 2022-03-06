package org.fibonacci.fibonacci;

import org.fibonacci.fibonacci.Fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private Fibonacci fibonacci;
    private static final int MAX=50;

    @BeforeEach
    public void setup(){ fibonacci=new Fibonacci();}

    @AfterEach
    public void finish(){ fibonacci=null;}

    @Test
    // fibonacci(0) = 0
    public void computeShouldReturnZeroIfTheNumberIsZero(){
        int expectedValue=0;
        int obtainedValue=fibonacci.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    // fibonacci(1) = 1
    public void computeShouldReturnOneIfTheNumberIsOne(){
        int expectedValue=1;
        int obtainedValue=fibonacci.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    // fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    public void computeShouldReturnTheSumOfThePreviousTwoNumbersCompute(){
        int expectedValue;
        int obtainedValue;
        for(int i=2; i<MAX; i++){
            expectedValue=fibonacci.compute(i-1)+fibonacci.compute(i-2);
            obtainedValue=fibonacci.compute(i);

            assertEquals(expectedValue,obtainedValue);
        }
    }

    @Test
    // fibonacci(negative value) = RuntimeException
    public void computeShouldRaiseAnExceptionOfANegativeNumber(){
        assertThrows(RuntimeException.class, ()->fibonacci.compute(-1));
    }
}
