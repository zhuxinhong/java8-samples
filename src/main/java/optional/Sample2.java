package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/27.
 */
public class Sample2 {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            intList.add(i);
        }

//        Object[] ints = Stream.iterate(1, p -> p +1).limit(100).toArray();
//        List<Integer> integerList = Stream.iterate(1, p -> p +1).limit(100).collect(Collectors.toList());

        Stream<Integer> stream = intList.stream();

//        Optional<Integer> sum = stream.reduce(Integer::sum);

        int res = stream.reduce(0, (sumVal, val) -> sumVal + val, (t1, t2) -> t1 + t2);
        System.out.println(res);
//        System.out.println(sum.get());
    }

}
