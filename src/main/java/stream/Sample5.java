package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/20.
 */
public class Sample5 {

    public static void main(String[] args) {
        unique();

        sort();
    }

    public static void unique(){
        Stream<String> uniqueWords = Stream.of("zhuxh", "zhuxh", "zhuxh", "focus").distinct();
        uniqueWords.forEach(System.out::println);
    }

    public static void sort(){
        List<String> list = letters();
        Stream<String> stringStream = list.stream();

        Stream<String> longestFirst = stringStream.sorted(Comparator.comparing(String::length).reversed());
        longestFirst.forEach(System.out::println);

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
