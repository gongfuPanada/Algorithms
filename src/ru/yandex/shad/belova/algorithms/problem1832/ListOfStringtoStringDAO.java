package ru.yandex.shad.belova.algorithms.problem1832;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;

class ListOfStringtoStringDAO {

    public static LinkedList<String> read() throws IOException{
        LinkedList<String> inputData = new LinkedList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int problems = Integer.parseInt(br.readLine());
            while(problems-- != 0){
                inputData.addLast(br.readLine());
            }
        } catch(IOException e){
            throw e;
        } finally {
            if(br != null){
                br.close();
            }
        }
        return inputData;
    }
    
    public static void write(String outputData){
        PrintWriter out = new PrintWriter(System.out);
        out.println(outputData);
        out.flush();
    }
}
