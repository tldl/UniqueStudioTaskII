package unique.task3;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class ConcreteBuilder implements Builder {

    private SystemConfig.Grade mMainframeGrade;
    private SystemConfig.Grade mMonitorGrade;
    private SystemConfig.MonitorBrand mMonitorBrand = SystemConfig.MonitorBrand.DEFAULT_BRAND;
    private Computer mComputer;

    public ConcreteBuilder() {
        mComputer = new Computer();
    }

    @Override
    public void buildMonitor(SystemConfig.Grade monitorGrade) {
        mComputer.setMonitorGrade(monitorGrade);
    }

    @Override
    public void buildMonitorBrand(SystemConfig.MonitorBrand monitorBrand) {
        mComputer.setMonitorBrand(monitorBrand);
    }

    @Override
    public Computer getProduct() {
        return mComputer;
    }

    @Override
    public void buildMainframe(SystemConfig.Grade mainframeGrade) {
        mComputer.setMainframeGrade(mainframeGrade);
        mComputer.setMonitorGrade(mainframeGrade);
        mComputer.setMonitorBrand(mMonitorBrand);
    }


}
