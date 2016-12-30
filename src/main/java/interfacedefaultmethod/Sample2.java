package interfacedefaultmethod;

/**
 * Created by zhuxh on 16/10/26.
 */
public class Sample2 implements A, B {
    @Override
    public void hello() {
        A.super.hello();
    }
}
