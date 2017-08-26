package services.c;

public interface ServiceCListener {
    boolean isServiceARunning();
    boolean isServiceBRunning();
    void print(String text);
}