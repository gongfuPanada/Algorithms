package ru.yandex.shad.belova.algorithms.problem390;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
