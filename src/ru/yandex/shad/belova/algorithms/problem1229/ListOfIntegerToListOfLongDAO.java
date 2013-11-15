package ru.yandex.shad.belova.algorithms.problem1229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * Class for input/output e-olimp data processing
 *
 * BufferedReader exists here in cause of speed; this approach is recommended by professor
 * in cases of big multyline input
 *
 * @author Ilariia Belova
 * @version 1.0 Nov 5, 2013
 */
class ListOfIntegerToListOfLongDAO {

    private ListOfIntegerToListOfLongDAO(){};

    /**
     * Reads data in format:
     *   test_element_1
     *   test_element_2
     *   test_element_3
     *   ...
     *   0
     *
     * @return list with integer for each test
     * @throws java.io.IOException if there are exist some problem in data access
     */
    public static List<Integer> read() throws IOException{
        List<Integer> inputData = new LinkedList<Integer>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int inputValue = 0;
            while((inputValue = Integer.parseInt(br.readLine())) != 0){
                inputData.add(inputValue);
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

    /**
     * Writes data from least, each on separate line
     * @param outputData list of long values
     */
    public static void write(List<Long> outputData){
        PrintWriter out = new PrintWriter(System.out);
        for(long value: outputData){
            out.println(String.valueOf(value));
        }
        out.flush();
    }
}
