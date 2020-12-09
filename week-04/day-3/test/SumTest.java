import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
Sum sum;

@Before
public void create () {
    sum = new Sum(); //create a new instance for the test
}

    @Test
    public void sum() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertEquals(15,sum.sum(testList));
    }

    @Test
    public void sumMore() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        assertEquals(21,sum.sum(testList));
    }

    @Test
    public void sumEmpty() {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        assertEquals(0,sum.sum(testList));
    }
    @Test
    public void sumOneMember() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1));
        assertEquals(1,sum.sum(testList));
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumNull() {
        ArrayList<Integer> testList = null;
        assertEquals(null ,sum.sum(testList));
    }
}