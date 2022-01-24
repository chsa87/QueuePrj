package ru.bank.queue.model;

public class Client  implements Comparable{

    private String fio;
    private String passportNumber;
    private String clientId;

    public Client(String fio, String passportNumber, String clientId) {
        this.fio = fio;
        this.passportNumber = passportNumber;
        this.clientId = clientId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fio='" + fio + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", clientId='" + clientId + '\'' +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
