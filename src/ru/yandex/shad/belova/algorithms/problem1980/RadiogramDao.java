package ru.yandex.shad.belova.algorithms.problem1980;

import java.io.IOException;
import java.util.Scanner;

/**
 * Data Access Object which converts our input in Radiogram model object
 *
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */
class RadiogramDao {
    /**
     * Reads data in specific format from System.in
     *
     * Format:
     *
     * First line - integer number n
     * Second line - n numbers ai
     * Third line - n characters ci which are in 0-9 and A-Z ranges
     *
     * @return radiogram
     * @throws IOException if there are some problems in constructing Radiogram from input
     */
    public static Radiogram read() throws IOException{
        Radiogram radiogram = new Radiogram();
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if(n != 0) {
                String[] numericalNotations = scanner.nextLine().split(" ");
                String[] lastSymbols = scanner.nextLine().split(" ");
                for(int i = 0; i< numericalNotations.length; i++){
                    if(lastSymbols[i].length() != 1)
                        throw new IOException("Wrong input format");
                    radiogram.addOperator(new Radiogram.Operator(Integer.parseInt(numericalNotations[i]),lastSymbols[i].charAt(0)));
                }
            }
        } catch (NumberFormatException nfe){
            throw new IOException("Wrong input format");
        } catch (RadiogramException re){
            throw new IOException("Bad radiogram data input");
        }
        finally {
            scanner.close();
        }
        return radiogram;
    }
}
