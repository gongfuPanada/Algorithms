package ru.yandex.shad.belova.algorithms.problem1303;

/**Class represents sorting utils with priority on inversions counting
 *
 * @author Ilariia Belova
 * @version 1.0 Oct 24, 2013
 */
class SortUtil {
	
	// *****************
	// Inversions routines
	// *****************

    /**
     * Calculates inversions inside merge step
     * @param array input array
     * @param leftBound left part start index
     * @param middlePoint separator index
     * @param rightBound right part end index
     * @return number of inversions on merge step
     */
	private static long mergeWithInversions (int[] array, int leftBound, int middlePoint, int rightBound) {

        int leftArrayLength = middlePoint - leftBound + 1;
        int[] leftCopy = new int[leftArrayLength];
		long inversions = 0;
		System.arraycopy(array, leftBound, leftCopy, 0, leftArrayLength);
		
		int leftArrayPosition = 0;
		int rightArrayPosition = middlePoint+1;
		int targetArrayPosition = leftBound;
		
		while ( leftArrayPosition < middlePoint - leftBound + 1 && rightArrayPosition < rightBound + 1){
			if(leftCopy[leftArrayPosition] <= array[rightArrayPosition]) {
				array[targetArrayPosition++] = leftCopy[leftArrayPosition++];
			} else {
				inversions += middlePoint - leftBound + 1 - leftArrayPosition;
				array[targetArrayPosition++] = array[rightArrayPosition++];
			}
		}
		
		while ( leftArrayPosition < middlePoint - leftBound + 1){
			array[targetArrayPosition++] = leftCopy[leftArrayPosition++];
		}
		return inversions;
	}

    /**
     * Recursive calculation of number of inversions
     * @param array input array
     * @param leftBound left index
     * @param rightBound right index
     * @return number of inversions
     */
    private static long getInversions (int[] array, int leftBound, int rightBound) {
        int pivot = (leftBound+rightBound)/2;
        long inversions = 0;
        if(leftBound < rightBound) {
            inversions = inversions + getInversions(array, leftBound, pivot);
            inversions = inversions + getInversions(array, pivot+1, rightBound);
        }
        return inversions + mergeWithInversions(array, leftBound, pivot, rightBound);
    }

    /**
     * Method of calculating inversions number in whole array
     * @param array input array
     * @return number of inversions in a whole array
     */
	public static long getInversions (int[] array) {
		return getInversions(array, 0, array.length - 1);
	}

}
