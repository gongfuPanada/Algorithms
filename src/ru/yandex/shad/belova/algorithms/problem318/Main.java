package ru.yandex.shad.belova.algorithms.problem318;


import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        try {
            List<String> input = EOlimpListOfStringDAO.read();
            List<String> output = new LinkedList<String>();

            for(String test: input){
                String[] numbers = test.split(" ");
                BigInteger n = new BigInteger(numbers[0]);
                BigInteger k = new BigInteger(numbers[1]);
                output.add(CombinatoricUtils.Cnk(n,k).toString());
            }
            EOlimpListOfStringDAO.write(output);
        } catch (IOException e) {
            System.err.println("Problems with I/O");
        }
    }
}

//1
//18446744073709551615 18446744073709551614
