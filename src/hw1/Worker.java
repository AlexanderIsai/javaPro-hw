package hw1;

import com.sun.jdi.DoubleValue;
import hw1.calculator.AbleToCalculatePension;
import hw1.calculator.CalculatorUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Set;


public class Worker extends Person implements AbleToCalculatePension {

    private final static double PERCENT_OF_PENSION = 0.25;
    private final static int QUANTITY_OF_PROFESSION = 3;
    private final static double COEFFICIENT_EXTRA_PROFESSION = 0.05;


    private double minSalary;
    private double maxSalary;
    private Set<Professions> professions;

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

    public Set<Professions> getProfessions() {
        return professions;
    }

    public void setProfessions(Set<Professions> professions) {
        this.professions = professions;
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
        if (getGender() == null || getProfessions() == null){
            return 0.0;
        }
        double averageSalary;
        System.out.println(professions.size() / QUANTITY_OF_PROFESSION);
        int coefficientOfProfession = professions.size() / QUANTITY_OF_PROFESSION;
        double pensionRatio = 1 + coefficientOfProfession * COEFFICIENT_EXTRA_PROFESSION;
        if (this.getGender().equals(Gender.MALE)) {
            averageSalary = CalculatorUtils.calculateAverage((int) minSalary, (int) maxSalary);
        } else {
            averageSalary = CalculatorUtils.calculateAverage((int) minSalary / 2, (int) maxSalary * 2);
        }
        BigDecimal temp = new BigDecimal(averageSalary * PERCENT_OF_PENSION * pensionRatio);
        temp = temp.setScale(2, RoundingMode.HALF_UP);
        double pension = temp.doubleValue();
        return pension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (Double.compare(worker.minSalary, minSalary) != 0) return false;
        if (Double.compare(worker.maxSalary, maxSalary) != 0) return false;
        return Objects.equals(professions, worker.professions);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(minSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (professions != null ? professions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", professions=" + professions +
                '}';
    }
}