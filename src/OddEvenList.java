public class OddEvenList {
    static class Node{
        int val;
        OddEvenList.Node next;
        public Node(int val) { this.val = val; }
    }
    public static void main(String[] args) {
        OddEvenList.Node start = new OddEvenList.Node(1);
        start.next = new OddEvenList.Node(2);
        start.next.next = new OddEvenList.Node(3);
        start.next.next.next = new OddEvenList.Node(-2);
        start.next.next.next.next = new OddEvenList.Node(-3);
        start.next.next.next.next.next = new OddEvenList.Node(9);

        printList(oddEvenList(start));
    }
    static void printList(OddEvenList.Node head)
    {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static Node oddEvenList(Node head) {
        if (head==null || head.next == null) return head;
        Node odds = new Node(head.val);
        Node evens = new Node(head.next.val);
        Node odd_ptr = odds, even_ptr = evens;
        head = head.next.next;
        int idx = 3;
        while (head!=null) {
            if (idx%2==0) {
                even_ptr.next = new Node(head.val);
                even_ptr = even_ptr.next;
            }
            else {
                odd_ptr.next = new Node(head.val);
                odd_ptr = odd_ptr.next;
            }
            idx++; head = head.next;
        }
        odd_ptr.next = evens;
        return odds;
    }
}
