package ru.yandex.shad.belova.algorithms.problem1303;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Ultra-Fast-Sorting
 * http://www.e-olimp.com/problems/1303
 *
 * @author Ilariia Belova
 * @version 1.0 Oct 24, 2013
 */
public class Main {

    public static void main(String... args){
        try {
            List<int[]> tests = ListOfArraysOfIntToListOfLongDAO.read();
            List<Long> results = new LinkedList<Long>();
            for(int[] test: tests){
                 results.add(SortUtil.getInversions(test));
            }
            ListOfArraysOfIntToListOfLongDAO.write(results);
        } catch (IOException e) {
            System.err.println("Bad data input");
        }
    }
}
