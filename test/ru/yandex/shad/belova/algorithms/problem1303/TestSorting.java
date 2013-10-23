package ru.yandex.shad.belova.algorithms.problem1303;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class TestSorting {
	 private int[] given;
	 private int inversions;
	 
	 public TestSorting(int[] given, int inversions) {
	    this.given = given;
	    this.inversions = inversions;
	 }

	 @Parameters
	 public static Collection<Object[]> data() {
	   List<Object[]> expectedTestData = new LinkedList<Object[]>();
       
       expectedTestData.add(new Object[]{new int[] {1,2,4,3}, 1});
       expectedTestData.add(new Object[]{new int[] {3,4,1,2}, 4});
       expectedTestData.add(new Object[]{new int[] {4,3,2,1}, 6});
       expectedTestData.add(new Object[]{new int[] {1,2,3,4,5,6}, 0});
       expectedTestData.add(new Object[]{new int[] {2,2,5,4,5,6}, 1});
       expectedTestData.add(new Object[]{new int[] {-1,13,-8,4,5,183}, 4});
       expectedTestData.add(new Object[]{new int[] {-1,-2,-3,-4,-5,-6}, 15});
       expectedTestData.add(new Object[]{new int[] {1,1,0,0,1,1}, 4});
       expectedTestData.add(new Object[]{new int[] {3,4,6,1,2,5}, 7});
       return expectedTestData;
	 }

	 
	 @Test
	 public void testMergeSortWithInversions() {
		 int[] sorted = this.given.clone();
		 long result = SortUtil.getInversions(sorted);
		 assertEquals("Fail in inversions " + Arrays.toString(this.given), this.inversions, result);
	 }
}
