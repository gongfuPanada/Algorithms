package ru.yandex.shad.belova.algorithms.problem119;

class PowersOfTwoParser {
    public static final double lgOfTwo = Math.log10(2);
    /*
     *  n=2^k
     *  length(n) = |_k*lg(2)_|+1
     */
    public static String parse(String input){
        int totalLength = input.length();
        int accumulativeLengthOfPowersOfTwo = 0;
        int powerOfTwo = 0;
        while(accumulativeLengthOfPowersOfTwo != totalLength){
            powerOfTwo++;
            accumulativeLengthOfPowersOfTwo += Math.floor(powerOfTwo * lgOfTwo) + 1;
        }
        return String.valueOf(powerOfTwo);
    }
}
