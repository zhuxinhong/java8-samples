package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/30.
 */
public class Sample11 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Stream<String> stream = list.stream();
        list.add("z");
        long cnt = stream.distinct().count();
    }
}
