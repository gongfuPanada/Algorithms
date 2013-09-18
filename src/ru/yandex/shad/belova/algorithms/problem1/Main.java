package ru.yandex.shad.belova.algorithms.problem1;
/*
 * Простая задача?
 * 
 * Программа считывает двузначное число и выводит через пробел каждую цифру отдельно.
 *
 * Технические условия
 * Входные данные
 *      Натуральное число из промежутка от 10 до 99 включительно.
 * Выходные данные
 *     Два одноцифровых числа, разделенных пробелом

 */

public class Main {
    public static void main(String[] args){
        String input = InputOutputStringHandler.read();
        InputOutputStringHandler.write(Parser.parse(input));
    }
}
