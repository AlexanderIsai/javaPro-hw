package hw1;

public class Worker extends Person{

    double minSalary;
    double maxSalary;

    public Worker(String name, int age, int growth, int weight, int money, double minSalary, double maxSalary) {
        super(name, age, growth, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }
}
