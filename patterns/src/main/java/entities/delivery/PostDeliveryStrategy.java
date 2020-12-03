package entities.delivery;

public class PostDeliveryStrategy implements DeliveryStrategy {
    public void deliver(String address) throws InterruptedException {
        System.out.println("Идём на почту...");
        Thread.sleep(1000);
        System.out.println("Заполняем бумаги и передаём посылку...");
        Thread.sleep(1000);
        System.out.println("Ждём доставки...");
        Thread.sleep(3500);
        System.out.println("Ждём доставки...");
        Thread.sleep(3500);
        System.out.println("Ждём доставки...");
        Thread.sleep(3500);
        System.out.println("Ждём доставки...");
        Thread.sleep(3500);
        System.out.println("Посылка получена клиентом с адресом " + address);
    }
}
