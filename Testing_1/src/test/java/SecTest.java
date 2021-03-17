import org.junit.Test;

import static org.junit.Assert.*;

public class SecTest {

    //test on Asymptote lines
    @Test
    public void posOnAsymptoteXLine() {
        System.out.println("\nSec(x) = 1");
        assertEquals((1.0 / Math.cos(0)), Secans.sec(0), Secans.epsilon);
    }

    @Test
    public void negOnAsymptoteXLine() {
        System.out.println("\nSec(x) = -1");
        assertEquals((1.0 / Math.cos(Math.PI)), Secans.sec(Math.PI), Secans.epsilon);
    }

    @Test
    public void onAsymptoteYLine() {
        System.out.println("\nSec(x) = ∞");
        assertEquals((1.0 / Math.cos(Math.PI / 2 + Secans.epsilon)), Secans.sec(Math.PI / 2 + Secans.epsilon), 1 / Secans.epsilon);
    }

    //test on Domain of a function
    @Test
    public void onPosInfinity() {
        System.out.println("\nSec(∞) = NaN");
        assertEquals(Double.NaN, Secans.sec(Double.POSITIVE_INFINITY), Secans.epsilon);
    }

    @Test
    public void onNegInfinity() {
        System.out.println("\nSec(-∞) = NaN");
        assertEquals(Double.NaN, Secans.sec(Double.NEGATIVE_INFINITY), Secans.epsilon);
    }

    //test on Nan
    @Test
    public void onNaN() {
        System.out.println("\nSec(NaN) = NaN");
        assertEquals(Double.NaN, Secans.sec(Double.NaN), Secans.epsilon);
    }

    //test on 3 points on one period
    @Test
    public void onPiDiv3() {
        System.out.println("\nSec(pi/3) = 2");
        assertEquals((1.0 / Math.cos(Math.PI / 3)), Secans.sec(Math.PI / 3), Secans.epsilon);
    }
    @Test
    public void onPiDiv6() {
        System.out.println("\nSec(pi/6) = 1.1547");
        assertEquals((1.0 / Math.cos(Math.PI / 6)), Secans.sec(Math.PI / 6), Secans.epsilon);
    }
    @Test
    public void onMinusPiDiv3() {
        System.out.println("\nSec(-pi/3) = 2");
        assertEquals((1.0 / Math.cos(-Math.PI / 3)), Secans.sec(-Math.PI / 3), Secans.epsilon);
    }
    @Test
    public void onMinusPiDiv6() {
        System.out.println("\nSec(-pi/6) = 1.1547");
        assertEquals((1.0 / Math.cos(-Math.PI / 6)), Secans.sec(-Math.PI / 6), Secans.epsilon);
    }


}