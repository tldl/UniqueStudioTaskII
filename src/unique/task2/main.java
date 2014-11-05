package unique.task2;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class main {

    public static void main(String[] args) {
        Sender send = new Sender();
        Receiver read = new Receiver();
        PipedOutputStream out = send.getOutStream();
        PipedInputStream in = read.getInStream();
        try {
            out.connect(in);//或者也可以用in.connect(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        send.inputString();
        send.start();
        read.start();

    }
}
