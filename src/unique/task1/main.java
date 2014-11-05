package unique.task1;

/**
 * Created by Administrator on 2014/11/3 0003.
 */
public class main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        receiver.addObserver(invoker);
        Command command = new ConcreteCommand(receiver);
        command.setTime(Utils.setFormatDate("2014/11/04/14/41/00"));
        receiver.addObserver(invoker);
        invoker.setCommand(command);


    }
}
