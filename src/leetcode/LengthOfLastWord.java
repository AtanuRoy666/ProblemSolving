package leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1, j = s.length()-1;

        while (i>=0 && j>=0) {
            if (s.charAt(i) == ' '){
                i--;
                j--;
            }else{
                if (s.charAt(j) == ' '){
                    break;
                }else {
                    j--;
                }
            }
        }
        j++;
        return (i-j+1);


    }
}
