import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd() {
        assertEquals(6, extension.add(3, 3));
    }

    @Test
    void testAddNegative() {
        assertEquals(-9, extension.add(-4, -5));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(6, extension.maxOfThree(6, 2, 5));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(1, 3, 5));
    }
    @Test
    void testMaxOfThree_second() {
        assertEquals(3, extension.maxOfThree(1, 3, 2));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,1)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_h() {
        assertFalse(extension.isVowel('h'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}