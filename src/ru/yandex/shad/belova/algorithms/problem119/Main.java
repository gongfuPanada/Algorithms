package ru.yandex.shad.belova.algorithms.problem119;
/*
 * Степень двойки
 * 
 * В строке последовательно записаны n степеней двойки, то есть числа от 2 до 2n без пробелов. Найдите значение n.
 *
 *
 * Технические условия
 * Входные данные
 *      В одной строке без пробелов записаны n (1 ≤ n ≤ 1000) последовательных степеней двойки.
 * Выходные данные
 *     Вывести значение n.
 */

public class Main {
    public static void main(String[] args){
        String input = InputOutputStringHandler.read();
        InputOutputStringHandler.write(PowersOfTwoParser.parse(input));
    }
}
