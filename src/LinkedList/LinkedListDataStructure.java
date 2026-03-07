package LinkedList;

// user Defined datatype
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

// user Defined data structure
class LinkedList{
    Node head; // null by default
    Node tail; // null by default
    int size;

    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if (head==null){
            System.out.println("Linked List is empty!");
            return;
        }
        head = head.next;
        if (head==null) tail = null;
        size--;
    }

    void display() {
        if (head==null) return;
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int search(int val) {
        if (head==null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp!=null){
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid index");
        else if (idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else {
            Node temp = head;
            for (int i = 1; i<idx; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    int get(int idx){
        Node temp = head;
        for (int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void delete(int idx) {
        if (idx<0 || idx>=size){
            System.out.println("Invalid index!");
            return;
        }
        if (idx==0){
            deleteAtHead(); // deleting head
            return;
        }
        Node temp = head;
        for (int i=1; i<size; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // deleting
        if (idx==size-1) tail = temp; // deleting tail
        size--;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {

        // inserting nodes at tail
        LinkedList ll = new LinkedList();
        ll.addAtTail(10); ll.addAtTail(20);
        ll.addAtTail(30); ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();

        // inserting nodes at head
        ll.addAtHead(15); ll.addAtHead(35);
        ll.display();

        // deleting node at head
        ll.deleteAtHead(); ll.display(); // 35 deleted 15 10 20 30 40 50

        // total size of the Linked List
        System.out.println("Size of the LinkedList is : " + ll.size);

        // search the index number of the node
        System.out.println("Node is located at index : " + ll.search(90));


        // inserting node at position
        ll.insert(70,3); ll.display();


        // getting element from the Linked list at position
        System.out.println(ll.get(4)); //  15 10 20 70 30 40 50 ---> 30

        // delete at index
        ll.delete(4); ll.display();
    }
}
