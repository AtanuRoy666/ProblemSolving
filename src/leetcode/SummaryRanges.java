package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List <String> output = new ArrayList<String>();
        if (nums.length<1){
            return output;
        }
        int i=0, j=0;
        String s;
        while (j+1<nums.length){
            if (nums[j]+1 != nums[j+1]){
                if (i != j){
                    s = nums[i]+"->"+nums[j];
                } else {
                    s = nums[i]+"";
                }
                output.add(s);
                i = j+1;
                j=i;
            } else {
                j++;
            }
        }
        if (i == j) {
            s = nums[i]+"";
        } else {
            s = nums[i]+"->"+nums[j];
        }
        output.add(s);

        return output;
    }
}
