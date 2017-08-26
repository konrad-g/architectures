public class ServiceA {

    private ServiceB serviceB;
    private boolean isRunning = false;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void start() {
        if (!this.serviceB.isRunning()) {
            Util.print("Starting service A");
            this.isRunning = true;
        } else {
            Util.print("Can't start service A, service B is already running.");
        }
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
