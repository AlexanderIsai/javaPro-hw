package familyTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Human mother1 = new Human("Helen", 42);
        Human mother2 = new Human("Maria", 53);
        Human mother3 = new Human("Olga", 64);
        Human mother4 = new Human("Vera", 32);
        Human mother5 = new Human("Nadezhda", 38);
        Human mother6 = new Human("Lyubov", 55);

        Human father1 = new Human("Ivan", 39);
        Human father2 = new Human("Petr", 44);
        Human father3 = new Human("Nikolay", 67);
        Human father4 = new Human("Pavel", 35);
        Human father5 = new Human("Kirill", 40);
        Human father6 = new Human("Vadim", 52);

        Human human1 = new Human("Alexey", 22);
        Human human2 = new Human("Artem", 26);
        Human human3 = new Human("Dasha", 45);
        Human human4 = new Human("Sasha", 15);
        Human human5 = new Human("Juli", 21);
        Human human6 = new Human("Mike", 27);

        human1.setMother(mother1);
        human1.setFather(father1);

        human2.setMother(mother2);
        human2.setFather(father2);

        human3.setMother(mother3);
        human3.setFather(father3);

        human4.setMother(mother4);
        human4.setFather(father4);

        human5.setMother(mother5);
        human5.setFather(father5);

        human6.setMother(mother6);
        human6.setFather(father6);

        List<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);
        humans.add(human6);

        System.out.println(humans);

        List<Human> parents = humans.stream()
                .filter(Objects::nonNull)
                .filter(human -> human.getFather() != null && human.getMother() != null)
                .flatMap(human -> Stream.of(human.getMother(), human.getFather()))
                .toList();
        System.out.println(parents);

        List<String> namesOfMothers = humans.stream()
                .filter(Objects::nonNull)
                .filter(human -> human.getMother() != null && human.getAge() > 25)
                .map(Human::getMother)
                .map(Human::getName)
                .toList();
        System.out.println(namesOfMothers);
    }
}
