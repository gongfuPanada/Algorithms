package ru.yandex.shad.belova.algorithms.problem1513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/** Data Access Object for our standard input/output from e-olimp
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */
class EOlimpListOfStringDAO {
    
    private EOlimpListOfStringDAO(){}
    /**Reads specific format of input from System.in
     * <p>
     * First line - is integer, quantity of following strings
     * <br>
     * Other lines - are strings
     * </p>
     * @return list of strings
     * @throws IOException if there are some problems with reading stream
     */
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
    
    /**Writes list of strings to System.out
     * 
     * @param outputData - list of strings
     */
    public static void write(List<String> outputData){
        PrintWriter out = new PrintWriter(System.out);
        for(String line: outputData){
            out.println(line);
        }
        out.flush();
    }
}
