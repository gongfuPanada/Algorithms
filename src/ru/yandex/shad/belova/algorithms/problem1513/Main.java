package ru.yandex.shad.belova.algorithms.problem1513;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**Point of access of our program
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */

public class Main {
    
    /**Program runs searching of post-order walk of Binary tree using 
     * given pre-order walk and symmetric walk.
     * <p>
     * Program reads data from System.in in EOlimp format 
     * (first line - number of tests, next lines - tests, each test is on the separate line).
     * <p>
     * Program writes result to System.out in EOlimp format 
     * (writes answer for each test on the separate line)
     * <p>
     * This program assumes that there couldn't be any problems and mistakes in data input format,
     * because it is postulated by EOlimp
     * @param args - no any params are processed
     */
    public static void main(String[] args){
        try {
            List<String> input = EOlimpListOfStringDAO.read();
            List<String> output = new LinkedList<String>();
            for(String test: input){
                String[] orders = test.split(" ");
                String directOrder = orders[1];
                String centerOrder = orders[2];
                BinaryTree b = new BinaryTree(directOrder, centerOrder);
                output.add(b.getReverseOrder());
            }
            EOlimpListOfStringDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
