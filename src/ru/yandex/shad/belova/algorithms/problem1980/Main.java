package ru.yandex.shad.belova.algorithms.problem1980;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * http://www.e-olimp.com/problems/1980
 *
 * @author Ilariia Belova
 * @version 1.0 Oct 11, 2013
 */

public class Main {

    public static void main(String... args){
        try {
            Radiogram r = RadiogramDao.read();
            PrintWriter out = new PrintWriter(System.out);
            out.println(Decoder.decode(r));
            out.flush();
        } catch (IOException e){
            PrintWriter out = new PrintWriter(System.err);
            out.println("Problems in data access: " + e.getMessage());
            out.flush();
        }
    }
}
