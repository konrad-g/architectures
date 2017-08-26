import services.a.IServiceA;
import services.a.ServiceA;
import services.b.IServiceB;
import services.b.ServiceB;
import services.c.IServiceC;
import services.c.ServiceC;
import util.IUtil;
import util.Util;

public class Main {

    public static void main(String[] args) {
        IUtil util = new Util();
        IServiceB serviceB = new ServiceB(util);
        IServiceA serviceA = new ServiceA(serviceB, util);
        IServiceC serviceC = new ServiceC(serviceA, serviceB, util);

        serviceA.start();
        serviceB.start();
        serviceC.start();
    }
}
