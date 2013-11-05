package ru.yandex.shad.belova.algorithms.problem1229;

/**
 * Class for input/output e-olimp data processing
 *
 * Util class for computing everything associated with Euler function
 *
 * @author Ilariia Belova
 * @version 1.0 Nov 5, 2013
 */
class EulerUtils {

    private EulerUtils(){}

    /**
     * Calculates all value of Euler function in range (1, n)
     *
     * @param n upper bound
     * @return array with length = n filled by phi(n)
     * @throws IllegalArgumentException if n <= 0
     */
    public static long[] EulerSieve(int n){
        if (n <= 0)
            throw new IllegalArgumentException("Negative integers are not allowed");

        long[] phi = new long[n+1];

        phi[0] = 0;
        phi[1] = 1;

        for(int i = 2; i < n + 1; i++){
            phi[i] = i - 1;
        }

        for (int i = 2; i < n + 1; i++){
            if(phi[i] == i - 1){
                for(int j = 2 * i; j < n + 1; j += i){
                    phi[j] -= phi[j]/i;
                }
            }
        }
        return phi;
    }

    /**
     * Calculates g = sum_(i= 1 : n-1) sum_(j= i+1 : n) GCD(i,j)
     *
     * @param n
     * @return value of this sum
     * @throws IllegalArgumentException if n < 2
     */
    public static long ExtremeGCD(int n){
        if(n < 2)
            throw new IllegalArgumentException("n must be equals or greater than 2");
        long g = 0;
        long[] phi = EulerSieve(n);
        for(int i = (int)Math.floor(Math.sqrt(n)) ; i >= 1; i--){
            for(int j = i * i, k = i; j < n + 1; j += i, k++){
                if (i == 1 || i == k){
                    g = g + i * phi[k];
                } else {
                        g = g + i * phi[k] + k * phi[i];
                }
            }
        }
        g = g - 1;
        return g;
    }
}
