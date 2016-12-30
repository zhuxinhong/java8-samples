package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/27.
 */
public class Sample7 {

    public static void main(String[] args) {
        List<String> list = letters();

        Stream<String> stream = list.stream();
        int res = stream.reduce(0, (total, word) -> total + word.length(), (t1, t2) -> t1 + t2);
        System.out.println(res);

        int res2 = stream.mapToInt(String::length).sum();
        System.out.println(res2);
    }

    private static List<String> letters() {
        List<String> list = new ArrayList<>();
        list.add("Tommy");
        list.add("Focus");
        list.add("Tim");
        list.add("Jack");
        return list;
    }
}
