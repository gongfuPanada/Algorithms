package ru.yandex.shad.belova.algorithms.problem1229;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created with IntelliJ IDEA.
 * User: ilariyabelova
 * Date: 11/5/13
 * Time: 1:09 AM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(JUnit4.class)
public class TestEulerUtils {

    @Rule
    public ExpectedException e = ExpectedException.none();

    @Test
    public void testEulerSieveZeroArgument(){
        e.expect(IllegalArgumentException.class);
        EulerUtils.EulerSieve(0);
    }

    @Test
    public void testEulerSieveNegativeArgument(){
        e.expect(IllegalArgumentException.class);
        EulerUtils.EulerSieve(-1);
    }

    @Test
    public void testExtremeGCDNegativeArgument(){
        e.expect(IllegalArgumentException.class);
        EulerUtils.ExtremeGCD(-1);
    }

    @Test
    public void testExtremeGCDZeroArgument(){
        e.expect(IllegalArgumentException.class);
        EulerUtils.ExtremeGCD(0);
    }

    @Test
    public void testExtremeGCDOneArgument(){
        e.expect(IllegalArgumentException.class);
        EulerUtils.ExtremeGCD(1);
    }
}
