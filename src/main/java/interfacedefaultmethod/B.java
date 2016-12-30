package interfacedefaultmethod;

/**
 * Created by zhuxh on 16/10/26.
 */
public interface B {

    default void hello() {
        System.out.println("This is B .");
    }
}
