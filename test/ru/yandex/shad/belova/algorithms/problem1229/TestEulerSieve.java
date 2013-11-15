package ru.yandex.shad.belova.algorithms.problem1229;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

@RunWith(value = Parameterized.class)
public class TestEulerSieve {
	 private long[] eulerArray;
	 private int n;

	 public TestEulerSieve(int n, long[] eulerArray) {
        this.n = n;
	    this.eulerArray = eulerArray;
	 }

	 @Parameters
	 public static Collection<Object[]> data() {
	   List<Object[]> expectedTestData = new LinkedList<Object[]>();
       
       expectedTestData.add(new Object[]{1, new long[] {0,1}});
       expectedTestData.add(new Object[]{2, new long[] {0,1,1}});
       expectedTestData.add(new Object[]{3, new long[] {0,1,1,2}});
       expectedTestData.add(new Object[]{4, new long[] {0,1,1,2,2}});
       expectedTestData.add(new Object[]{5, new long[] {0,1,1,2,2,4}});
       expectedTestData.add(new Object[]{6, new long[] {0,1,1,2,2,4,2}});
       expectedTestData.add(new Object[]{7, new long[] {0,1,1,2,2,4,2,6}});
       expectedTestData.add(new Object[]{8, new long[] {0,1,1,2,2,4,2,6,4}});
       return expectedTestData;
	 }
	 
	 @Test
	 public void testEulerSeiveCorrectness() {
		 //long[] result = EulerUtils.EulerSieve(this.n);
		 //assertArrayEquals("Fail in euler sieving for n = " + this.n, this.eulerArray, result);
	 }
}
