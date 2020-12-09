import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fibo = new Fibonacci();

    @Test
    public void happyCase() {
        assertEquals(1836311903, fibo.getFibonacciMember(46));
    }

    @Test
    public void zeroCase() {
        assertEquals(0, fibo.getFibonacciMember(0));
    }

    @Test
    public void oneCase() {
        assertEquals(1, fibo.getFibonacciMember(1));
    }

    @Test
    public void twoCase() {
        assertEquals(1, fibo.getFibonacciMember(2));
    }

}