package leetcode;

import java.util.HashMap;
import java.util.Objects;

public class RansomNote {
    public static HashMap generateHashmap(String s) {
        HashMap <Character, Integer> sMap = new HashMap();
        char c;
        for (int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            Object ob = sMap.get(c);
            if (ob == null) {
                sMap.put(c, 1);
            } else {
                sMap.put(c, (int)(ob)+1);
            }
        }
        return sMap;
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length()) {
            return false;
        }
        HashMap magazineMap = generateHashmap(magazine);
        boolean flag=true;
        for (int i=0; i<ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            Object ob = magazineMap.get(c);
            if (ob == null || (int)ob == 0) {
                flag = false;
                break;
            } else {
               int update = (int)ob - 1;
               magazineMap.put(c, update);
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));

    }
}
