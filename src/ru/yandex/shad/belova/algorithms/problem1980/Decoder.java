package ru.yandex.shad.belova.algorithms.problem1980;

/**
 * Muller's decoder, which decodes tapped radiogram
 *
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */
class Decoder {

    /**
     * Search value using Chinese Remainders Theorem
     *
     * @param radiogram tapped radiogram
     * @return minimal possible value, could be ciphered by Radiogram operators
     */
    private static long chineseRemainders(Radiogram radiogram){
        long n = radiogram.getTotalNotation();
        long x = 0;
        for(Radiogram.Operator operator: radiogram){
            int ni = operator.getNumericalNotation();
            long Ni = n / ni;
            x += Ni * operator.getDecimalSymbol() * inverseMod(Ni, ni);
        }
        return x >= 0 ? x % n : n + x%n;
    }

    /**
     * Calculates a^(-1)mod(n)
     * @param a value needs to be inverted
     * @param n modulo
     * @return inverted value
     */
    private static long inverseMod(long a, long n){
        return extendedEuclidXvalue(a, n);
    }

    /**
     * Calculates parameter x in equality ax+by=nod(a,b) using Euclidean Algorithm
     * @param a first value
     * @param b second value
     * @return parameter x
     */
    private static long extendedEuclidXvalue(long a, long b){
        long u = 0;
        long v = 1;
        long x = 1;
        long y = 0;
        while(b != 0){
            long q = a/b;
            long r = a%b;
            long m = x - u*q;
            long n = y - v*q;
            a = b;
            b = r;
            x = u;
            y = v;
            u = m;
            v = n;
        }
        return x;
    }

    /**
     * Decodes given Radiogram
     *
     * @param radiogram input radiogram
     * @return decoded minimal value of army
     */
    public static long decode(Radiogram radiogram){
        return chineseRemainders(radiogram);
    }
}
