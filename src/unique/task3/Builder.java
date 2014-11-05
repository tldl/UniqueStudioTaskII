package unique.task3;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public interface Builder {


    public void buildMainframe(SystemConfig.Grade mainframeGrade);

    public void buildMonitor(SystemConfig.Grade monitorGrade);

    public void buildMonitorBrand(SystemConfig.MonitorBrand monitorBrand);

    public Computer getProduct();

}
