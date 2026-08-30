
import java.util.*;

class Node {
     int data; 
     Node next;     
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class middlell {
    
    static Node findMiddle(Node head) {
        Node slow = head; 
        Node fast = head;   
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;  
            slow = slow.next;        
        }
        return slow;  
    }

    static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static void printList(Node head) {
        Node current = head;
        System.out.print("Linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null;
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertAtEnd(head, value);
        }
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node middleNode = findMiddle(head);
        System.out.println("The middle node value is: " + middleNode.data);
    }
}
                                