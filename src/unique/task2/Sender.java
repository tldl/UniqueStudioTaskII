package unique.task2;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2014/11/5 0005.
 */
public class Sender extends Thread {
    private PipedOutputStream mOutStream = new PipedOutputStream();
    protected String mOutStr;

    public PipedOutputStream getOutStream() {
        return mOutStream;
    }

    @Override
    public void run() {
        try {
            mOutStream.write(mOutStr.getBytes());
            mOutStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void inputString() {
        System.out.println("Please input the string to be processed");
        Scanner scanner = new Scanner(System.in);
        mOutStr = scanner.next();
    }
}
