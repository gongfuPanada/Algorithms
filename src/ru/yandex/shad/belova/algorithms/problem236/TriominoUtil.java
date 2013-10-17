package ru.yandex.shad.belova.algorithms.problem236;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

class TriominoUtil {

    private static HashMap<Integer, Long> f = new HashMap<Integer, Long>();
    private static HashMap<Integer, Long> g = new HashMap<Integer, Long>();
    static{
        f.put(1,0L);
        f.put(2,0L);
        f.put(3,3L);
        f.put(4,0L);
        f.put(5,0L);
        f.put(6,11L);
    }
    public static int count(int n){
        return (int)(f(n) % 1000000);
    }

    private static long f2(int n){
        int k = n/3;
        BigDecimal a = new BigDecimal(2+Math.sqrt(3));
        a = a.pow(k);
        BigDecimal b = new BigDecimal(2-Math.sqrt(3));
        b = b.pow(k);
        BigDecimal c = new BigDecimal(1./Math.sqrt(3));
        BigDecimal res = a.add(b).add(c.multiply(a.subtract(b))).divide(new BigDecimal(2));
       return (long)res.doubleValue();
    }

    private static long f(int n){
        if(n % 3 != 0){
            return 0;
        }
        if(n == 3){
            return 3;
        }
        if(n == 6){
            return 11;
        }
        long fnMinus6 = 3;
        long fnMinus3 = 11;
        long fnCurrent = 0;
        for(long i = 9; i <= n; i+=3){
            long tempfn = fnCurrent;
            fnCurrent = 4 * fnMinus3 - fnMinus6;
            fnMinus6 = fnMinus3;
            fnMinus3 = tempfn;
        }
        return fnCurrent;
    }

}
