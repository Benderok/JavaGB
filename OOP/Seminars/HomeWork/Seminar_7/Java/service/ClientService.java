package OOP.Seminars.HomeWork.Seminar_7.Java.service;

import OOP.Seminars.HomeWork.Seminar_7.Java.model.Client;

import java.util.List;

public interface ClientService {
    void addClient(Client client);
    void removeClient(Client client);
    void showClients();
    List<Client> getClients();
    void clientChangeBalance(int id, int value);

}
