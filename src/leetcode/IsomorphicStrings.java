package leetcode;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if (len != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap();
        HashMap <Character, Integer> tMap = new HashMap();
        char sChar, tChar;
        int sIdx, tIdx;
        for (int i=0; i<len; i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, i);
            }
            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, i);
            }
            sIdx = sMap.get(sChar);
            tIdx = tMap.get(tChar);

            if (sIdx != tIdx) {
                return false;
            }


        }
        return true;
    }
}
