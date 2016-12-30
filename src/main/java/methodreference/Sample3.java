package methodreference;

/**
 * Created by zhuxh on 16/12/15.
 */
public class Sample3 {

    //构造函数引用
    public static void main(String[] args) {
        MyFunc myFunc = MyClass::new;

        MyClass mc = myFunc.func("test");

//        MyClass mc2 = new MyClass("test");

        System.out.println(mc.getStr());
    }
}
