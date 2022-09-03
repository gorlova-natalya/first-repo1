package Java.lesson17;

import java.util.Map;
import java.util.Scanner;

public class MainHomework {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DocumentService documentService = new DocumentService();
//   .\src\RegexFiles\
        System.out.println("Введите адрес папки");
        String pathPackage = in.nextLine();
        System.out.println("Введите количество обрабатываемых документов ");
        int countOfOpenFiles = in.nextInt();
        Map<String, Document> documentMap = documentService.writeFilesToMap(documentService.openFiles(pathPackage,
                countOfOpenFiles));
        System.out.println(documentMap);
        System.out.println("Обработано " + documentMap.size() +
                " документов");
        System.out.println("Количество невалидных документов " +
                documentService.getNumberOfInvalidDocuments(documentMap));
    }
}
