package ru.yandex.shad.belova.algorithms.problem137;

import java.io.IOException;

/**
 * http://www.e-olimp.com/problems/137
 */
public class Main {

    public static void main(String[] args){
        try {
            int[] input = IntegerArrayDAO.read();
            int output = CombinatoricUtils.NODn(input);
            IntegerArrayDAO.write(String.valueOf(output));
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
