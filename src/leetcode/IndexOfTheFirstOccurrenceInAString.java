package leetcode;

public class IndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if (needle.length()>haystack.length()) {
            return -1;
        }
        int start = 0, end = needle.length();

        while (end <= haystack.length()) {
            if (haystack.substring(start, end).equals(needle)) {
                return start;
            }
            start++;
            end++;
        }
        return -1;

    }
}
