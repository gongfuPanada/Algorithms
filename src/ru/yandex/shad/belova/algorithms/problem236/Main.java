package ru.yandex.shad.belova.algorithms.problem236;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * http://www.e-olimp.com/problems/236
 */
public class Main {
    public static long[] farray = new long[3333333];
    public static int nextUncalculated = 6;
    static{
        Arrays.fill(farray, -1);
    }

    public static int count(int n){
        return (int)f4(n);
    }

    public static double powerByModule(double base, int exponent, int modulus){
        double res = 1;
        while(exponent > 0){
            if(exponent % 2 == 1){
                res = (res*base) % modulus;
            }
            exponent = exponent / 2;
            base = (base*base) % modulus;
        }
        return res;
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
//            long v = ((4 * fnMinus3)%1000 - fnMinus6)%1000;
//            fnCurrent = v < 0 ? 1000 + v : v;
            fnCurrent = ((4 * fnMinus3) - fnMinus6);
            fnMinus6 = fnMinus3;
            fnMinus3 = fnCurrent;
        }
        return fnCurrent;
    }
    // 1 45
    // 299303201

    private static int f2(int n){
        if(n % 3 != 0) return 0;
        int k = n/3;

        double a = (2+Math.sqrt(3))/Math.pow(2,1./k);
        double amod = powerByModule(a,k,1000000);
        double amod2 = powerByModule(a / Math.pow(3,1./(2*k)),k,1000000);

        double b = (2-Math.sqrt(3))/Math.pow(2,1./k);
        double bmod = powerByModule(b,k,1000000);
        double bmod2 = powerByModule(b / Math.pow(3,1./(2*k)),k,1000000);

        double cdifference = (amod2-bmod2)%1000000;
        double res = (((amod + bmod)%1000000 + cdifference)) %1000000 ;
        return (int)Math.round(res);
    }
    //  1
    //999
      //      502841
    private static long f3(int n){
        int k = n/3;
        BigDecimal a = new BigDecimal(2+Math.sqrt(3));
        a = a.pow(k);
        BigDecimal amod = a.multiply(new BigDecimal(1/(2*Math.sqrt(3))));
        BigDecimal b = new BigDecimal(2-Math.sqrt(3));
        b = b.pow(k);
        BigDecimal c = new BigDecimal(1./Math.sqrt(3));
        BigDecimal res = a.add(b).add(c.multiply(a.subtract(b))).divide(new BigDecimal(2)).remainder(new BigDecimal(1000000));
        return Math.round(res.doubleValue());
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
        long[][] mat = new long[2][2];
        mat[0][0] = 0;
        mat[1][0] = 1;
        mat[0][1] = -1;
        mat[1][1] = 4;

        mat = power(mat, k-2);
//        for(int i = k-2; i > 0; i--){
//            res = multiply(res,mat);
//        }
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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testsNumber = scanner.nextInt();

        while(testsNumber > 0){
            int counts = count(scanner.nextInt());
            System.out.println(counts);
            testsNumber--;
        }
    }
}
