import Utils.Fixture;

import java.math.BigInteger;

import static java.math.BigInteger.TEN;

/**
 * Created by Saiteja on 2020-05-02
 */
public class KaratsubaMultiplication extends Fixture {


  public static void main(String[] args) {
    System.out.println("Enter two integers");
    BigInteger first = scanner.nextBigInteger();
    BigInteger second = scanner.nextBigInteger();
    System.out.println("Value: " + multiply(first, second));
  }

  private static BigInteger multiply(BigInteger i, BigInteger j) {
    if (i.compareTo(TEN) < 0 || j.compareTo(TEN) < 0)
      return i.multiply(j);
    String length = getLength(i.max(j));
    BigInteger n = new BigInteger(length);
    BigInteger bigIntegerTwo = new BigInteger("2");
    if (n.mod(bigIntegerTwo).equals(new BigInteger("1")))
      n = n.add(new BigInteger("1"));
    BigInteger divideNByTwo = TEN.pow(n.divide(bigIntegerTwo).intValue());
    BigInteger a = i.divide(divideNByTwo);
    BigInteger b = i.mod(divideNByTwo);
    BigInteger c = j.divide(divideNByTwo);
    BigInteger d = j.mod(divideNByTwo);

    BigInteger first = multiply(a, c);
    BigInteger second = multiply(b, d);
    BigInteger third = multiply(a.add(b), c.add(d));

    return ((first.multiply(TEN.pow(n.intValue()))).add((((third.subtract(first)).subtract(second))).multiply(divideNByTwo)).add(second));

  }

  public static String getLength(BigInteger a) {
    String b = a.toString();
    return Integer.toString(b.length());
  }

}
