package ru.yandex.shad.belova.algorithms.problem318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

class EOlimpListOfStringDAO {
    
    private EOlimpListOfStringDAO(){}

    public static List<String> read() throws IOException{
        List<String> inputData = new LinkedList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int problems = Integer.parseInt(br.readLine());
            while(problems-- != 0){
                inputData.add(br.readLine());
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

    public static void write(List<String> outputData){
        PrintWriter out = new PrintWriter(System.out);
        for(String line: outputData){
            out.println(line);
        }
        out.flush();
    }
}
