package Java.lesson7.register;

import java.util.Date;

public class FinancialInvoice extends Document {

    double totalAmountForTheMonth;
    String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int documentNumber, Date documentDate, String departmentCode, double totalAmountForTheMonth)
    {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.departmentCode = departmentCode;
        this.totalAmountForTheMonth = totalAmountForTheMonth;
    }

    @Override
    public String toString() {
        return "Финансовая накладная {" +
                "номер документа = " + documentNumber +
                ", дата документа = " + documentDate +
                ", код департамента = '" + departmentCode + '\'' +
                ", общая сумма за месяц = " + totalAmountForTheMonth +
                '}';
    }
}