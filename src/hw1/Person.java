package hw1;


//1)Создать класс Person.
public class Person {

//    а) Имя человека (выбрать самостоятельно тип данных)
//    б) Возраст человека (выбрать самостоятельно тип данных)
//    в) Рост (выбрать самостоятельно тип данных)
//    г) Вес (выбрать самостоятельно тип данных)

    String namePerson;
    int agePerson;
    int growthPerson;
    int weightPerson;

//    перед int money переменной поставить ключевое слово private. Описать, что произойдет в программе.
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

//    Добавить методы:
//    a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
//    б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"

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
//Добавить поле "money" и создать метод getMoney, который
//    делает return money (То есть просто возвращает количество денег у человека).

    public int howMuchMoneyHasPerson(){
        return moneyPerson;
    }
}
