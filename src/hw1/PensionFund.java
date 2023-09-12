package hw1;

import hw1.calculator.AbleToCalculatePension;

import java.util.ArrayList;
import java.util.Objects;

public class PensionFund {

    private String name;
    private boolean isState;
    private String dateCreation;
//    private int quantityMembers;
    private ArrayList<Worker> members = new ArrayList<Worker>();

    public PensionFund(String name, boolean isState, String dateCreation, int quantityMembers) {
        this.name = name;
        this.isState = isState;
        this.dateCreation = dateCreation;
//        this.quantityMembers = quantityMembers;
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

    public ArrayList<Worker> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Worker> members) {
        this.members = members;
    }

    public String getDateCreation() {
        return dateCreation;
    }

//    public void setDateCreation(String dateCreation) {
//        this.dateCreation = dateCreation;
//    }

//    public int getQuantityMembers() {
//        return quantityMembers;
//    }
//
//    public void setQuantityMembers(int quantityMembers) {
//        this.quantityMembers = quantityMembers;
//    }

    public void getInfo() {
        System.out.println(isState ? "Фонд государственный. Количество членов - " + getMembers().size() / 1000 + " тысяч" : "Фонд негосударственный. Количество членов - " + getMembers().size());
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if(obj == null){
            return 0.0;
        }
        double pensionCalculate = 0.0;
        if (isState) {
            pensionCalculate = obj.calculatePension();
        }
        return pensionCalculate;
    }

    public double calculateMedianPension(ArrayList<Worker> members){
        if(members == null || members.size() == 0){
            return 0.0;
        }
        double sumOfPension = 0;
        for (Worker member: members) {
            sumOfPension += member.calculatePension();
        }
        return sumOfPension / members.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund fund = (PensionFund) o;

        if (isState != fund.isState) return false;
        if (!Objects.equals(name, fund.name)) return false;
        if (!Objects.equals(dateCreation, fund.dateCreation)) return false;
        return Objects.equals(members, fund.members);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (dateCreation != null ? dateCreation.hashCode() : 0);
        result = 31 * result + (members != null ? members.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", dateCreation='" + dateCreation + '\'' +
                ", members=" + members +
                '}';
    }
}
