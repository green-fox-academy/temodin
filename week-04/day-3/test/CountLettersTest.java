import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters cl = new CountLetters();

    @Test
    public void shouldWork() {
        HashMap<Character,Integer> testMap = new HashMap<>();
        testMap.put('b',1);
        testMap.put('u',2);
        testMap.put('e',1);
        testMap.put('k',3);
        testMap.put('n',1);
        testMap.put('o',1);
        assertEquals(testMap,cl.createDict("kukubenko"));
    }

}

//{b=1, u=2, e=1, k=3, n=1, o=1}