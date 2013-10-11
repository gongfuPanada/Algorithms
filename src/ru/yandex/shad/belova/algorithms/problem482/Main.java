package ru.yandex.shad.belova.algorithms.problem482;

import java.io.IOException;
import java.util.LinkedList;

/**
 * http://www.e-olimp.com/problems/482
 */
public class Main {
    
    public static void main(String[] args){
        try {
            LinkedList<Integer> input = LinkedListIntegerDAO.read();
            LinkedList<Long> output = new LinkedList<Long>();
            for(int inputNumber: input){
                long variants = PlitkasUtil.count(inputNumber);
                output.addLast(variants);
            }
            LinkedListIntegerDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
