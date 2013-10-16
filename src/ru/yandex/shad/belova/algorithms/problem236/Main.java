package ru.yandex.shad.belova.algorithms.problem236;

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://www.e-olimp.com/problems/236
 */
public class Main {
    public static long[] farray = new long[3333333];
    public static int nextUncalculated = 6;
    static{
        Arrays.fill(farray, -1);
    }

    public static int count(int n){
        return f2(n);
    }

    public static double powerByModule(double base, int exponent, int modulus){
        double res = 1;
        while(exponent > 0){
            if(exponent % 2 == 1){
                res = (res*base) % modulus;
            }
            exponent = exponent / 2;
            base = (base*base) % modulus;
        }
        return res;
    }

    private static int f2(int n){
        if(n % 3 != 0) return 0;
        int k = n/3;
        double a = 2+Math.sqrt(3);
        double amod = powerByModule(a,k,1000000);
        //a = Math.pow(a,k);
        double b = 2-Math.sqrt(3);
        double bmod = powerByModule(b,k,1000000);
        //b = Math.pow(b,k);
        double c = 1./Math.sqrt(3);
        double res = ((amod + bmod + c*(amod-bmod))/2)%1000000;
        System.out.println(res);
        return (int)res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testsNumber = scanner.nextInt();

        while(testsNumber > 0){
            int counts = count(scanner.nextInt());
            System.out.println(counts);
            testsNumber--;
        }
    }
}
