package hw1;

public class PensionFund {

//    а) Именование пенсионного фонда
//    б) булеан переменная, явлется ли он государственным
//    в) Дата создания
//    г) количество участников фонда
//
//
//3) Добавьте сетеры и гетеры этому классу, заблокируйте прямой доступ к переменным.
//
//
//            4) Добавьте метод "info" - выводит информацию по фонду. Если фонд государственный, то информация
//            должна содержать строку о том, сколько ТЫСЯЧ человек используют фонд. Для не-государственных -
//            сколько человек используют фонд (не ТЫСЯЧ)
//
//
//5) Запретить менять дату создания фонда (отобрать сеттер)
    private String name;
    private boolean isState;
    private String dateCreation;
    int quantityMembers;

    public PensionFund(String name, boolean isState, String dateCreation, int quantityMembers) {
        this.name = name;
        this.isState = isState;
        this.dateCreation = dateCreation;
        this.quantityMembers = quantityMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }

    public String getDateCreation() {
        return dateCreation;
    }

//    public void setDateCreation(String dateCreation) {
//        this.dateCreation = dateCreation;
//    }

    public int getQuantityMembers() {
        return quantityMembers;
    }

    public void setQuantityMembers(int quantityMembers) {
        this.quantityMembers = quantityMembers;
    }

    public void getInfo(){
        System.out.println(isState ? "Фонд государственный. Количество членов - " + quantityMembers / 1000 + " тысяч" : "Фонд негосударственный. Количество членов - " + quantityMembers);
    }
}
