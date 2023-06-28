from ClientService import *
from ClientData import *
from Client import *


class ClientServiceImpl(ClientService):
    clientData = ClientData

    def add_client(self, Client):
            self.clientData.add_client(Client)


    def remove_client(self, client):
        if client != None:
            self.clientData.remove_client(client)
        else:
            print("Some error with removing client. ---client = null---")

    def show_clients(self):
        self.clientData.show_clients()

    def get_clients(self):
        return self.clientData.get_clients()

    def client_change_balance(self, id, value):
        self.clientData.client_change_balance(id, value)