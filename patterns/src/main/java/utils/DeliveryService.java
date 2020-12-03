package utils;

import entities.delivery.CourierDeliveryStrategy;
import entities.delivery.DeliveryStrategy;
import entities.delivery.PostDeliveryStrategy;
import entities.delivery.TransportCompanyDeliveryStrategy;

import java.util.Scanner;

public class DeliveryService {
    private static DeliveryStrategy deliveryStrategy;

    private static void processingDelivery(String address) {
        try {
            deliveryStrategy.deliver(address);
        } catch (InterruptedException e) {
            System.out.println("Посылка сгинула без следа!");
        }
    }

    public static void executeDelivery(String address) {
        System.out.println("Выберите способ доставки:\n" +
                "1 - Курьерская доставка\n" +
                "2 - Доставка транспортной компанией\n" +
                "3 - Доставка почтой России\n");
        String condition = new Scanner(System.in).nextLine();
        switch (condition) {
            case "1":
                deliveryStrategy = new CourierDeliveryStrategy();
                break;
            case "2":
                deliveryStrategy = new TransportCompanyDeliveryStrategy();
                break;
            case "3":
                deliveryStrategy = new PostDeliveryStrategy();
                break;
        }
        processingDelivery(address);
    }

}
