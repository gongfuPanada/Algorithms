package ru.yandex.shad.belova.algorithms.problem1229;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * http://www.e-olimp.com/problems/1229
 * 
 * @author Ilariia Belova
 * @version 1.0 Nov 5, 2013
 */

public class Main {
    
    public static void main(String[] args){
        try {
            List<Integer> input = ListOfIntegerToListOfLongDAO.read();
            List<Long> output = new LinkedList<Long>();
            for(int inputNumber: input){
                long gcd = EulerUtils.ExtremeGCD(inputNumber);
                output.add(gcd);
            }
            ListOfIntegerToListOfLongDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
