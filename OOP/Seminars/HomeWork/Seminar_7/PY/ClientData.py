from Client import *
class ClientData:
    def __init__(self):
        self.clients = []
        self.count = 1

    def get_clients(self):
        return self.clients

    def add_client(self, Client):
        self.clients.append(Client)
        Client.set_id(self.count)
        self.count += 1

    def remove_client(self, client):
        self.clients.remove(client)

    def show_clients(self):
        print(self.clients)

    def client_change_balance(self, client_id, value):
        for client in self.clients:
            if client.get_id() == client_id:
                client.set_balance(client.get_balance() + value)