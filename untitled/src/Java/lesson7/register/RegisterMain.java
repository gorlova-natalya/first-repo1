package Java.lesson7.register;

import java.util.Calendar;
import java.util.Date;

public class RegisterMain {
    public static void main(String[] args) {

        Register register = new Register();

        Document contractForDelivery = new ContractForDelivery(6789, new Date(122, Calendar.JULY,
                1), "фрукты", 7800);
        Document employmentContract = new EmploymentContract(765, new Date(122, Calendar.JULY,
                17), "John", new Date(122, Calendar.JANUARY, 10), new Date(123,
                Calendar.JANUARY, 9));
        Document employmentContract1 = new EmploymentContract();
        Document contractForDelivery1 = new ContractForDelivery();
        Document financialInvoice = new FinancialInvoice(175, new Date(122, Calendar.JUNE,
                15), "123", 12345.00);
        Document financialInvoice1 = new FinancialInvoice();
        Document financialInvoice2 = new FinancialInvoice();
        Document financialInvoice3 = new FinancialInvoice();

        register.savingDocument(contractForDelivery, employmentContract, employmentContract1, contractForDelivery1,
                financialInvoice, financialInvoice1, financialInvoice2, financialInvoice3);

        register.providingInformation();
    }
}
