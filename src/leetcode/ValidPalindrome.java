package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return false;
        }
        int start = 0, end = s.length()-1;

        while (start <= end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if (!Character.isLetterOrDigit(startChar)){
                start++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                end--;
            } else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}
