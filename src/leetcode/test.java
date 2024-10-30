package leetcode;

public class test {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        int [] arr = {1, 2, 3, 4, 5};
        ListNode head = l1.makeLinkedList(arr);
        l1.printLinkedList(head);
        System.out.println();
        head = l1.reverseLinkedList(head);
        l1.printLinkedList(head);
    }
}
