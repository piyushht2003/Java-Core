package LinkedList;

public class DisplayNode {
    public static void displayRec(Node head){
        if (head==null) return;
        System.out.print(head.val + " ");
        displayRec(head.next);
    }
    public static void display(Node head){
        Node temp = head; // -> temp me gya head as a object -> temp aur head ek object hai
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static int get(Node head, int idx){
        Node temp = head;
        for (int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
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
//        display(a);
//        displayRec(a);
        System.out.println(get(a,3));
    }


}

