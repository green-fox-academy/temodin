import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "caracas";
        String word2 = "sacarca";

        char[] word1Arr = new char[word1.length()];
        char[] word2Arr = new char[word2.length()];

        for (int i = 0; i < word1.length(); i++) {
        word1Arr[i] = word1.charAt(i);
        }
        for (int i = 0; i < word2.length(); i++) {
        word2Arr[i] = word2.charAt(i);
        }

        int charCounter1 = 0;
        int charCounter2 = 0;
        boolean isAnagram = true;

        for (int i = 0; i < word1Arr.length; i++) {
            for (int j = 0; j < word1Arr.length; j++) {
                if (word1Arr[i] == word1Arr[j]) {charCounter1++;
                }
                }
            for (int j = 0; j < word2Arr.length; j++) {
                if (word1Arr[i] == word2Arr[j]) {charCounter2++;
                }
            }
            if (charCounter1 != charCounter2) {
                isAnagram = false;
                break;
            }
            charCounter1 = 0;
            charCounter2 = 0;
            }
        System.out.println(isAnagram);
        }


    }
