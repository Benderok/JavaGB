package Seminars.HomeWork.Seminar_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person{
    private String name;
    private String surname;
    private int age;
    private String sex;
    private int salary;

    public Person(String name, String surmane, int age, String sex, int salary){
        this.name = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        this.surname = surmane.toUpperCase().charAt(0) + surmane.substring(1).toLowerCase();
        this.age = age;
        this.sex = sex.toLowerCase();
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String sex(){
        return sex;
    }
    public int salary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("\nName: %s, Surname: %s, Age: %d, Sex: %s, Salary: %d USD", name, surname, age, sex, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        Person newPerson = (Person) obj;
        if (Objects.equals(name, newPerson.name) && age == newPerson.age ){
            if((Objects.equals(surname, newPerson.surname))
                    && Objects.equals(sex, newPerson.sex)) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, sex, salary);
    }

    public static void showPersonAbove(List<Person> personsList, int age){
        List<Person> sorted = new ArrayList<>();
        for (Person person : personsList) {
            if (person.getAge() > age){
                sorted.add(person);
            }
        }
        System.out.println(sorted);
    }

}
