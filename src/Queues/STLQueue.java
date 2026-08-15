package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class STLQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(40);
        q.add(70);
        q.add(89);
        System.out.println(q + " " + q.size());

        q.remove();
        System.out.println(q + " " + q.size());
    }
}
