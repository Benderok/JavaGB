from ClientService import *
from ClientData import *
from ClientServiceImpl import *
from Client import *

class ClientController:
    clientService = ClientServiceImpl()

    def add_client(self):
        print("Add a new client. Type name and age")
        name = input()
        age = int(input())
        self.clientService.add_client(Client)
        self.clientService.show_clients()

    def remove_client(self):
        self.clientService.show_clients()
        print("Remove client. Type id")
        id = int(input())
        self.clientService.get_clients().removeIf(lambda client: client.getId() == id)
        self.clientService.show_clients()

    def client_change_balance(self):
        self.clientService.show_clients()
        print("Type id and value for changing balance")
        id = int(input())
        value = int(input())
        self.clientService.client_change_balance(id, value)
        self.clientService.show_clients()

    def get_menu(self):
        while True:
            print("type number 1 -add, 2 - remove, 3 - change balance, 0 - exit")
            choice = input()
            if choice == "1":
                self.add_client()
            elif choice == "2":
                self.remove_client()
            elif choice == "3":
                self.client_change_balance()
            elif choice == "0":
                exit()