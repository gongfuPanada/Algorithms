package ru.yandex.shad.belova.algorithms.problem1213;

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
            String[] s = input.split(" |\\^");
            MassiveNumber A = new MassiveNumber(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            MassiveNumber B = new MassiveNumber(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            String output = A.compareTo(B) > 0 ? A.toString() : B.toString();
            StringDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}
