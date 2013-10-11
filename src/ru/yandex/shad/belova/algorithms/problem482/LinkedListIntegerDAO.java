package ru.yandex.shad.belova.algorithms.problem482;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

class LinkedListIntegerDAO {
    private LinkedListIntegerDAO(){}
    
    public static LinkedList<Integer> read() throws IOException{
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<Integer>();
        int value = 0;
        while((value = scanner.nextInt()) != -1) {
            l.add(value);
        }
        return l;
    }
    
    public static void write(LinkedList<Long> output){
        PrintWriter out = new PrintWriter(System.out);
        for(Long outValue: output){
            out.println(String.valueOf(outValue));
        }
        out.flush();
    }
}
