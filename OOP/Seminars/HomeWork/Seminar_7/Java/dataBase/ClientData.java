package OOP.Seminars.HomeWork.Seminar_7.Java.dataBase;

import OOP.Seminars.HomeWork.Seminar_7.Java.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientData {
    private List<Client> clients = new ArrayList<>();
    private int count=1;
    public List<Client> getClients() {
        return clients;
    }
    public void addClient(Client client){
        clients.add(client);
        client.setId(count);
        count++;
    }
    public void removeClient(Client client){
        clients.remove(client);
    }
    public void showClients(){
        System.out.println(clients);
    }
    public void clientChangeBalance(int id, int value){
        for (Client client : clients){
            if(client.getId()==id){
                client.setBalance(client.getBalance()+value);
            }
        }
    };
}