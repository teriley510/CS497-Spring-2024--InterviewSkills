public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Node head = new Node(12);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(head.val);
        printList(head);
        RemoveNthNode newObj = new RemoveNthNode();
        newObj.removeTheNode(head, 1);
        printList(head);
    }


    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
