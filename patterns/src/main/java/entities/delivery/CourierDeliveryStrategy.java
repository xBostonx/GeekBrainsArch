package entities.delivery;

public class CourierDeliveryStrategy implements DeliveryStrategy {
    public void deliver(String address) throws InterruptedException {
        System.out.println("Курьер забирает заказ");
        Thread.sleep(1000);
        System.out.println("Курьер едет на адрес: " + address + "...");
        Thread.sleep(2000);
        System.out.println("Курьер передал заказ клиенту с адресом " + address);
    }
}
