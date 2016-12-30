package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by zhuxh on 16/12/20.
 */
public class Sample6 {

    public static void main(String[] args) {
        Stream<String> stringStream = letters().stream();

        Optional<String> largestString = stringStream.max(String::compareToIgnoreCase);

        if(largestString.isPresent()){
            System.out.println(largestString.get());
        }
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
