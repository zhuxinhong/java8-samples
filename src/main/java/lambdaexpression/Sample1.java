package lambdaexpression;

/**
 * Created by zhuxh on 16/12/13.
 */
public class Sample1 {

    private static MyValue myValue;

    public static void main(String[] args) {
            myValue = () -> Math.random();

            MyValue _myValue = () -> 1.1;

            MyValue2 myValue2 = x -> x * 100;

            MyValue2 _myValue2 = (n) -> n * 100;

        System.out.println(myValue2.myValue(1));
    }
}
