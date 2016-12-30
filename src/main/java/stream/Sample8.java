package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/27.
 */
public class Sample8 {

    public static void main(String[] args) {
        String[] words = new String[]{"Tommy", "Focus", "Tim", "Jack"};
        Stream<String> stream = Arrays.stream(words);
        HashSet<String> hashSet = stream.collect(HashSet::new, HashSet::add, HashSet::addAll);

        List<String> list = Arrays.stream(words).collect(Collectors.toList());
        Set<String> set = Arrays.stream(words).collect(Collectors.toSet());

        TreeSet<String> treeSet = Arrays.stream(words).collect(Collectors.toCollection(TreeSet::new));

        String strJoin = Arrays.stream(words).collect(Collectors.joining());

        String result = Arrays.stream(words).collect(Collectors.joining(","));

        String result2 = Arrays.stream(words).map(Object::toString).collect(Collectors.joining(","));


        IntSummaryStatistics summary = Arrays.stream(words).collect(Collectors.summarizingInt(String::length));
        double averagwLength = summary.getAverage();
        double maxLength = summary.getMax();
        double min = summary.getMin();
    }
}
