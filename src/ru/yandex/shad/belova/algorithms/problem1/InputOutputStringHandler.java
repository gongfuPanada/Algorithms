package ru.yandex.shad.belova.algorithms.problem1;

import java.io.PrintWriter;
import java.util.Scanner;

class InputOutputStringHandler {
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        String line = "";
        if (scanner.hasNextLine()){
            line = scanner.next();
        }
        return line;
    }
    public static void write(String line){
        PrintWriter out = new PrintWriter(System.out);
        out.println(line);
        out.flush();
    }
}
