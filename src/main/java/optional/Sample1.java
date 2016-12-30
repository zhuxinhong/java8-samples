package optional;

import java.util.Optional;

/**
 * Created by zhuxh on 16/12/27.
 */
public class Sample1 {

    public static void main(String[] args) {
        Double x = 1d;

        Optional<Double> result = MyMath.inverse(x).flatMap(MyMath::squareRoot);

        Optional<Double> res2 = Optional.of(-4d).flatMap(MyMath::inverse).flatMap(MyMath::squareRoot);
    }
}
