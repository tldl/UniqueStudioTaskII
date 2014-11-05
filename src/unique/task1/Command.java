package unique.task1;

import java.util.Date;

/**
 * Created by Administrator on 2014/11/3 0003.
 */
public interface Command {
    public void excute();

    public void undo();

    public void setTime(Date date);
}
