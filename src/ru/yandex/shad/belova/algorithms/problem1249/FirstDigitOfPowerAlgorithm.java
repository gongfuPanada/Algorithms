package ru.yandex.shad.belova.algorithms.problem1249;

class FirstDigitOfPowerAlgorithm {
    /**
     * Calculates first digit of n^n
     * @param n
     * @return first digit
     */
    private FirstDigitOfPowerAlgorithm() {}
    public static int getDigit(int n){
        double power = n*Math.log10(n);
        double log10FirstDigit = power - Math.floor(power);
        int firstDigit = (int)Math.floor(Math.pow(10, log10FirstDigit));
        return firstDigit;
    }
}

