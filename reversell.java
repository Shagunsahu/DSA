// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize node value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class reversell {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

      
        return prev;
    }

    public static void main(String[] args) { 
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reversell sol = new reversell();
        // Reversing the list
        ListNode newHead = sol.reverseList(head);

        // Printing the reversed list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }
}
