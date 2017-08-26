package services.c;

import services.a.IServiceA;
import services.b.IServiceB;
import util.IUtil;

public class ServiceC implements IServiceC {

    private IServiceA serviceA;
    private IServiceB serviceB;
    private IUtil util;

    public ServiceC(IServiceA serviceA, IServiceB serviceB, IUtil util) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
        this.util = util;
    }

    public void start() {
        if (this.serviceA.isRunning() && this.serviceB.isRunning()) {
            this.util.print("Starting service C");
        } else {
            this.util.print("Services A and B needs to be runningbefore starting service C");
        }
    }
}
