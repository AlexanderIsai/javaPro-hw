package hw1;

import java.time.DayOfWeek;
import java.util.*;

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

        Set<Professions> professions = new HashSet<>();
        professions.add(Professions.ENGINEER);
        professions.add(Professions.DOCTOR);
        professions.add(Professions.DRIVER);
        professions.add(Professions.PILOT);
        professions.add(Professions.POLICEMAN);
        professions.add(Professions.PROGRAMMER);
        worker.setProfessions(professions);
        System.out.println(worker.calculatePension());

        PensionFund pensionFund = new PensionFund("AOK", true, "01.01.1980");

//        Map<DayOfWeek, Boolean> daysOfWeekMap = new HashMap<>();
        pensionFund.getDaysOfWeek().put(DayOfWeek.MONDAY, true);
        pensionFund.getDaysOfWeek().put(DayOfWeek.TUESDAY, true);
        pensionFund.getDaysOfWeek().put(DayOfWeek.WEDNESDAY, true);
        pensionFund.getDaysOfWeek().put(DayOfWeek.THURSDAY, true);
        pensionFund.getDaysOfWeek().put(DayOfWeek.FRIDAY, true);
        pensionFund.getDaysOfWeek().put(DayOfWeek.SATURDAY, true);
        pensionFund.getDaysOfWeek().put(DayOfWeek.SUNDAY, true);
//        daysOfWeekMap.put(DayOfWeek.MONDAY, true);
//        daysOfWeekMap.put(DayOfWeek.TUESDAY, true);
//        daysOfWeekMap.put(DayOfWeek.WEDNESDAY, true);
//        daysOfWeekMap.put(DayOfWeek.THURSDAY, true);
//        daysOfWeekMap.put(DayOfWeek.FRIDAY, true);
//        daysOfWeekMap.put(DayOfWeek.SATURDAY, false);
//        daysOfWeekMap.put(DayOfWeek.SUNDAY, false);
//        pensionFund.setDaysOfWeek(daysOfWeekMap);
        System.out.println(pensionFund);
        System.out.println(pensionFund.calculatePensionFor(worker));




    }
}
