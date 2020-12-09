import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    Apples apples;

    @Before
    public void create () {
        apples = new Apples();
    }

    @Test
    public void getApple() {
        assertEquals("apple",apples.getApple());
    }
}