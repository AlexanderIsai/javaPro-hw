package hw1;

public class Person {

    private String name;
    private int age;
    private int growth;
    private int weight;

    private int money;
// Идентификатор доступа private делает переменную приватной - т.е. доступной и видимой только в текущем классе
//    (Person). Также Идея хочет ее сделать константой (т.е. добавить ключевое слово final), однако, это не
//    влияет на тип доступа. Если переменная у нас приватная, мы не сможем получить к ней доступ напрямую
//    ЗА пределами класса. Но сможем - через методы)) - гетеры и сетеры. Гетеры помогут получить значение, а сетеры
//    установить новое значение. Этот подход позволяет сделать более безопасный и контролируемый доступ к переменным.

//    Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому

    public Person(String name, int age, int growth, int weight, int money) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.money = money;
    }

    public void getInfoAboutPerson(){
        System.out.println();
        System.out.println("Имя человека: " + name);
        System.out.println("Возраст человека: " + age + " лет");
        System.out.println("Рост человека: " + growth + " см");
        System.out.println("Вес человека: " + weight + " кг");
        System.out.println();
    }

    public void goToWork(){
        if (age < 18 || age > 70){
            System.out.println("отдыхаю дома");
        } else System.out.println("работаю");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getWeight() {
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
}
