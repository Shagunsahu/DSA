
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}


class suumll {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //YOUR CODE GOES HERE
        ListNode r=new ListNode();
        ListNode temp=r;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return r.next;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        suumll solution = new suumll();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}