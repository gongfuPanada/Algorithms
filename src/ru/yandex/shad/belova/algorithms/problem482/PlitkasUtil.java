package ru.yandex.shad.belova.algorithms.problem482;

import java.util.HashMap;

class PlitkasUtil {

    private static HashMap<Integer, Long> f = new HashMap<Integer, Long>();
    private static HashMap<Integer, Long> g = new HashMap<Integer, Long>();
    static {
        f.put(0, 1L);
        f.put(1, 0L);
        g.put(0, 0L);
        g.put(1, 1L);
    }
    public static long count(int n){
        return f(n);
    }

    private static long g(int n){
        if(g.containsKey(n)){
            return g.get(n);
        }
        g.put(n, f(n-1)+g(n-2));
        return g.get(n);
    }

    private static long f(int n){
        if(f.containsKey(n)){
            return f.get(n);
        }
        f.put(n, 2*g(n-1)+f(n-2));
        return f.get(n);
    }

}
