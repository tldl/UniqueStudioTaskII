package unique.task1;

import java.util.Date;

/**
 * Created by Administrator on 2014/11/3 0003.
 */
public class ConcreteCommand implements Command {
    Receiver mReceiver;
    private boolean isDone;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void excute() {
        mReceiver.stopRing();
        isDone = true;

    }

    @Override
    public void undo() {
        mReceiver.ring();
        isDone = false;
    }

    @Override
    public void setTime(Date date) {
        mReceiver.setRingTime(date);
    }
}
