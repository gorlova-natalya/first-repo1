package Java.lesson7.register;

import java.util.Date;

public class EmploymentContract extends Document {

    String nameEmployee;
    Date contractStartDate;
    Date contractEndDate;

    public EmploymentContract() {
    }

    public EmploymentContract(int documentNumber, Date documentDate, String nameEmployee, Date contractStartDate,
                              Date contractEndDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.nameEmployee = nameEmployee;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
    }

    @Override
    public String toString() {
        return "Контракт с работником {" +
                "номер документа = " + documentNumber +
                ", дата документа = " + documentDate +
                ", Имя работника = '" + nameEmployee +
                ", дата начала контракта = " + contractStartDate +
                ", дата окончания контракта = " + contractEndDate +
                '}';
    }
}