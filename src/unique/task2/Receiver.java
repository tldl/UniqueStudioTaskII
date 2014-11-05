package unique.task2;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by Administrator on 2014/11/5 0005.
 */
public class Receiver extends Thread implements Decorator {
    private PipedInputStream mInStream = new PipedInputStream();
    protected String mInStr;

    public PipedInputStream getInStream() {
        return mInStream;
    }

    public void run() {
        byte[] buf = new byte[1024];
        try {
            int len = mInStream.read(buf);
            Decorator decorator = new UpDecorator();
            String str = transform(new String(buf, 0, len));
            System.out.println("receive from sender:" + str);
            mInStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputString() {
        System.out.println("The string had been processed");
        System.out.println(mInStr);
    }


    @Override
    public String transform(String str) {
        return str;
    }
}
