package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by zhuxh on 16/12/30.
 */
public class Sample10 {

    public static void main(String[] args) {
        User user1 = new User(1, "Focus", 1);
        User user2 = new User(2, "Tommy", 1);
        User user3 = new User(3, "Jack", 1);

        User user4 = new User(4, "Rose", 2);
        User user5 = new User(5, "Jane", 2);

        List<User> list = Arrays.asList(user1, user2, user3, user4, user5);

        /** 按性别分组**/
        Map<Integer, List<User>> map = list.stream().collect(Collectors.groupingBy(User::getSex));

        /** 按ID小于等于3分组**/
        Map<Boolean, List<User>> map1 = list.stream().collect(Collectors.partitioningBy(e -> e.getId() <= 3));

        /** 按性别分组 收集为set**/
        Map<Integer, Set<User>> map2 = list.stream().collect(Collectors.groupingBy(User::getSex, Collectors.toSet()));
    }
}
