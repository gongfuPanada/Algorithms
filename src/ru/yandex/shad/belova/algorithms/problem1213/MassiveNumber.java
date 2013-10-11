package ru.yandex.shad.belova.algorithms.problem1213;

class MassiveNumber implements Comparable<MassiveNumber>{
    public final int base;
    public final int power;
    
    public MassiveNumber(int base, int power){
        this.base = base;
        this.power = power;
    }

    @Override
    public int compareTo(MassiveNumber B) {
        double logA = this.power * Math.log(this.base);
        double logB = B.power * Math.log(B.base);
        return logA < logB ? -1 : logA == logB ? 0 : 1;
    }
    
    @Override
    public String toString(){
        return this.base + "^" + this.power;
    }
}
