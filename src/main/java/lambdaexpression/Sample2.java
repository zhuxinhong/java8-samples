package lambdaexpression;

/**
 * Created by zhuxh on 16/12/13.
 */
public class Sample2 {

    public static void main(String[] args) {
        int num = 10;

        MyFunc myFunc = n -> {
            int res = n + num;
            return res;
        };

        System.out.println(myFunc.func(8));

//        num = 9;
    }
}
