package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
//        LinkedList l1 = new LinkedList();
//        int [] arr = {1, 2, 3, 4, 5};
//        ListNode head = l1.makeLinkedList(arr);
//        l1.printLinkedList(head);
//        System.out.println();
//        head = l1.reverseLinkedList(head);
//        l1.printLinkedList(head);
        String s = "dog cat cat dog";
        String t = "abba";
        HashMap<Character, String> charMap = new HashMap<>();
        String[] myArray = s.split(" ");
        if (t.length() != myArray.length){
            System.out.println("length mismatch");;
        } else {
            System.out.println(myArray.length + " " + t.length());
            for (int i=0; i<t.length(); i++){
                char c = t.charAt(i);
                System.out.println(c);
                if (charMap.containsKey(c) && !Objects.equals(charMap.get(c), myArray[i])){

                    System.out.println("key already mapped with different value"+c+" : "+charMap.get(c)+" : "+myArray[i]);
                    break;
                }else if (!charMap.containsKey(c) && !charMap.containsValue(myArray[i])) {
                    charMap.put(c, myArray[i]);
                } else if (!charMap.containsKey(c) && charMap.containsValue(myArray[i])) {
                    System.out.println("value already mapped with differnt key");
                    break;
                }
            }
        }
    }
}
