package ru.yandex.shad.belova.algorithms.problem137;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class IntegerArrayDAO {
    private IntegerArrayDAO(){}
    
    public static int[] read() throws IOException{
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i< numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    
    public static void write(String output){
        PrintWriter out = new PrintWriter(System.out);
        out.println(output);
        out.flush();
    }
}
