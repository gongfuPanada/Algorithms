package ru.yandex.shad.belova.algorithms.problem4208;

import java.io.IOException;

/**
 * http://www.e-olimp.com/problems/4208
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 21, 2013
 */

public class Main {
    
    public static void main(String[] args){
        try {
            String input = StringDAO.read();
            String[] s = input.split(" ");
            PowerOfTwoInterval interval = new PowerOfTwoInterval(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            
            StringDAO.write(String.valueOf(interval.getAmountOfNumbersWithFirstDigitOne()));
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
