import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        BigInteger number = in.nextBigInteger();
        BigInteger res = calculateFactorial(number);
        System.out.println(res);
        in.close();
    }
    public static BigInteger calculateFactorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
       return result;
    }
}


