package ru.yandex.shad.belova.algorithms.problem1249;

import java.io.IOException;
import java.util.LinkedList;

/**
 * http://www.e-olimp.com/problems/1249
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 20, 2013
 */

public class Main {
    
    public static void main(String[] args){
        try {
            LinkedList<Integer> input = ListOfIntegerWithoutNumberOfTestsDAO.read();
            LinkedList<Integer> output = new LinkedList<Integer>();
            for(int inputNumber: input){
                int firstDigit = FirstDigitOfPowerAlgorithm.getDigit(inputNumber);
                output.addLast(firstDigit);
            }
            ListOfIntegerWithoutNumberOfTestsDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
