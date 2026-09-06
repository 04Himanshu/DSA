package LinkedList;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        // base case
        if (head.next == null)
            return head;

        // recursive work
        ListNode newHead = reverse(head.next);

        // self work
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // ListNode temp = new ListNode(-1);
        ListNode.print(n1);
        System.out.println();

        ListNode node = reverse(n1);

        ListNode.print(node);
    }
}
