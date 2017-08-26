package services.a;

public class ServiceA {

    private ServiceAListener listener;
    private boolean isRunning = false;

    public ServiceA(ServiceAListener listener) {
        this.listener = listener;
    }

    public void start() {
        if (!this.listener.isServiceBRunning()) {
            this.listener.print("Starting service A");
            this.isRunning = true;
        } else {
            this.listener.print("Can't start service A, service B is already running.");
        }
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
