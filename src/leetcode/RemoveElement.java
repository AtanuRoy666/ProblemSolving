package leetcode;

public class RemoveElement {
    public int findNext(int[] nums, int idx, int val) {
        for (int i=idx; i<nums.length; i++) {
            if (nums[i] != val) {
                return i;
            }
        }
        return -1;
    }
    public int removeElement(int[] nums, int val) {
        int count=0;
        int i=0, j=nums.length-1, temp;
        boolean endFlag = false;
        while (i < nums.length) {
            if (nums[i] == val){
                j = findNext(nums, i+1, val);
                if (j<0) {
                    endFlag = true;
                    break;
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            } else {
                i++;
            }
            count++;
        }
        return (count);
    }
}
