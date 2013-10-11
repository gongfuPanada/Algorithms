package ru.yandex.shad.belova.algorithms.problem390;

import java.util.HashMap;

class Anagrammer {
    private static long factorial(int n){
        long factorial = 1;
        for (int i=1; i <= n; i++){
            factorial*=i;
        }
        return factorial;
    }
    public static long calculate(String word){
        class MutableInteger{
            private int i = 1;
            public void increment(){
                i++;
            }
            public int value(){
                return i;
            }
        }
        HashMap<Character, MutableInteger> map = new HashMap<Character,MutableInteger>();
        for(char c: word.toCharArray()){
            if(map.containsKey(c)){
                map.get(c).increment();
            } else {
                map.put(c,new MutableInteger());
            }
        }
        long result = factorial(word.length());
        for(Character c: map.keySet()){
            result/=factorial(map.get(c).value());
        }
       return result;
    }
}
