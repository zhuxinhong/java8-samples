package methodreference;

/**
 * Created by zhuxh on 16/12/13.
 */
public class MyIntNum {

    private int v;

    MyIntNum(int x) {
        this.v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
