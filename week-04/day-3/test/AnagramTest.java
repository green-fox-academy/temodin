import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram ana = new Anagram();

    @Test
    public void happyCase() {
    assertTrue(ana.isAnagram("kolbasz", "kolaszb"));
    }
    @Test
    public void unHappyCase() {
    assertFalse(ana.isAnagram("kolbasz", "kolasza"));
    }
    @Test
    public void notEqualInLengthCase() {
    assertFalse(ana.isAnagram("kolbasz", "kolaszaallla"));
    }
    @Test
    public void specialCharAndNumberAndUpperCase() {
    assertTrue(ana.isAnagram("Janika-3", "an3Jak-i"));
    }
    @Test (expected = IllegalArgumentException.class)
    public void nullCase()
    {
    assertTrue(ana.isAnagram(null,"something"));
    }
}