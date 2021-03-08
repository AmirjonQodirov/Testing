import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.*;

public class SecTest {
    @Test
    public void onMiniMaxPoint() {
        System.out.println("\nSec(x) = 1");
        assertEquals((1.0 / Math.cos(0)), Secans.sec(0), Secans.epsilon);
    }

    @Test
    public void onPosInfinity(){
        System.out.println("\nSec(∞) = NaN");
        assertEquals(Double.NaN, Secans.sec(Double.POSITIVE_INFINITY), Secans.epsilon);
    }

    @Test
    public void onNegInfinity(){
        System.out.println("\nSec(-∞) = NaN");
        assertEquals(Double.NaN, Secans.sec(Double.NEGATIVE_INFINITY), Secans.epsilon);
    }

    @Test
    public void onNaN() {
        System.out.println("\nSec(NaN) = NaN");
        assertEquals(Double.NaN, Secans.sec(Double.NaN), Secans.epsilon);
    }

    @Test
    public void onAsymptoteLine() {
        System.out.println("\nSec(x) = ∞");
        assertEquals((1.0 / Math.cos(Math.PI / 2 + Secans.epsilon)), Secans.sec(Math.PI / 2 + Secans.epsilon), 1/Secans.epsilon);
    }

    @Test
    public void onDefaultPoints() {
        System.out.println("\nDefault 5 points:");
        Random rd = new Random();
        double low = -Math.PI/3;
        double high = Math.PI/3;
        for (int i = 0; i < 5; i++) {
            double x = low + (high - low) * rd.nextDouble();
            assertEquals((1.0 / Math.cos(x)), Secans.sec(x), Secans.epsilon);
        }
    }


}