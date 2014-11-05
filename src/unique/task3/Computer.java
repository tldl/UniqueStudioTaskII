package unique.task3;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class Computer {
    private SystemConfig.Grade mMainframeGrade;
    private SystemConfig.Grade mMonitorGrade;
    private SystemConfig.MonitorBrand mMonitorBrand;
    private Builder mBuilder;

    public Computer() {

    }

    public Computer(Builder builder) {
        mBuilder = builder;
    }

    public SystemConfig.Grade getMainframeGrade() {
        return mMainframeGrade;
    }

    public void setMainframeGrade(SystemConfig.Grade mainframeGrade) {
        mMainframeGrade = mainframeGrade;
    }

    public SystemConfig.Grade getMonitorGrade() {
        return mMonitorGrade;
    }

    public void setMonitorGrade(SystemConfig.Grade monitorGrade) {
        mMonitorGrade = monitorGrade;
    }

    public SystemConfig.MonitorBrand getMonitorBrand() {
        return mMonitorBrand;
    }

    public void setMonitorBrand(SystemConfig.MonitorBrand monitorBrand) {
        mMonitorBrand = monitorBrand;
    }

    @Override
    public String toString() {
        return "Computer Config { " +
                "MainframeGrade : " + mMainframeGrade +
                ", MonitorGrade : " + mMonitorGrade +
                ", MonitorBrand : " + mMonitorBrand +
                " }";
    }


}
