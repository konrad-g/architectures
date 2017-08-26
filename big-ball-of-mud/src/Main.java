public class Main {

    public static void main(String[] args) {
        ServiceB serviceB = new ServiceB();
        ServiceA serviceA = new ServiceA(serviceB);
        ServiceC serviceC = new ServiceC(serviceA, serviceB);

        serviceA.start();
        serviceB.start();
        serviceC.start();
    }
}
