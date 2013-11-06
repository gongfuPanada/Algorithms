package ru.yandex.shad.belova.algorithms.problem1229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * http://www.e-olimp.com/problems/1229
 * 
 * @author Ilariia Belova
 * @version 1.0 Nov 5, 2013
 */

public class Main {
    private int[] phi = new int[4000001];
    private long[] exGCD = new long[4000001];

    public void eulerSieve(){
        phi[0] = 0;
        phi[1] = 1;

        for(int i = 2; i < phi.length; i++){
            phi[i] = i - 1;
        }

        for (int i = 2; i < phi.length; i++){
            if(phi[i] == i - 1){
                for(int j = 2 * i; j < phi.length; j += i){
                    phi[j] -= phi[j]/i;
                }
            }
        }
    }

    /**
     * Calculates g = sum_(i= 1 : n-1) sum_(j= i+1 : n) GCD(i,j)
     *
     * @return value of this sum
     * @throws IllegalArgumentException if n < 2
     */
    public void extremeGCD(){
        int v = 4000000;
        for(int i = 1 ; i <= (int)Math.floor(Math.sqrt(v)); i++){
            for(int j = i * i, k = i; j < v + 1; j += i, k++){
                if(i == k || i == 1){
                    exGCD[j] = exGCD[j] + i * phi[k];
                } else {
                    exGCD[j] = exGCD[j] + i * phi[k] + k * phi[i];
                }
            }
        }
        for (int i = 2; i < exGCD.length - 1 ; i++){
            exGCD[i+1] += exGCD[i];
        }
    }

    public long getExGCD(int n){
        return exGCD[n];
    }

    public static void main(String[] args){
        BufferedReader br = null;
        Main m = new Main();
        m.eulerSieve();
        m.extremeGCD();

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int inputValue = 0;
            while((inputValue = Integer.parseInt(br.readLine())) != 0){
                System.out.println(m.getExGCD(inputValue)) ;
            }
        } catch(IOException e){
        } finally {
            if(br != null){
                try {
                br.close();
                } catch (IOException e){

                }
            }
        }
    }
}
