package hw1;

import hw1.calculator.AbleToCalculatePension;

public class PensionFund {

    private String name;
    private boolean isState;
    private String dateCreation;
    private int quantityMembers;

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

    public void getInfo() {
        System.out.println(isState ? "Фонд государственный. Количество членов - " + quantityMembers / 1000 + " тысяч" : "Фонд негосударственный. Количество членов - " + quantityMembers);
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        double pensionCalculate = 0;
        if (isState) {
            pensionCalculate = obj.calculatePension();
        }
        return pensionCalculate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund fund = (PensionFund) o;

        if (isState != fund.isState) return false;
        if (quantityMembers != fund.quantityMembers) return false;
        if (!name.equals(fund.name)) return false;
        return dateCreation.equals(fund.dateCreation);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + dateCreation.hashCode();
        result = 31 * result + quantityMembers;
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", dateCreation='" + dateCreation + '\'' +
                ", quantityMembers=" + quantityMembers +
                '}';
    }
}
