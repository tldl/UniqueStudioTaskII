package unique.task1;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2014/11/3 0003.
 */
public class Invoker implements Observer {
    private boolean isAwake;
    private Command mCommand;

    public Command getCommand() {
        return mCommand;
    }

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void runCommand() {
        mCommand.excute();
        wakeUp();
    }

    public void undoCommand() {
        mCommand.undo();
        sleep();
    }

    public void setCommandTime(Date date) {
        mCommand.setTime(date);
    }

    public void wakeUp() {
        System.out.println("I wake up");
        isAwake = true;

    }

    public void sleep() {
        System.out.println("I am sleeping");
        isAwake = false;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Boolean) {
            Boolean state = (Boolean) arg;
            System.out.println("The clock is ringing , it is time to wake up ");

        }
    }
}
