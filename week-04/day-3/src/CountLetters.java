import java.util.HashMap;

public class CountLetters {

    public HashMap createDict (String stringToConvert) {

       char[] stringAsArr = stringToConvert.toCharArray();
        HashMap<Character,Integer> tempMap = new HashMap();
        int occurence =0;

        for (int i = 0; i < stringAsArr.length; i++) {
            if (i != stringToConvert.indexOf(stringAsArr[i])) continue;
            for (int j = 0; j < stringAsArr.length; j++) {
            if (stringAsArr[i] == stringAsArr[j]) {occurence++;}
            }
            tempMap.put(stringAsArr[i],occurence);
            occurence = 0;
        }
        return tempMap;
    }

}
