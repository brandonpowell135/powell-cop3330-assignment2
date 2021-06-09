package assignment2.ex24.base;

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetector {
    public boolean isAnagram(String word1,String word2){
        //if anagram
        if(word1.length() == word2.length()) {

            char Array1[] = word1.toLowerCase().toCharArray();
            char Array2[] = word2.toLowerCase().toCharArray();

            Arrays.sort(Array1);
            Arrays.sort(Array2);

            if (Arrays.equals(Array1,Array2)) {
                return true;
            }else
                return false;
        }
        else
            return false;
    }

}
