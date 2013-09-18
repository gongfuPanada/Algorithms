package ru.yandex.shad.belova.algorithms.problem1;

class Parser {
    public static String parse(String input){
        if(input == "" || input.length() != 2){
            return "";
        }
        char[] inputAsCharArray = input.toCharArray();
        return inputAsCharArray[0] + " " + inputAsCharArray[1];
    }
}
