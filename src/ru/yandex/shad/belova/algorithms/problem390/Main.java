package ru.yandex.shad.belova.algorithms.problem390;

import java.io.IOException;

/**
 * http://www.e-olimp.com/problems/1213
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 21, 2013
 */

public class Main {
    
    public static void main(String[] args){
        try {
            String input = StringDAO.read();
            StringDAO.write(String.valueOf(Anagrammer.calculate(input)));
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
