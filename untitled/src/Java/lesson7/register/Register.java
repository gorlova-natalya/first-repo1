package Java.lesson7.register;

public class Register implements Executable {

    Document[] savedDocuments = new Document[10];
    int countDocuments = 0;

    @Override
    public void savingDocument(Document... documents) {
        for (Document document : documents) {
            savedDocuments[countDocuments] = document;
            countDocuments++;
        }
        System.out.println("Сохранено успешно " + countDocuments + " документов.");
    }

    @Override
    public void providingInformation() {
        for (int i = 0; i < countDocuments; i++) {
            System.out.println("Документ " + savedDocuments[i]);
        }
    }
}