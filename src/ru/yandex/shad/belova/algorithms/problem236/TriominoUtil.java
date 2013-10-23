package ru.yandex.shad.belova.algorithms.problem236;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

class TriominoUtil {

    public static int count(int n){
        return (int)f4(n);
    }

    /**
     * If n%3 != 0 f(n) = 0
     *
     * f(n)=2g(n-1)+f(n-3)
     * g(n)=f(n-2)+g(n-3)
     *
     * f(n)=4f(n-3)-f(n-6)
     *
     * Q = {{0, -1}, {1, 4}}
     *
     * {f(n-6),f(n-3)}*Q={f(n-3),f(n)}
     *
     * {f(3),f(6)}*Q={f(6),f(9)}
     *
     * {f(3),f(6)}*Q^(n/3-2)={f(n-3),f(n)}
     */
    private static long f4(int n){
        if(n % 3 != 0) {
            return 0;
        }
        if(n == 3){
            return 3;
        }
        if(n == 6){
            return 11;
        }
        int k = n/3;
        long[][] mat = {{0,-1},{1,4}};

        mat = power(mat, k-2);

        return multiply(3,11,mat);
    }

    private static long[][] multiply(long[][] a, long[][] b){
        long[][] res = {{0,0},{0,0}};
        for (int i=0; i<2; ++i)
            for (int j=0; j<2; ++j){
                for (int k=0; k<2; ++k){
                    long mul = (a[i][k] * b[k][j])% 1000000;
                    if(mul < 0){
                        mul = 1000000 + mul;
                    }
                    res[i][j] = (res[i][j] + mul) % 1000000;
                }
            }
        return res;
    }

    private static long[][] power(long[][]x, int n){
        if(n == 1){
            return x;
        }
        if(n % 2 == 0){
            x = power(x, n/2);
            return multiply(x,x);
        } else {
            long[][] a = power(x, (n-1)/2);
            return multiply(multiply(a,a),x);
        }
    }
    private static int multiply(int a, int b, long[][] mat){
        return (int)(((a*mat[0][1]) % 1000000)+((b*mat[1][1]) % 1000000)) % 1000000;
    }

}
