package LinkedList;


public class NodeOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Stores address of the next node/element by connecting
        a.next = b; // head
        b.next = c;
        c.next = d;
        d.next = e; // null
        System.out.println(a.next.next.next.next.val);
        System.out.println(b);
        System.out.println(a.next);
    }
}
