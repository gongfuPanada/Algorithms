package ru.yandex.shad.belova.algorithms.problem236;

import java.io.IOException;
import java.util.LinkedList;

/**
 * http://www.e-olimp.com/problems/236
 */
public class Main {
    
    public static void main(String[] args){
        try {
            LinkedList<Integer> input = LinkedListIntegerDAO.read();
            LinkedList<Integer> output = new LinkedList<Integer>();
            for(int inputNumber: input){
                int counts = TriominoUtil.count(inputNumber);
                output.addLast(counts);
            }
            LinkedListIntegerDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
