package ru.yandex.shad.belova.algorithms.problem1229;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class TestExtremeGCD {
	 private int n;
     private long exGCD;

	 public TestExtremeGCD(int n, long exGCD) {
        this.n = n;
	    this.exGCD = exGCD;
	 }

	 @Parameters
	 public static Collection<Object[]> data() {
	    List<Object[]> expectedTestData = new LinkedList<Object[]>();

        expectedTestData.add(new Object[]{2, 1});
        expectedTestData.add(new Object[]{3, 3});
        expectedTestData.add(new Object[]{4, 7});
        expectedTestData.add(new Object[]{5, 11});
        expectedTestData.add(new Object[]{6, 20});
        expectedTestData.add(new Object[]{7, 26});
        expectedTestData.add(new Object[]{8, 38});
        expectedTestData.add(new Object[]{10, 67});
        expectedTestData.add(new Object[]{100, 13015});
        expectedTestData.add(new Object[]{200000, 143295493160L});

        return expectedTestData;
	 }
	 
	 @Test
	 public void testExtremeGCDCorrectness() {
		 long result = EulerUtils.ExtremeGCD(this.n);
		 assertEquals("Fail in extreme GCD for n = " + this.n, this.exGCD, result);
	 }
}
