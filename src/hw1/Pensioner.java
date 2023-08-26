package hw1;

public class Pensioner extends Person {

    double pension;

    public Pensioner(String name, int age, int growth, int weight, int money, double pension) {
        super(name, age, growth, weight, money);
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() - 50) * pension);
    }
}
