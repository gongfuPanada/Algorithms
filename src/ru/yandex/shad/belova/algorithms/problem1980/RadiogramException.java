package ru.yandex.shad.belova.algorithms.problem1980;

/**
 * Radiogram Exception class
 * <br>
 *     Exception throws if some radiogram constrains fail
 * </br>
 *
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */
class RadiogramException extends IllegalArgumentException{
    public RadiogramException(String message){
        super(message);
    }
}
