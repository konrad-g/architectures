package services.b;

import util.IUtil;

public class ServiceB implements IServiceB {

    private IUtil util;
    private boolean isRunning = false;

    public ServiceB(IUtil util) {
        this.util = util;
    }

    public void start() {
        this.util.print("Starting service B");
        isRunning = true;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
