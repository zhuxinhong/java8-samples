package methodreference;

/**
 * Created by zhuxh on 16/12/13.
 */
public class Sample2 {

    //实例方法引用
    public static void main(String[] args) {
        boolean result;

        MyIntNum myIntNum = new MyIntNum(12);

        MyIntNum myIntNum2 = new MyIntNum(16);

        IntPredicate ip = myIntNum::isFactor;
        result = ip.test(3);


        ip = myIntNum2::isFactor;
        result = ip.test(3);

    }
}
