package unique.task2;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class UpDecorator implements Decorator {

    @Override
    public String transform(String str) {
        str = str.toUpperCase();
        return str;
    }
}
