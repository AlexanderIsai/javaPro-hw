package hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Начало работы программы");

//        Создать несколько объектов и заполнить их

        Person firstPerson = new Person("Alex", 40, 180, 82, 100);
        Person secondPerson = new Person("Hanna", 30, 165, 60, 200);
        Person thirdPerson = new Person("Oleg", 42, 175, 84, 300);
        Person forthPerson = new Person("Daniil", 72, 177, 73, 400);

        Pensioner pensioner = new Pensioner("Anton", 70, 180, 82, 100, 200);
        pensioner.die();
        Worker worker = new Worker("Sergey", 42, 180, 82, 100, 100, 300);
        worker.die();



    }
}
