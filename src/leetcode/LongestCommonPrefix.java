package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String start=strs[0];
        String last = strs[strs.length-1];

        String prefix = "";

        for (int i=0; i<start.length(); i++){
            if (start.charAt(i) == last.charAt(i)){
                prefix+=start.charAt(i);
            }else {
                break;
            }
        }
        return prefix;

    }
}
