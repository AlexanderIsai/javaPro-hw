package hw1;

import hw1.calculator.AbleToCalculatePension;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PensionFund {

    private String name;
    private boolean isState;
    private String dateCreation;
    //    private int quantityMembers;
    private List<Worker> members;

    private Map<DayOfWeek, Boolean> daysOfWeek;

    public PensionFund(String name, boolean isState, String dateCreation) {
        this.name = name;
        this.isState = isState;
        this.dateCreation = dateCreation;
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

    public List<Worker> getMembers() {
        return members;
    }

    public void setMembers(List<Worker> members) {
        this.members = members;
    }

    public Map<DayOfWeek, Boolean> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(Map<DayOfWeek, Boolean> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void getInfo() {
        int count = (members != null) ? members.size() : 0;
        System.out.println(isState ? "Фонд государственный. Количество членов - " + count / 1000 + " тысяч" : "Фонд негосударственный. Количество членов - " + count);
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        if (obj == null || daysOfWeek == null || !daysOfWeek.get(dayOfWeek)) {
            return 0.0;
        }
        double pensionCalculate = 0.0;
        if (isState) {
            pensionCalculate = obj.calculatePension();
        }
        return pensionCalculate;
    }

    public double calculateMedianPension(List<Worker> members) {
        if (members == null || members.size() == 0) {
            return 0.0;
        }
        double sumOfPension = 0;
        for (Worker member : members) {
            sumOfPension += calculatePensionFor(member);
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
        if (!Objects.equals(members, fund.members)) return false;
        return Objects.equals(daysOfWeek, fund.daysOfWeek);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (dateCreation != null ? dateCreation.hashCode() : 0);
        result = 31 * result + (members != null ? members.hashCode() : 0);
        result = 31 * result + (daysOfWeek != null ? daysOfWeek.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", dateCreation='" + dateCreation + '\'' +
                ", members=" + members +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }
}
