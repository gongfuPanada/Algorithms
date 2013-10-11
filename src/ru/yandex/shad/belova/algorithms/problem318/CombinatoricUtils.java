package ru.yandex.shad.belova.algorithms.problem318;

import java.math.BigInteger;

class CombinatoricUtils {

    public static BigInteger NOD(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)){
            return a.abs();
        }
        return NOD(b,a.mod(b));
    }
    public static BigInteger Cnk(BigInteger n, BigInteger k){
        if(k.compareTo(n.divide(new BigInteger("2"))) == 1){
            k = n.subtract(k);
        }
        BigInteger res = BigInteger.ONE;
        BigInteger i = BigInteger.ONE;
        while(i.compareTo(k)<=0)   {
            BigInteger npart = n.add(BigInteger.ONE).subtract(i);
            BigInteger nod = CombinatoricUtils.NOD(npart,i);
            res = (res.divide(i.divide(nod))).multiply(npart.divide(nod));
            i=i.add(BigInteger.ONE);
        }
        return res;
    }
}
