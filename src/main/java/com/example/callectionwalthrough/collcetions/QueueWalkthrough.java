package com.example.callectionwalthrough.collcetions;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueWalkthrough {

    public void priorityQueueWorks(){
        PriorityQueue pq = new PriorityQueue();
        pq.offer(200);
        pq.offer(300);
        pq.offer(200);
        System.out.println(pq);
        //using iterator
        Iterator it = pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
