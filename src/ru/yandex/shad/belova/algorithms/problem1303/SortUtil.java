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
     * @param a input array
     * @param l left part start index
     * @param point separator index
     * @param r right part end index
     * @return number of inversions on merge step
     */
	private static long mergeWithInversions (int[] a, int l, int point, int r) {
		int[] leftCopy = new int[point - l + 1];
		long inversions = 0;
		System.arraycopy(a, l, leftCopy, 0, point-l+1);
		
		int i = 0;
		int j = point+1;
		int k = l;
		
		while ( i < point - l + 1 && j < r + 1){
			if(leftCopy[i] <= a[j]) {
				a[k++] = leftCopy[i++];
			} else {
				inversions += point - l + 1 - i;
				a[k++] = a[j++];
			}
		}
		
		while ( i < point - l + 1){
			a[k++] = leftCopy[i++];
		}
		return inversions;
	}

    /**
     * Recursive calculation of number of inversions
     * @param a input array
     * @param l left index
     * @param r right index
     * @return number of inversions
     */
    private static long getInversions (int[] a, int l, int r) {
        int point = (l+r)/2;
        long inversions = 0;
        if(l < r) {
            inversions = inversions + getInversions(a, l, point);
            inversions = inversions + getInversions(a, point+1, r);
        }
        return inversions + mergeWithInversions(a, l, point, r);
    }

    /**
     * Method of calculating inversions number in whole array
     * @param a input array
     * @return number of inversions in a whole array
     */
	public static long getInversions (int[] a) {
		return getInversions(a, 0, a.length - 1);
	}

}
