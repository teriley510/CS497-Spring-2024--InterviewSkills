import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Node head1 = new Node(7);
        Node head2 = new Node(15);
        Node head3 = new Node(22);

        head1.next = new Node(11);
        head1.next.next = new Node(17);

        head2.next = new Node(20);
        head2.next.next = new Node(14);

        head3.next = new Node(30);
        head3.next.next = new Node(25);

        Node[] linkedListsArray = {head1, head2, head3};
        Node newList = mergeKLists(linkedListsArray);
        printList(newList);

        
}


    public static Node mergeKLists(Node[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(Node head: lists) {
           while(head != null) {
              minHeap.add(head.val);
              head = head.next;
            }
        }
        Node dummy = new Node(0);
        Node head = dummy;
        while(minHeap.isEmpty() == false ) {
            head.next = new Node(minHeap.remove());
            head = head.next;
        }
        return dummy.next;
    }

    public static void printList(Node head) {
                while (head != null) {
                    System.out.print(head.val + " ");
                    head = head.next;
                }
                System.out.println();
    }
        
}


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

