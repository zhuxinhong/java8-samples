package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuxh on 16/12/16.
 */
public class Sample0 {

    class S1 implements Runnable {
        @Override
        public void run() {
            System.out.println("This is S1");
        }
    }


    public static void main(String[] args) {
        test1();

        test2();
    }

    static void test1() {
        Sample0 sample0 = new Sample0();
        S1 s1 = sample0.new S1();
        s1.run();

        Runnable abc = () -> System.out.println("This is lambda");
        abc.run();
    }

    static void test2() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(System.out::println);
    }
}
