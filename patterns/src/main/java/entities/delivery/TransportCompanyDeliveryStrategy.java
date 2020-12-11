package entities.delivery;

public class TransportCompanyDeliveryStrategy implements DeliveryStrategy {
    public void deliver(String address) throws InterruptedException {
        System.out.println("Отвозим заказ в транспортую компанию...");
        Thread.sleep(3000);
        System.out.println("Заполняем бумаги и передаём заказ...");
        Thread.sleep(2000);
        System.out.println("Ждём доставки...");
        Thread.sleep(5000);
        System.out.println("Посылка получена клиентом с адресом " + address);
    }
}
