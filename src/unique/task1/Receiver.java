package unique.task1;

import java.util.Date;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2014/11/3 0003.
 */
public class Receiver extends Observable {
    private boolean isRing;
    private Timer mTimer;

    public boolean isRing() {
        System.out.print("the state " + isRing);
        return isRing;
    }

    public void setRing(boolean isRing) {
        this.isRing = isRing;
    }

    public void ring() {
        System.out.println("the clock ring");
        isRing = true;
        setChanged();
        notifyObservers(isRing);


    }

    public void stopRing() {
        System.out.println("the clock has been stop");
        setChanged();
        isRing = false;
        notifyObservers(isRing);

    }

    public void setRingTime(Date date) {
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                ring();
            }
        }, date);

    }


}
