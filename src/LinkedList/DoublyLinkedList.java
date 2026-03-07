package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class Dll{
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0){
            System.out.println("List is empty!");
        }
        if(size==1) head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List is empty!");
        }
        if(size==1) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display(){
        if (head==null) return;
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        if (head==null) return;
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insert(int idx, int val){
        if (idx<0 || idx>size){
            System.out.println("Invalid index!");
            return;
        }
        if (idx==0){
            insertAtHead(val);
            return;
        }
        if (idx==size){
            insertAtTail(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for (int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        a.next = temp.next;
        temp.next = a;
        a.prev = temp;
        a.next.prev = a;
        size++;
    }
    void delete(int idx){
        if (idx<0 || idx>size){
            System.out.println("Invalid index!");
            return;
        }
        if (idx==0){
            deleteAtHead();
            return;
        }
        if (idx==size){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for (int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
        size--;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Dll list = new Dll();

        // inserting values at head
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        // inserting values at tail
        list.insertAtTail(60);
        list.insertAtTail(70);

        list.display();

        list.deleteAtTail(); // deleting nodes at tail
        list.deleteAtHead(); // deleting nodes at head

        list.display();
//        list.displayReverse();
        list.insert(3,70); // inserting at idx and add a value
        list.display();
        list.delete(3); // deleting at idx
        list.display();
    }
}
