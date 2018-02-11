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

        Object[] powers = Stream.iterate(1.0, p -> p * 2).peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();

        System.out.println("well done ...");

    }
}
