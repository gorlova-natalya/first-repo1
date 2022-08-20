package Java.lesson13;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        List<String> fileList = new ArrayList<>();
        while (!path.equals("0")) {
            fileList.add(path);
            path = in.nextLine();
        }
        FileService fileService = new FileService();
        Set<String> documentNumbers = fileService.readLinesFromFiles(fileList);
        Map<String, String> numbersWithReport = fileService.checkNumbersWithReport(documentNumbers);
        fileService.writeToFile(numbersWithReport);
    }
}
