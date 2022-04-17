import java.util.HashSet;

public class RemoveDuplicateLinkedList {
    public static void main(String[] args) {
        Node start = new Node(5);
        start.next = new Node(6);
        start.next.next = new Node(7);
        start.next.next.next = new Node(5);
        start.next.next.next.next = new Node(4);
        removeDuplicate(start);
        printList(start);
    }
    static class Node{
        int val;
        Node next;
        public Node(int val) { this.val = val; }
    }

    public static void removeDuplicate(Node node){
        HashSet<Integer> set = new HashSet<>();
        Node current = node;
        Node prev = null;
        while(current != null){
            if(set.contains(current.val)){
                prev.next = current.next;
            }
            else{
                set.add(current.val);
                prev = current;
            }
            current = current.next;
        }
    }

    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
