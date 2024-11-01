package leetcode;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> charMap = new HashMap<>();
        String[] myArray = s.split(" ");
        if (pattern.length() != myArray.length){
            return false;
        }
        for (int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if (charMap.containsKey(c) && !Objects.equals(charMap.get(c), myArray[i])){
                return false;
            }else if (!charMap.containsKey(c) && !charMap.containsValue(myArray[i])) {
                charMap.put(c, myArray[i]);
            } else if (!charMap.containsKey(c) && charMap.containsValue(myArray[i])) {
                return false;
            }
        }
        return true;
    }
}
