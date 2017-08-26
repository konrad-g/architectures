public class ServiceC {

    private ServiceA serviceA;
    private ServiceB serviceB;

    public ServiceC(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    public void start() {
        if (this.serviceA.isRunning() && this.serviceB.isRunning()) {
            Util.print("Starting service C");
        } else {
            Util.print("Services A and B needs to be runningbefore starting service C");
        }
    }
}
