package leetcode;

import java.util.HashMap;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        while (head != null) {
            int val = head.val;
            if (map.containsKey(val)) {
                return true;
            } else {
                map.put(val, true);
            }
            head = head.next;

        }
        return false;

    }

}
