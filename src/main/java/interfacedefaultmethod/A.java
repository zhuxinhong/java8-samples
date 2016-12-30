package interfacedefaultmethod;

/**
 * Created by zhuxh on 16/10/26.
 */
public interface A {

    default void hello() {
        System.out.println("This is A .");
    }

    default void hello2() {
        hello();
    }
}
