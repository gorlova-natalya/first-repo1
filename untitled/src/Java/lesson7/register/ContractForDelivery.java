package Java.lesson7.register;

import java.util.Date;

public class ContractForDelivery extends Document {

    String productType;
    int AmountOfProduct;

    public ContractForDelivery() {
    }

    public ContractForDelivery(int documentNumber, Date documentDate, String productType, int amountOfProduct) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.productType = productType;
        this.AmountOfProduct = amountOfProduct;
    }

    @Override
    public String toString() {
        return "Контракт на поставку {" +
                "номер документа = " + documentNumber +
                ", дата документа = " + documentDate +
                ", тип товара = '" + productType + '\'' +
                ", количество товара = " + AmountOfProduct +
                '}';
    }
}
