package ru.yandex.shad.belova.algorithms.problem137;

class CombinatoricUtils {

    public static int NOD(int a, int b){
        if(b == 0){
            return Math.abs(a);
        }
        return NOD(b,a%b);
    }

    public static int NOD2(int a, int b){

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return  Math.abs(a);
    }

    public static int NODn(int[] numbers){
        int nod = numbers[0];
        for(int number: numbers){
            nod = NOD2(nod,number);
        }
        return nod;
    }
}
