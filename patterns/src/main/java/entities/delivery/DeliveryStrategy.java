package entities.delivery;

public interface DeliveryStrategy {
    void deliver(String address) throws InterruptedException;
}
