package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuxh on 16/10/26.
 */
public class Sample1 {

    public static void main(String[] args) {
        List<String> list = letters();
        list.forEach(System.out::println);

        countWord(list);
        filterCountWord(list);
        parallelFilterCountWord(list);

    }

    private static List<String> letters() {
        List<String> list = new ArrayList<>();
        list.add("Tommy");
        list.add("Focus");
        list.add("Tim");
        list.add("Jack");
        return list;
    }

    private static void countWord(List<String> list) {
        int count = 0;
        for (String str : list) {
            if (str.length() > 4)
                count++;
        }
        System.out.println("countWord: " + count);
    }

    private static void filterCountWord(List<String> list) {
        long count = list.stream().filter(w -> w.length() > 4).count();
        System.out.println("filterCountWord: " + count);
    }

    private static void parallelFilterCountWord(List<String> list) {
        long count = list.parallelStream().filter(w -> w.length() > 4).count();
        System.out.println("parallelFilterCountWord: " + count);
    }

}
