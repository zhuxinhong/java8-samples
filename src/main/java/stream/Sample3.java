package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/20.
 */
public class Sample3 {

    public static void main(String[] args) {
        List<String> list = letters();
        Stream<String> lowerString = list.stream().map(String::toLowerCase);
        lowerString.forEach(System.out::println);

        Stream<Character> characterStream = list.stream().flatMap(Sample3::characterStream);
        characterStream.forEach(System.out::println);
    }

    private static List<String> letters() {
        List<String> list = new ArrayList<>();
        list.add("Tommy");
        list.add("Focus");
        list.add("Tim");
        list.add("Jack");
        return list;
    }

    public static Stream<Character> characterStream(String s) {
        List<Character> result = new ArrayList<>();
        for (char c : s.toCharArray()) {
            result.add(c);
        }
        return result.stream();
    }
}
