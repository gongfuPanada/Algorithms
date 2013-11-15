package ru.yandex.shad.belova.algorithms.problem1303;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Ultra-Fast-Sorting
 * http://www.e-olimp.com/problems/1303
 *
 * @author Ilariia Belova
 * @version 1.0 Oct 24, 2013
 */
public class Main {

    private static class DataCursor {
        BufferedReader br = null;

        public DataCursor(InputStream stream) throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private void ensureOpen() throws IOException{
            if(br == null){
                throw new IOException("Stream is closed");
            }
        }

        public int[] readNextArray() throws IOException{
            ensureOpen();
            int problems = 0;
            try {
                if((problems = Integer.parseInt(this.br.readLine())) != 0){
                    int[] test = new int[problems];
                    for(int i = 0; i<problems; i++){
                        test[i] = Integer.parseInt(br.readLine());
                    }
                    return test;
                }
            } catch (NumberFormatException e){
                throw new IOException("Wrong input format");
            }
            return new int[]{};
        }

        public void close() throws IOException{
            if(br != null){
                br.close();
            }
            br = null;
        }
    }

    public static void main(String... args){
        PrintWriter out = new PrintWriter(System.out);
        DataCursor cursor = null;
        try {
            cursor = new DataCursor(System.in);
            int[] array = cursor.readNextArray();
            while(array.length > 0){
                long inversions = SortUtil.getInversions(array);
                out.println(String.valueOf(inversions));
                array = cursor.readNextArray();
            }
            out.flush();
        } catch (IOException e) {
            System.err.println("Bad data input");
        } finally {
            if(cursor != null){
                try{
                    cursor.close();
                    out.close();
                } catch (IOException ioe){
                    System.err.println("Close is failed");
                }
            }
        }
    }
}
