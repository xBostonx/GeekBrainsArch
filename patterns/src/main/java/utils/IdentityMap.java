package utils;

import entities.Client;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private static Map<Long, Client> clients = new HashMap<>();

    public static void addClient(Client client) {
        clients.put(client.getId(), client);
    }

    public static Client getClient(Long key) {
        return clients.get(key);
    }

}
