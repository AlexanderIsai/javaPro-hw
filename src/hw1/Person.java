package hw1;

public abstract class Person {

    private String name;
    private int age;
    private int growth;
    private double weight;
    private int money;
    private Gender gender;

    public Person(String name, int age, int growth, double weight, int money) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.money = money;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfoAboutPerson() {
        System.out.println();
        System.out.println("Имя человека: " + name);
        System.out.println("Возраст человека: " + age + " лет");
        System.out.println("Рост человека: " + growth + " см");
        System.out.println("Вес человека: " + weight + " кг");
        System.out.println();
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("отдыхаю дома");
        } else System.out.println("работаю");
    }

    public void die() {
        System.out.println("Человек погиб");
    }

    public abstract void die(int years);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (growth != person.growth) return false;
        if (weight != person.weight) return false;
        if (money != person.money) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + growth;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + money;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                ", weight=" + weight +
                ", money=" + money +
                '}';
    }
}
