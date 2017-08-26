package services.a;

import services.b.IServiceB;
import util.IUtil;

public class ServiceA implements IServiceA {

    private IServiceB serviceB;
    private IUtil util;
    private boolean isRunning = false;

    public ServiceA(IServiceB serviceB, IUtil util) {
        this.serviceB = serviceB;
        this.util = util;
    }

    public void start() {
        if (!this.serviceB.isRunning()) {
            this.util.print("Starting service A");
            this.isRunning = true;
        } else {
            this.util.print("Can't start service A, service B is already running.");
        }
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
