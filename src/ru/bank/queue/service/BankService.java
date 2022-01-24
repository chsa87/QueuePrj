package ru.bank.queue.service;

import ru.bank.queue.model.Client;


import java.util.ArrayList;
import java.util.List;

public class BankService {

    private final Client CLIENT_1 = new Client("Вася Пупкин", "6123 777333", "1");
    private final Client CLIENT_2 = new Client("Иван Васильевич", "2123 444545", "3");
    private final Client CLIENT_3 = new Client("Нина Петровна", "1231 123132", "5");
    private final Client CLIENT_4 = new Client("Сергей Владимирович", "6123 777333", "10");
    private final Client CLIENT_5 = new Client("Сергей Петров", "6123 777333", "8");
    private final Client CLIENT_6 = new Client("Ivan ", "1111 222222", "7");


    private List<Client> clients = List.of(CLIENT_1, CLIENT_2, CLIENT_3, CLIENT_4, CLIENT_5, CLIENT_6);

    // хранить талончик в очереди с привязко к клиенту

    private List<Client> tikets = new ArrayList<>();

    // хранить клиентов - List( с доп обратбокой)


    public int giveMeTiket(String uslugaType, String clientId) {
        tikets.add(getClientById(clientId));
        return tikets.size();
    }

    private Client getClientById(String clientId) {
        for (Client currentClient : clients) {
            if (currentClient != null && currentClient.getClientId().equals(clientId))
                return currentClient;
        }
        return null;
    }


    public List<Client> getClients() {
        return clients;
    }

    public List<Client> getTikets() {
        return tikets;
    }
}
