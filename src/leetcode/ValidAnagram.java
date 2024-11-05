package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap <Character, Integer> sMap = new HashMap<>();
        HashMap <Character, Integer> tMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                sMap.put(sChar, sMap.get(sChar)+1);
            }else {
                sMap.put(sChar, 1);
            }
            if (tMap.containsKey(tChar)) {
                tMap.put(tChar, tMap.get(tChar)+1);
            }else {
                tMap.put(tChar, 1);
            }
        }

        return (sMap.equals(tMap));
    }
}
