package stream;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/10/27.
 */
public class Sample2 {

    public static void main(String[] args) {
        Stream<String> echos = Stream.generate(() -> "Echo");

        Stream<Double> randoms = Stream.generate(Math::random);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));

        System.out.println("well done ...");

    }
}
