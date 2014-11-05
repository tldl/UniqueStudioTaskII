package unique.task2;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class FilterDecorator implements Decorator {

    private char mFilterChar;

    public void setFilterStr(char s) {
        mFilterChar = s;
    }

    @Override
    public String transform(String str) {
        str = str.replace(String.valueOf(mFilterChar), "");
        return str;
    }
}
