package unique.task3;

import java.util.Scanner;

/**
 * Created by Administrator on 2014/11/5 0005.
 */
public class main {
    public static void main(String[] args) {
        Installer installer = new Installer();
        Builder builder = new ConcreteBuilder();

        System.out.println("Please input grade of your grade ( 1 for HIGH_GRADE,2 for MIDDLE_GRADE,3 for LOW_GRADE)");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                builder.buildMainframe(SystemConfig.Grade.HIGH_GRADE);
                break;
            case 2:
                builder.buildMainframe(SystemConfig.Grade.MIDDLE_GRADE);
                break;
            case 3:
                builder.buildMainframe(SystemConfig.Grade.LOW_GRADE);
                break;
            default:
                builder.buildMainframe(SystemConfig.Grade.MIDDLE_GRADE);
                break;

        }
        System.out.println("Please input brand of your monitor ( 1 for DEFAULT_BRAND,2 for SUNSANG_BRAND,3 for DELL_BRAND)");
        switch (scanner.nextInt()) {
            case 1:
                builder.buildMonitorBrand(SystemConfig.MonitorBrand.DEFAULT_BRAND);
                break;
            case 2:
                builder.buildMonitorBrand(SystemConfig.MonitorBrand.SUNSANG_BRAND);
                break;
            case 3:
                builder.buildMonitorBrand(SystemConfig.MonitorBrand.DELL_BRAND);
                break;
            default:
                builder.buildMonitorBrand(SystemConfig.MonitorBrand.DEFAULT_BRAND);
                break;
        }
        Computer computer = installer.install(builder);
        System.out.println(computer);
    }
}
