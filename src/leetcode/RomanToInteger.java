package leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int num=0, i=0;
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        while (i<s.length()-1) {
            System.out.println("i: "+i+" "+s.charAt(i));
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))) {
                System.out.println("inside if: "+s.charAt(i)+" "+s.charAt(i+1));
                num = num + romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                i = i+2;
                System.out.println("num: "+num);
            }else {
                System.out.println("inside else: "+s.charAt(i));
                num = num + romanMap.get(s.charAt(i));
                i++;
                System.out.println("num: "+num);
            }
        }
        if (i == s.length()-1) {
            num = num + romanMap.get(s.charAt(i));
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
