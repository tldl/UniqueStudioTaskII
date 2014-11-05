package unique.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class DashBoard extends JFrame implements KeyListener {
    private Car mCar;

    public DashBoard() throws HeadlessException {
        super("“«±Ì≈Ã");

        mCar = new Car();
        Container container = getContentPane();
        JPanel panel = new JPanel();
        container.add(panel);
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("DashBoard");
        panel.add(label);

        addKeyListener(this);
        setVisible(true);
        setSize(300, 200);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        mCar.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        mCar.keyReleased(e);
    }
}
