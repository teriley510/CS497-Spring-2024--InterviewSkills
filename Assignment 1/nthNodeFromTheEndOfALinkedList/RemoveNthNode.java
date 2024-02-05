

public class RemoveNthNode {
    public Node removeTheNode( Node head, int n) {
       

        Node dummyHead = new Node(0);
        dummyHead.next = head;
        Node slow = dummyHead;
        Node fast = dummyHead;
        

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        

        while( fast.next !=null ) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.next.val);
        if(slow.val == head.val) {
            head = head.next;
            System.out.println(head.val);
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }

    
}

