package ru.yandex.shad.belova.algorithms.problem1513;

/**Class represents binary tree by it's walks
 * Binary tree could be unambiguously represented by two walks
 * Now it takes pre-order walk and symmetric walk for initialization
 * 
 * @author Ilariia Belova
 * @version 1.0 Sep 19, 2013
 */
class BinaryTree {
    
    /** Pre-order walk representation 
     * <br>
     *  Root -> Left subtree -> Right subtree
     */
    private char[] direct;
    
    /** Symmetric walk representation
     * <br> 
     * Left subtree -> Root -> Right subtree
     */
    private char[] center;
    
    /** Post-order walk representation
     * <br>
     * Left subtree -> Right subtree -> Root
     */
    private char[] reverse;
    
    /** Counter for reverse() method */
    private int directIndex;
    
    /** Counter for reverse() method */
    private int reverseIndex;
    
    /** Additional structure for reverse() method */
    private byte[] centerCharacters;
    
    
    /**Constructs BinaryTree using pre-order and symmetric walks.
     * <p>
     * Params need to be the same length with the same characters in.
     * 
     * @param direct      pre-order walk string representation, with A-Za-z characters in
     * @param center      symmetric walk string representation, with A-Za-z characters in 
     */
    public BinaryTree(String direct, String center){
        this.direct = direct.toCharArray();
        this.center = center.toCharArray();
        this.reverse = new char[this.direct.length];
        this.directIndex = 0;
        this.reverseIndex = 0;
        this.centerCharacters = new byte[58];
        for(byte i = 0; i < this.center.length; i++){
            this.centerCharacters[(int)this.center[i]-65] = i;
        }
    }
    
    /** Calculate and return post-order walk for this binary tree
     *  <p>
     *  If this walk just have been calculated in previous calls, only returns this walk
     * 
     * @return string representation of post-order walk
     */
    public String getReverseOrder(){
        if (this.reverseIndex != this.reverse.length){
            reverse(0, this.center.length);
        }
        return new String(this.reverse);
    }
    
    /** Recursive method for post-order walk calculation
     * 
     * @param startIndex    represents left margin for subtree
     * @param endIndex      represents right margin for subtree
     */
    private void reverse(int startIndex, int endIndex){
        if(startIndex == endIndex){
            return;
        }
        char root = this.direct[this.directIndex++];
        int rootIndexInCenter = this.centerCharacters[(int)root-65];
        reverse(startIndex, rootIndexInCenter);
        reverse(rootIndexInCenter+1, endIndex);
        this.reverse[this.reverseIndex++] = root;
    }
    
}
