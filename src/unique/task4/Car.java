package unique.task4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class Car implements KeyListener {
    private DashData mDash;

    public Car(DashData dash) {
        mDash = dash;
    }

    public Car() {
        mDash = new DashData();
    }

    public DashData getDash() {
        return mDash;
    }

    public void setDash(DashData dash) {
        mDash = dash;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int t = e.getKeyCode();
        switch (t) {
            case KeyEvent.VK_W:
                mDash.getDirection().up = true;
                mDash.speed += 10;
                if (mDash.speed > 200)
                    mDash.speed = 200;
                break;
            case KeyEvent.VK_S:
                mDash.getDirection().down = true;
                mDash.speed -= 10;
                if (mDash.speed < -30)
                    mDash.speed = -30;
                break;
            case KeyEvent.VK_A:
                mDash.getDirection().left = true;
                break;
            case KeyEvent.VK_D:
                mDash.getDirection().right = true;
                break;
        }

        if (mDash.getDirection().toString().equals(mDash.getDirection().UP_RIGHT)) {
            mDash.setRightLight(true);
        }
        if (mDash.getDirection().toString().equals(mDash.getDirection().UP_LEFT)) {
            mDash.setLeftLight(true);
        }
        System.out.println(mDash);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int t = e.getKeyCode();
        switch (t) {
            case KeyEvent.VK_W:
                mDash.getDirection().up = false;
                break;
            case KeyEvent.VK_S:
                mDash.getDirection().down = false;
                break;
            case KeyEvent.VK_A:
                mDash.getDirection().left = false;
                break;
            case KeyEvent.VK_D:
                mDash.getDirection().right = false;
                break;
        }
        if (!mDash.getDirection().toString().equals(mDash.getDirection().UP_RIGHT)) {
            mDash.setRightLight(false);
        }
        if (!mDash.getDirection().toString().equals(mDash.getDirection().UP_LEFT)) {
            mDash.setLeftLight(false);
        }
        System.out.println(mDash);
    }
}
