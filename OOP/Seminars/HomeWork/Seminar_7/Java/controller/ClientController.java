package OOP.Seminars.HomeWork.Seminar_7.Java.controller;

import OOP.Seminars.HomeWork.Seminar_7.Java.model.Client;
import OOP.Seminars.HomeWork.Seminar_7.Java.service.ClientServiceImpl;

import java.util.Scanner;

public class ClientController {
    ClientServiceImpl clientService = new ClientServiceImpl();
    public void addClient(){
        System.out.println("Add a new client. Type name and age");
        Scanner scanner = new Scanner(System.in);
        clientService.addClient(new Client(scanner.nextLine(),scanner.nextInt()));
        clientService.showClients();
    }
    public void removeClient(){
        clientService.showClients();
        System.out.println("Remove client. Type id");
        Scanner scanner1 = new Scanner(System.in);
        int id = scanner1.nextInt();
        clientService.getClients().removeIf(client -> client.getId()== id);
        clientService.showClients();
    }
    public void clientChangeBalance() {
        clientService.showClients();
        System.out.println("Type id and value for changing balance");
        Scanner scanner2 = new Scanner(System.in);
        int id = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int value = scanner3.nextInt();
        clientService.clientChangeBalance(id, value);
        clientService.showClients();
    }

    public void getMenu()  {
        while(true){
        System.out.println("type number 1 -add, 2 - remove, 3 - change balance, 0 - exit");
            Scanner scanner = new Scanner(System.in);
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    addClient();
                    break;
                case "2":
                    removeClient();
                    break;
                case "3":
                    clientChangeBalance();
                    break;
                case "0":
                    return;
            }
        }}}