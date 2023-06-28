class Client:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.balance = 0
        self.id = 0

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_age(self):
        return self.age

    def set_age(self, age):
        self.age = age

    def get_balance(self):
        return self.balance

    def set_balance(self, balance):
        self.balance = balance

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def __str__(self):
        return "Client{" + "name='" + self.name +\
            '\'' + ",age=" + str(self.age) +\
            ", balance=" + str(self.balance) +\
            ", id=" + str(self.id) + '}'