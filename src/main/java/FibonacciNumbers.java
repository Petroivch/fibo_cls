import java.math.BigInteger;

public class FibonacciNumbers {

    public static BigInteger[] calculateTermFibonacciSeries(int serialNumber) {
        BigInteger nFibZero = new BigInteger("0");
        BigInteger nFibOne = new BigInteger("0");
        switch (serialNumber) {
            case 1 -> {
                nFibZero = BigInteger.ZERO;
                nFibOne = BigInteger.ONE;
            }
            case 2 -> {
                nFibZero = BigInteger.ONE;
                nFibOne = BigInteger.TWO;
            }
            default -> {
                BigInteger fib1 = BigInteger.ZERO;
                BigInteger fib2 = BigInteger.ONE;
                for (int i = 0; i < serialNumber - 2; i++) {
                    nFibZero = fib1.add(fib2);
                    fib1 = fib2;
                    fib2 = nFibZero;
                    if (i == serialNumber - 3) {
                        nFibOne = fib1.add(fib2);
                    }
                }
            }
        }
        return new BigInteger[] {nFibZero, nFibOne};
    }
}