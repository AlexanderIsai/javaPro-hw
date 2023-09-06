package hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Начало работы программы");

//        Создать несколько объектов и заполнить их


        Pensioner pensioner = new Pensioner("Anton", 73, 180, 82, 100, 200);
        pensioner.die();
        Worker worker = new Worker("Sergey", 42, 180, 82, 100, 100, 300);
        worker.die();

        pensioner.getInfoAboutPerson();
        pensioner.goToWork();
        worker.die(15);
        pensioner.die(5);
        worker.setGender(Gender.MALE);
        System.out.println(worker.calculatePension());

    }
}
