public class ServiceB {

    private boolean isRunning = false;

    public ServiceB() {}

    public void start() {
        Util.print("Starting service B");
        isRunning = true;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
