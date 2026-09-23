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


class rotatell {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while (fast != null) {
            fast = fast.next;
            length++;
        }

        int rotations = k % length;
        if (rotations == 0) {
            return head;
        }

        fast = head;
        for (int i = 0; i < rotations; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }

    static ListNode buildList(int[] values, int pos) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode tail = head;
        for (int index = 1; index < values.length; index++) {
            tail.next = new ListNode(values[index]);
            tail = tail.next;
        }
        return head;
    }

    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        int[] values = new int[n];
        System.out.println("Enter the values for the linked list:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        System.out.println("Enter the position of the loop (or -1 for no loop):");
        int pos = sc.nextInt();
        ListNode head = buildList(values, pos);
        System.out.println("Enter the number of positions to rotate right:");
        int k = sc.nextInt();

        rotatell sol = new rotatell();
        ListNode rotated = sol.rotateRight(head, k);
        System.out.println("The linked list after rotating right by " + k + " positions is:");
        printList(rotated);
    }
}