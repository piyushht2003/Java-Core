package Queues;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class MyQueue {
    Node front;
    Node rear;
    int len;

    void add(int val) {
        Node temp = new Node(val);
        if (front == null) { // or len == 0
            front = rear = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
        len++;
    }

    int remove() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int ans = front.val;
        front = front.next;
        len--;
        return ans;
    }

    int peek(){
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        return front.val;
    }

    int size(){
        return len;
    }

    boolean isEmpty(){
        return front == null;
    }

    void display(){
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class ImplementationOfQueueUSingLinkedList {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
//        q.remove();
        q.add(10);
        q.add(59);
        q.add(22);
        q.add(43);
        q.add(12);
        q.add(87);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
