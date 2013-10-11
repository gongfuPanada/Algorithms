package ru.yandex.shad.belova.algorithms.problem694;

/*
 * http://www.e-olimp.com/problems/694
 */

public class Main {

    public static void main(String[] args){
        String input = InputOutputStringHandler.read();
        String[] numbers = input.split(" ");
        GeneratorPseudoRandom g = new GeneratorPseudoRandom(Integer.parseInt(numbers[1]),
                                                            Integer.parseInt(numbers[2]),
                                                            Integer.parseInt(numbers[3]),
                                                            Integer.parseInt(numbers[4]));
        QueueMin stack = new QueueMin();
        for(int n = Integer.parseInt(numbers[0]); n > 0; n--){
            long value = g.generate();
            if(value%5 < 2){
                stack.poll();
            } else {
                stack.offer(value);
            }
        }
        InputOutputStringHandler.write(String.valueOf(stack.getTotalMin()));
    }
}
