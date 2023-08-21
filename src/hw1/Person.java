package hw1;

public class Person {

    private String namePerson;
    private int agePerson;
    private int growthPerson;
    private int weightPerson;

    private int moneyPerson;
// Идентификатор доступа private делает переменную приватной - т.е. доступной и видимой только в текущем классе
//    (Person). Также Идея хочет ее сделать константой (т.е. добавить ключевое слово final), однако, это не
//    влияет на тип доступа. Если переменная у нас приватная, мы не сможем получить к ней доступ напрямую
//    ЗА пределами класса. Но сможем - через методы)) - гетеры и сетеры. Гетеры помогут получить значение, а сетеры
//    установить новое значение. Этот подход позволяет сделать более безопасный и контролируемый доступ к переменным.

//    Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому

    public Person(String namePerson, int agePerson, int growthPerson, int weightPerson, int moneyPerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.growthPerson = growthPerson;
        this.weightPerson = weightPerson;
        this.moneyPerson = moneyPerson;
    }

    public void getInfoAboutPerson(){
        System.out.println();
        System.out.println("Имя человека: " + namePerson);
        System.out.println("Возраст человека: " + agePerson + " лет");
        System.out.println("Рост человека: " + growthPerson + " см");
        System.out.println("Вес человека: " + weightPerson + " кг");
        System.out.println();
    }

    public void goToWork(){
        if (agePerson < 18 || agePerson > 70){
            System.out.println("отдыхаю дома");
        } else System.out.println("работаю");
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }

    public int getGrowthPerson() {
        return growthPerson;
    }

    public void setGrowthPerson(int growthPerson) {
        this.growthPerson = growthPerson;
    }

    public int getWeightPerson() {
        return weightPerson;
    }

    public void setWeightPerson(int weightPerson) {
        this.weightPerson = weightPerson;
    }

    public int getMoneyPerson() {
        return moneyPerson;
    }

    public void setMoneyPerson(int moneyPerson) {
        this.moneyPerson = moneyPerson;
    }
}
