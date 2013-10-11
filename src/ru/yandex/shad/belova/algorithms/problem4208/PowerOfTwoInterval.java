package ru.yandex.shad.belova.algorithms.problem4208;

class PowerOfTwoInterval {
    private int startInterval;
    private int endInterval;
    public PowerOfTwoInterval(int startInterval, int endInterval){
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }
    private static int lenghtOfNumberPowerOfTwo(int n){
        return (int)Math.floor(n*Math.log10(2)) + 1;
    }
    
    public int getAmountOfNumbersWithFirstDigitOne(){
        // [1;2^endInterval]
        // 1,16,128,1024
        int fromOneToEndInterval = lenghtOfNumberPowerOfTwo(this.endInterval);
        if( this.startInterval == 0){
            return fromOneToEndInterval;
        } else {
            // [1;2^(startInterval-1)]
            int fromOneToStartIntervalMinusOne = lenghtOfNumberPowerOfTwo(this.startInterval-1);
            return fromOneToEndInterval - fromOneToStartIntervalMinusOne;
        }
    } 
}
