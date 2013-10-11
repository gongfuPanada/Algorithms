package ru.yandex.shad.belova.algorithms.problem1209;

class Calculator{
    public static final double lnOfTwo = Math.log(2);
    public static final double onePlusTwoLnOfTwo = 1 + 2*lnOfTwo;
    
    // f(n) = e ^ ( ln (n-2)! - 2ln(n-2)!! )
    public static double calculate(int n){
        double logOfResult = 0;
        int counter = 0;
        for (int i = n-2; i >= 1; i--){
            logOfResult += Math.log(i) * ((counter++)%2 == 0 ? -1 : 1);   
        }
        double result = Math.exp(logOfResult);
        return result;
    }
}
