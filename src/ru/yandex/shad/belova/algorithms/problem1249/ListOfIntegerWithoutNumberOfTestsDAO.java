package ru.yandex.shad.belova.algorithms.problem1249;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/** Data Access Object for our standard input/output from e-olimp
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 20, 2013
 */
class ListOfIntegerWithoutNumberOfTestsDAO {
    private ListOfIntegerWithoutNumberOfTestsDAO(){}
    
    public static LinkedList<Integer> read() throws IOException{
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> inputData = new LinkedList<Integer>();
        while (scanner.hasNextInt()){
            inputData.addLast(scanner.nextInt());
        }
        return inputData;
    }
    
    public static void write(LinkedList<Integer> outputData){
        PrintWriter out = new PrintWriter(System.out);
        for(Integer number: outputData){
            out.println(number);
        }
        out.flush();
    }
}
