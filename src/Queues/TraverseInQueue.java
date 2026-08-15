package Queues;

import java.util.LinkedList;
import java.util.Queue;
public class TraverseInQueue {
    private static void display(Queue<Integer> q){
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }

    private static void addAtIdx(Queue<Integer> q, int idx, int val) {
        int n = q.size();
        if(idx<0 || idx>n){
            System.out.println("Invalid index!");
            return;
        }
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        q.add(val);
        for (int i = 0; i < n-idx; i++) {
            q.add(q.remove());
        }
        System.out.println();
    }

    private static int peekAtIdx(Queue<Integer> q, int idx) {
        int n = q.size();
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        int ans = q.peek();
        for (int i = 0; i < n-idx; i++) {
            q.add(q.remove());
        }
        System.out.println();
        return ans;
    }

    private static int removeAtPeek(Queue<Integer> q, int idx) {
        int n = q.size();
        for (int j = 0; j < idx; j++) {
            q.add(q.remove());
        }
        int ans = q.remove();
        for (int i = 0; i < q.size()-idx; i++) { // current q ke size se minus krdo idx toh ajayega og queue
            q.add(q.remove());
        }
        System.out.println();
        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(23); q.add(331); q.add(460);
        display(q);

        addAtIdx(q, 3, 765);
        display(q);

        peekAtIdx(q, 3);
        removeAtPeek(q, 2);
        display(q);
    }
}
