package methodreference;

/**
 * Created by zhuxh on 16/12/13.
 */
public class Sample1 {

    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    //静态方法引用
    public static void main(String[] args) {
        boolean result;

        result = numTest(MyIntPredicates::isPrime, 17);

        result = numTest(MyIntPredicates::isEven, 12);

        result = numTest(MyIntPredicates::isPositive, 11);


    }
}
