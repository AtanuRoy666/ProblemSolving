package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m+n];
        boolean flag = false;
        int p1=0, p2=0, p3=0;
        while (p1<m && p2<n){
            if (nums1[p1] < nums2[p2]) {
                arr[p3] = nums1[p1];
                p1++;
            }else {
                arr[p3] = nums2[p2];
                p2++;
            }
            p3++;
        }
        if (p1==m){
            for (int i=p2; i<n; i++){
                arr[p3] = nums2[i];
                p3++;
            }
        } else {
            for (int i=p1; i<m; i++) {
                arr[p3] = nums1[i];
                p3++;
            }
        }
        for (int i=0; i<arr.length; i++){
            nums1[i] = arr[i];
        }
        System.out.println(Arrays.toString(Arrays.stream(nums1).toArray()));
    }

    public static void main(String[] args) {
        HashMap <Integer, Boolean> h = new HashMap();
        int [] arr1 = {1, 2, 3, 0, 0, 0};
        int [] arr2 = {2, 5, 6};
        String s="abcd";
        HashMap <Character, Integer> sMap = new HashMap();
        for (int i=0; i<s.length(); i++) {
            sMap.put(s.charAt(i), 1);
        }
        //merge(arr1, 3, arr2, 3);
        h.put(1, true);
        h.put(2, false);
        System.out.println(h.get(1));
        System.out.println(h.get(2));
        System.out.println(h.get(3));
    }
}
