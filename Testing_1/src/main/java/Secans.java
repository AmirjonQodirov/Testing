import java.math.BigInteger;

public class Secans {
        public static final double epsilon = 1E-6;

        private static BigInteger factorial(int n)
        {
            BigInteger res = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++){
                res = res.multiply(BigInteger.valueOf(i));
            }
            return res;
        }

        public static double sec(double x) {
            double current;
            double prev;
            double numerator = 1.0;
            int n = 1;
            do {
                prev = 1 / numerator;
                numerator += (Math.pow(-1, n) * Math.pow(x, 2 * n)) / Double.parseDouble(factorial(2 * n).toString());
                current = 1 / numerator;
                n++;
            } while (Math.abs(current - prev) >= epsilon);
            System.out.println("sec("+x+") = "+ current);
            return current;
        }

}
