// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля
// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их
// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

package Seminars.HomeWork.Seminar_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person_1 = new Person("EVA", "johnson", 40, "female", 6000);
        Person person_2 = new Person("Liza", "Mitchelson", 35, "female", 4500);
        Person person_3 = new Person("Steeve", "Savrazov", 18, "male", 2000);
        Person person_4 = new Person("Mahesh", "Pylaev", 32, "male", 6200);
        Person person_5 = new Person("Roberta", "Svarowsky", 17, "female", 500);
        Person person_6 = new Person("Jaresh", "Mohamed", 29, "male", 3500);
        Person person_7 = new Person("Dave", "Kulotov", 16, "male", 100);
        Person person_8 = new Person("Janet", "Litova", 18, "female", 300);
        Person person_9 = new Person("Mahesh", "Pylaev", 32, "male", 6200);
        List<Person> listOfPerson =new ArrayList<>(Arrays.asList(person_1, person_2, person_3, person_4, person_5, person_6, person_7, person_8, person_9));
        System.out.println(listOfPerson);
        System.out.println("-".repeat(65));

        Person.showPersonAbove(listOfPerson, 20);
        System.out.println("-".repeat(65));

        System.out.println(person_1.hashCode());
        System.out.println("-".repeat(65));

        System.out.println(person_4.equals(person_9));
        System.out.println(person_2.equals(person_6));
        }
}
