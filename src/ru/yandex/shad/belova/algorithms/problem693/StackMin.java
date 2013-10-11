package ru.yandex.shad.belova.algorithms.problem693;

import java.util.LinkedList;

class StackMin {
    private LinkedList<Long> stack = new LinkedList<Long>();
    private long total = 0;

    public void pop(){
        if(!stack.isEmpty())     {
            stack.pop();
        }
        if(!stack.isEmpty())     {
            total += stack.peek();
        }
    }

    public void push(long value){
        if(!stack.isEmpty())     {
            stack.push(Math.min(value, stack.peek()));
        } else {
            stack.push(value);
        }
        total += stack.peek();
    }

    public long getTotalMin(){
        return total;
    }
}
