package methodreference;

/**
 * Created by zhuxh on 16/12/15.
 */
public class MyClass {

    MyClass(String str) {
        this.str = str;
    }

//    MyClass() {
//        this.str = "";
//    }

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
