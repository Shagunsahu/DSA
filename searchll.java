import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}



class searchll {
    public boolean searchKey(ListNode head, int key) {
        if (head == null) {
            return false;
        }
 
        if (head.val == key) {
            return true;
        }
 
        return searchKey(head.next, key);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        int[] values = new int[n];
        System.out.println("Enter the values for the linked list:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search for in the linked list:");
        int key = sc.nextInt();
        ListNode head = buildList(values, -1);
        searchll sol = new searchll();
        boolean found = sol.searchKey(head, key);
        if (found) {
            System.out.println("Element " + key + " found in the linked list.");
        } else {
            System.out.println("Element " + key + " not found in the linked list.");
        }
    }
    
}