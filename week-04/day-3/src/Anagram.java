import java.util.Arrays;

public class Anagram {

    public boolean isAnagram (String word1, String word2) {
        if (word1 == null || word2 == null) {throw new IllegalArgumentException();}
        char[] word1Arr = word1.toLowerCase().toCharArray();
        Arrays.sort(word1Arr);
        char[] word2Arr = word2.toLowerCase().toCharArray();
        Arrays.sort(word2Arr);

        return Arrays.equals(word1Arr,word2Arr);
    }

}
