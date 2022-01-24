package ru.bank.queue;

import ru.bank.queue.model.Client;
import ru.bank.queue.service.BankService;

import java.util.List;
import java.util.Random;

public class ProjectRunApp {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        Random r = new Random();

        for (int i = 0; i < r.nextInt(15); i++)
            bankService.giveMeTiket("Снять Деньги", String.valueOf(i));

        proccess(bankService.getTikets());

    }

    private static void proccess(List<Client> tikets) {
        while (tikets.size() > 0) {
            Client client = tikets.get(0);
            System.out.println("Client proccesed: " + client);
            tikets.remove(client);
        }
    }

}
