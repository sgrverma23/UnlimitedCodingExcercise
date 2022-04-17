public class SwapAdjecentNodes {
    public static void main(String[] args) {
        SwapAdjecentNodes.Node start = new SwapAdjecentNodes.Node(5);
        start.next = new SwapAdjecentNodes.Node(6);
        start.next.next = new SwapAdjecentNodes.Node(7);
        start.next.next.next = new SwapAdjecentNodes.Node(5);
        start.next.next.next.next = new SwapAdjecentNodes.Node(4);
        swap(start);
        printList(start);
    }
    static class Node{
        int val;
        SwapAdjecentNodes.Node next;
        public Node(int val) { this.val = val; }
    }
    static void printList(SwapAdjecentNodes.Node head)
    {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    static void swap(Node start){
        if(start == null && start.next == null) {
            //nothing has to be swapped
        }
        Node currentNode = start;
        Node prevPair = null;
        Node tail = null;
        while(currentNode!=null && currentNode.next != null){
            Node n1 = currentNode;
            Node n2 = currentNode.next;
            Node n3 = currentNode.next.next;

            //swap the nodes

            Node temp = n1;
            n1 = n2;
            n2 = temp;

            //if we are at the first swap then set the head
            if(prevPair == null)
                start.next = n1;
            else
                prevPair.next = n1;
            //if there are no more nodes, set tail
            if(currentNode.next == null)
                tail.next = null;

            prevPair = n2;
            currentNode = n3;
        }

    }
}
