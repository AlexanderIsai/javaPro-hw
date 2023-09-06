package hw1;

import hw1.calculator.AbleToCalculatePension;
import hw1.calculator.CalculatorUtils;


public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;

    public Worker(String name, int age, int growth, double weight, int money, double minSalary, double maxSalary) {
        super(name, age, growth, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker() {
    }

    public Worker(String name, int age, double minSalary, double maxSalary) {
        super(name, age);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + " лет");
    }


    @Override
    public double calculatePension() {
        double averageSalary;
        if (this.getGender().equals(Gender.MALE)) {
            averageSalary = CalculatorUtils.calculateAverage((int) minSalary, (int) maxSalary);
        } else {
            averageSalary = CalculatorUtils.calculateAverage((int) minSalary / 2, (int) maxSalary * 2);
        }
        return averageSalary * 0.25;
    }
}