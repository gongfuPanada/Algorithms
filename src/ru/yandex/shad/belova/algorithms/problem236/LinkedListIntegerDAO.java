package ru.yandex.shad.belova.algorithms.problem236;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

class LinkedListIntegerDAO {
    private LinkedListIntegerDAO(){}
    
    public static LinkedList<Integer> read() throws IOException{
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<Integer>();
        int testsNumber = scanner.nextInt();
        while(testsNumber > 0) {
            l.add(scanner.nextInt());
            testsNumber--;
        }
        return l;
    }
    
    public static void write(LinkedList<Integer> output){
        PrintWriter out = new PrintWriter(System.out);
        for(Integer outValue: output){
            out.println(String.valueOf(outValue));
        }
        out.flush();
    }
}
