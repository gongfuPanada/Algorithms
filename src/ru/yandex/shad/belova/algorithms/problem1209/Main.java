package ru.yandex.shad.belova.algorithms.problem1209;

import java.io.IOException;
import java.util.Locale;

/**
 * http://www.e-olimp.com/problems/1209
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 21, 2013
 */

public class Main {
    
    public static void main(String[] args){
        try {
            String input = StringDAO.read();
            int n = Integer.parseInt(input);
              StringDAO.write(String.format(Locale.US, "%.4f", Calculator.calculate(n)));
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
