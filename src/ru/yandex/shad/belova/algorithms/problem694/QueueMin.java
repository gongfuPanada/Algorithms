package ru.yandex.shad.belova.algorithms.problem694;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class QueueMin {
    private Queue<Long> queue = new LinkedList<Long>();
    private Deque<Long> dequeMin  = new LinkedList<Long>();

    private long total = 0;

    public void poll(){
        if(!queue.isEmpty())     {
            long head = queue.poll();
            if(head == dequeMin.peekFirst()){
                dequeMin.poll();
            }
        }
        if(!dequeMin.isEmpty())     {
            total += dequeMin.peekFirst();
        }
    }

    public void offer(long value){
        queue.offer(value);
        while(!dequeMin.isEmpty() && dequeMin.peekLast() > value){
            dequeMin.pollLast();
        }
        dequeMin.offerLast(value);
        total += dequeMin.peekFirst();
    }

    public long getTotalMin(){
        return total;
    }
}
