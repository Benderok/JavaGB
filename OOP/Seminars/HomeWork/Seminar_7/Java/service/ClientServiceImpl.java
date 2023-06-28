package OOP.Seminars.HomeWork.Seminar_7.Java.service;

import OOP.Seminars.HomeWork.Seminar_7.Java.dataBase.ClientData;
import OOP.Seminars.HomeWork.Seminar_7.Java.model.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService{
    ClientData clientData = new ClientData();
    @Override
    public void addClient(Client client) {
        if(client != null){
        clientData.addClient(client);}
        else {
            System.out.println("Some error with adding client. ---client = null---");
        }
    }

    @Override
    public void removeClient(Client client) {
        if(client != null){
            clientData.removeClient(client);}
        else {
            System.out.println("Some error with removing client. ---client = null---");
        }
    }

    @Override
    public void showClients() {
        clientData.showClients();
    }

    @Override
    public List<Client> getClients() {
        return clientData.getClients();
    }

    @Override
    public void clientChangeBalance(int id, int value) {
        clientData.clientChangeBalance(id, value);
    }
    }