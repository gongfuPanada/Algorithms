package ru.yandex.shad.belova.algorithms.problem693;

class GeneratorPseudoRandom {
    int a;
    int b;
    int c;
    long value;

    public GeneratorPseudoRandom(int a, int b, int c, int x0){
        this.a = a;
        this.b = b;
        this.c = c;
        this.value = x0;
    }

    public long generate(){
        value = (((a * (long)Math.pow(value, 2) + b * value + c)/100L) % 1000000L);
        return value;
    }
}