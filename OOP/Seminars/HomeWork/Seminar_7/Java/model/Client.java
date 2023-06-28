package OOP.Seminars.HomeWork.Seminar_7.Java.model;

public class Client {
    private String name;
    private int age;
    private int balance;
    private int id;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", id=" + id +
                '}';
    }
}