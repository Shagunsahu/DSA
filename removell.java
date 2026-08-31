import java.util.*;

// Class representing a node in the linked list
class Node {
    int data;
    Node next;

    // Constructor for Node with data and next node
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next = null)
    Node(int data1) {
        data = data1;
        next = null;
    }
}

// Class to hold the solution logic
class removell{

    // Function to print the linked list
    public void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth node from the end 
    // using the optimized two-pointer method
    public Node deleteNthNodeFromEnd(Node head, int N) {
        // Create a dummy node before head to handle edge cases
        Node dummy = new Node(0, head);

        // Initialize slow and fast pointers at dummy
        Node slow = dummy;
        Node fast = dummy;

        // Move fast pointer N+1 steps ahead to create a gap
        for (int i = 0; i <= N; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Slow is now at node before target → delete target node
        slow.next = slow.next.next;

        // Return updated head
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int N = 3;

        // Create linked list manually
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        // Create Solution object
        removell sol = new removell();

        // Delete the Nth node from the end
        head = sol.deleteNthNodeFromEnd(head, N);

        // Print the modified linked list
        sol.printLL(head);
    }
}
