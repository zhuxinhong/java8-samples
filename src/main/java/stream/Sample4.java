package stream;

import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/20.
 */
public class Sample4 {

    public static void main(String[] args) {
        Stream<Double> randoms = Stream.generate(Math::random).limit(20);
        randoms.forEach(System.out::println);

        Object[] powers = Stream.iterate(1.0, p -> p * 2).peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();
    }
}
