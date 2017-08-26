package services.c;

public class ServiceC {

    private ServiceCListener listener;

    public ServiceC(ServiceCListener listener) {
        this.listener = listener;
    }

    public void start() {
        if (this.listener.isServiceARunning() && this.listener.isServiceBRunning()) {
            this.listener.print("Starting service C");
        } else {
            this.listener.print("Services A and B needs to be runningbefore starting service C");
        }
    }
}
