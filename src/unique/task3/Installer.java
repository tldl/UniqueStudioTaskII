package unique.task3;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class Installer {
    private Computer mComputer;

    public Installer() {
    }

    public Computer install(Builder builder) {
        System.out.println("Computer is Installing ");
        mComputer = builder.getProduct();
        System.out.println("Install finished ");
        return mComputer;
    }

    public void showProduct() {
        System.out.println(mComputer);
    }

}