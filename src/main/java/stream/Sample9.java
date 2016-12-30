package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by zhuxh on 16/12/29.
 */
public class Sample9 {

    public static void main(String[] args) {
        User user1 = new User(1, "Focus");
        User user2 = new User(2, "Tommy");
        User user3 = new User(3, "Jack");

        List<User> list = Arrays.asList(user1, user2, user3);

        s1(list);
        s2(list);
        s3(list);
    }

    /**
     * key重复会抛异常
     **/
    public static void s1(List<User> list) {
        Map<Integer, String> idToName = list.stream().collect(Collectors.toMap(User::getId, User::getName));
        Map<Integer, User> idToUser = list.stream().collect(Collectors.toMap(User::getId, Function.identity()));
    }

    public static void s2(List<User> list) {
        User user = new User(1, "Billy");

        List<User> userList = new ArrayList<>(list);
        userList.add(user);

        Map<Integer, Set<String>> idToName = userList.stream().collect(Collectors.toMap(
                u -> u.getId(),
                u -> Collections.singleton(u.getName()),
                (a, b) -> {
                    Set<String> r = new HashSet<String>(a);
                    r.addAll(b);
                    return r;
                }));
    }

    public static void s3(List<User> list) {
        Map<Integer, User> idToUser = list.stream().collect(
                Collectors.toMap(
                        User::getId,
                        Function.identity(),
                        (existingVal, newVal) -> {
                            throw new IllegalStateException();
                        },
                        TreeMap::new
                )
        );
    }
}

