import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SecTest {
    @Test
    public void onMiniMaxPoint() {
        System.out.println("\nSec(x) = +- 1");
        double x1 = Math.PI;
        double x2 = -Math.PI;
        double x3 = 0;
        Assert.assertEquals((1.0 / Math.cos(x1)), Secans.sec(x1), Secans.epsilon);
        Assert.assertEquals((1.0 / Math.cos(x2)), Secans.sec(x2), Secans.epsilon);
        Assert.assertEquals((1.0 / Math.cos(x3)), Secans.sec(x3), Secans.epsilon);
    }

    @Test
    public void onNoRationalPoint() {
        System.out.println("\nSec(x) = +- 2");
        double x1 = Math.PI / 3;
        double x2 = -4 * Math.PI / 3;
        Assert.assertEquals((1.0 / Math.cos(x1)), Secans.sec(x1), Secans.epsilon);
        Assert.assertEquals((1.0 / Math.cos(x2)), Secans.sec(x2), Secans.epsilon);
    }

    @Test
    public void onAsymptoteLine() {
        System.out.println("\nSec(x) = ∞");
        double x1 = Math.PI / 2;
        double x2 = -Math.PI / 2;
        Assert.assertEquals((1.0 / Math.cos(x1)), Secans.sec(x1), Double.MAX_VALUE);
        Assert.assertEquals((1.0 / Math.cos(x2)), Secans.sec(x2), Double.MAX_VALUE);
    }

    @Test
    public void onDefaultPoint() {
        System.out.println("\nDefault 20 points:");
        Random rd = new Random();
        double low = -Math.PI/3;
        double high = Math.PI/3;
        for (int i = 0; i < 20; i++) {
            double x = low + (high - low) * rd.nextDouble();
            Assert.assertEquals((1.0 / Math.cos(x)), Secans.sec(x), Secans.epsilon);
        }
    }


}