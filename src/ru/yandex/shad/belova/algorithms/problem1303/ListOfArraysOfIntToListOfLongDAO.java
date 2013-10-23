package ru.yandex.shad.belova.algorithms.problem1303;

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
 * @version 1.0 Oct 24, 2013
 */
class ListOfArraysOfIntToListOfLongDAO {

    private ListOfArraysOfIntToListOfLongDAO(){};

    /**
     * Reads data in format:
     *    N - number of elements in test
     *      test_element_1
     *      test_element_2
     *      ...
     *      test_element_N
     *    M - number of elements in test
     *      test_element_1
     *      test_element_2
     *      ...
     *      test_element_M
     *   ...
     *   0
     *
     * @return list with int[] array for each test
     * @throws IOException if there are exist some problem in data access
     */
    public static List<int[]> read() throws IOException{
        List<int[]> inputData = new LinkedList<int[]>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int problems = 0;
            while((problems = Integer.parseInt(br.readLine())) != 0){
                int[] test = new int[problems];
                for(int i = 0; i<problems; i++){
                    test[i] = Integer.parseInt(br.readLine());
                }
                inputData.add(test);
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
