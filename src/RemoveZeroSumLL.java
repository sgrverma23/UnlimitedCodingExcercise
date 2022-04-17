import java.util.HashMap;
import java.util.Map;

public class RemoveZeroSumLL {
    static class Node{
        int val;
        RemoveZeroSumLL.Node next;
        public Node(int val) { this.val = val; }
    }
    public static void main(String[] args) {
        Node start = new RemoveZeroSumLL.Node(1);
        start.next = new RemoveZeroSumLL.Node(2);
        start.next.next = new RemoveZeroSumLL.Node(3);
        start.next.next.next = new RemoveZeroSumLL.Node(-2);
        start.next.next.next.next = new RemoveZeroSumLL.Node(-3);
        start.next.next.next.next.next = new RemoveZeroSumLL.Node(9);
        removeZeroSumSublists(start);
        //printList(start);
    }
    public static void removeZeroSumSublists(Node head) {
        if(head == null)
            return;

        Map<Integer, Node> map = new HashMap<>();
        int sum = 0;

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;
//1,2,3,-2,-3,9
        while(curr != null) {
            sum += curr.val;
            map.put(sum, curr);
            curr = curr.next;
        }

        curr = dummy;
        sum = 0;

        while(curr != null) {
            sum += curr.val;
            curr.next = map.get(sum).next;

            curr = curr.next;
        }
        printList(head);
    }
    static void printList(RemoveZeroSumLL.Node head)
    {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
