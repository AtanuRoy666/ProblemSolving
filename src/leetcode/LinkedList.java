package leetcode;

public class LinkedList {
    public ListNode makeLinkedList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode copy = head;
        for (int i=1; i<arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            copy.next=node;
            copy = node;
        }
        return head;
    }

    public void printLinkedList(ListNode head) {
        while (head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public ListNode reverseLinkedList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode prevNode = head;
        ListNode currentNode = head.next;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;

        }
        head.next = null;
        head = prevNode;
        return head;
    }
}
