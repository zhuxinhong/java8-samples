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
        Stream<Integer> stream = intList.stream();

        Optional<Integer> sum = stream.reduce(Integer::sum);

        System.out.println(sum.get());
    }

}
