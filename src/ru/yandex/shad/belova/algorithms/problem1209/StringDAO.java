package ru.yandex.shad.belova.algorithms.problem1209;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Data Access Object for our standard input/output from e-olimp
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 20, 2013
 */
class StringDAO {
    private StringDAO(){}
    
    public static String read() throws IOException{
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public static void write(String output){
        PrintWriter out = new PrintWriter(System.out);
        out.println(output);
        out.flush();
    }
}
