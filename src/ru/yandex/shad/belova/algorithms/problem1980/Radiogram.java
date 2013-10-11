package ru.yandex.shad.belova.algorithms.problem1980;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Object which stores radiogram input data
 *
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */
class Radiogram implements Iterable<Radiogram.Operator>{
    /**
     * All {@link Operator} list, which send radiogram
     */
    List<Operator> operators = new LinkedList<Operator>();

    /**
     * Product of all notation systems for all Operators
     */
    long totalNotation = 1;

    /**
     * Add operator to Radiogram
     *
     * @param op operator
     */
    public void addOperator(Operator op){
        operators.add(op);
        totalNotation *= op.getNumericalNotation();
    }

    /**
     * Extract product of all notation systems
     * @return total notation
     */
    public long getTotalNotation(){
        return totalNotation;
    }

    /**
     * Iterator throw Radiogram by operators
     * @return iterator
     */
    @Override
    public Iterator<Radiogram.Operator> iterator() {
        return operators.listIterator();
    }

    /**
     * Class-container with operator data which are sent in Radiogram.
     * <br>
     * Constructor: {@link Operator#Operator(int, char)}
     */
    public static class Operator {
        /**
         * last symbol of number in operator's notation
         */
        private final char lastSymbol;

        /**
         * Decimal value of last symbol in operator's notation
         */
        private final int lastSymbolInt;

        /**
         * Given numerical notation of operator
         */
        private final int numericalNotation;

        /**
         * Convertor of symbol to decimal notation
         * @param symbol in range 0-9 or A-Z
         * @return decimal notation of symbol
         */
        private static final int symbolToDecimal(char symbol){
            if(symbol >= '0' && symbol <='9')  {
                return symbol - 48;
            } else {
                return symbol - 65 + 10;
            }
        }

        /**
         * Constructs object from notation and last symbol.
         * Symbol in decimal notation must be less then provided notation value
         * @param numericalNotation in range 2-36
         * @param lastSymbol in range 0-9 or A-Z
         * @throws RadiogramException if some constraint fails
         */
        public Operator(int numericalNotation, char lastSymbol) throws RadiogramException{
            if(numericalNotation < 2 || numericalNotation > 36){
                throw new RadiogramException("Numerical notation should be in [2;36]");
            }
            String symbolStr = String.valueOf(lastSymbol);
            if(!symbolStr.matches("[A-Z0-9]")){
                throw new RadiogramException("Last symbol should be A-Z or 0-9");
            }
            this.lastSymbolInt = symbolToDecimal(lastSymbol);
            if(this.lastSymbolInt >= numericalNotation){
                throw new RadiogramException("Last symbol should be in numericalNotation");
            }
            this.numericalNotation = numericalNotation;
            this.lastSymbol = lastSymbol;
        }

        public int getDecimalSymbol(){
            return this.lastSymbolInt;
        }

        public int getNumericalNotation(){
            return this.numericalNotation;
        }

        @Override
        public String toString(){
            return "[" + numericalNotation + ", " + this.lastSymbol + "]";
        }
    }

    @Override
    public String toString(){
        return "[" + this.operators + "]";
    }
}
