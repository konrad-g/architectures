import services.a.ServiceAListener;
import services.a.ServiceA;
import services.b.ServiceB;
import services.b.ServiceBListener;
import services.c.ServiceC;
import services.c.ServiceCListener;
import util.Util;

public class Main implements ServiceAListener, ServiceBListener, ServiceCListener {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private ServiceA serviceA;
    private ServiceB serviceB;
    private ServiceC serviceC;

    public Main() {
        this.serviceA = new ServiceA(this);
        this.serviceB = new ServiceB(this);
        this.serviceC = new ServiceC(this);
    }

    public void start() {
        serviceA.start();
        serviceB.start();
        serviceC.start();
    }

    /*
     * Delegated methods
     */

    public boolean isServiceARunning() {
        return this.serviceA.isRunning();
    }

    public boolean isServiceBRunning() {
        return this.serviceB.isRunning();
    }

    public void print(String text) {
        Util.print(text);
    }
}
