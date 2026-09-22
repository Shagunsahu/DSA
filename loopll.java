import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    // Constructor 
    ListNode(int value) {
        data = value;
        next = null;
    }
}


class loopll{

    
    private int countLoopLength(ListNode meetingPoint) {
        int length = 1;
        ListNode current = meetingPoint.next;
        while (current != meetingPoint) {
            length++;
            current = current.next;
        }
        return length;
    }

    public int lengthOfLoop(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }
    static ListNode buildList(int[] values, int pos) {

        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode tail = head;
        ListNode loopNode = (pos == 0) ? head : null;
        for (int index = 1; index < values.length; index++) {
            tail.next = new ListNode(values[index]);
            tail = tail.next;
            if (index == pos) {
                loopNode = tail;
            }
        }
        if (pos != -1) {
            tail.next = loopNode;
        }

        return head;
    }


    // Driver code.
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);//object
        int n = sc.nextInt();
        int[] values = new int[n];
        System.out.println("Enter the values for the linked list:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        System.out.println("Enter the position of the loop (or -1 for no loop):");
        int pos = sc.nextInt();
        ListNode head = buildList(values, pos);
        loopll sol = new loopll();
        System.out.println(sol.lengthOfLoop(head));
    }
}