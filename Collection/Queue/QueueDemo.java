package Collection.Queue;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueDemo {
    static void main(String[] args) {
        //Queue as LinkedList
//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        System.out.println(q.peek());
//        q.remove();//remove the first element
//        q.offer(5); // add element
//        System.out.println(q.poll());//remove first element and return front ele
//        System.out.println("Queue after accessing head: " + q);
//        System.out.println(q);

        //Queue as ArrayDeque
        ArrayDeque<Integer> aq  = new ArrayDeque<>();
        aq.addFirst(5);
        aq.addLast(50);
        aq.add(40);
//        System.out.println(aq.getLast());;
//        System.out.println(aq);

        // PriorityQueue
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        for(int i=0;i<3;i++){
//            pq.add(i);
//            pq.add(1);
//        }

//        System.out.println(pq);
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
        pq.remove("Geeks");

        System.out.println("After Remove: " + pq);

        System.out.println("Poll Method: " + pq.poll());

        System.out.println("Final PriorityQueue: " + pq);

        System.out.println(pq.offer("5"));

        System.out.println("Accessed Element: " + pq.element());


        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("Queue after adding elements: " + q);
    }
}
