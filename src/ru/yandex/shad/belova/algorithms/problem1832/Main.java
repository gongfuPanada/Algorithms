package ru.yandex.shad.belova.algorithms.problem1832;

import java.io.IOException;
import java.util.LinkedList;

/**
 * http://www.e-olimp.com/problems/1872
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */

public class Main {
    

    public static void main(String[] args){
        try {
            LinkedList<String> input = ListOfStringtoStringDAO.read();
            PersistentStack stack = new PersistentStack(input.size());
            for(String clone: input){
                String[] cloneData = clone.split(" ");
                int whichClone = Integer.parseInt(cloneData[0]);
                int mass = Integer.parseInt(cloneData[1]);
                if(mass != 0){
                    stack.push(whichClone, mass);
                } else {
                    stack.pop(whichClone);
                }
            }
            ListOfStringtoStringDAO.write(String.valueOf(stack.totalWeight()));
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
