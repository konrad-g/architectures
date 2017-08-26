package services.b;

public class ServiceB {

    private ServiceBListener listener;
    private boolean isRunning = false;

    public ServiceB(ServiceBListener listener) {
        this.listener = listener;
    }

    public void start() {
        this.listener.print("Starting service B");
        isRunning = true;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
