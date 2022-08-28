package Java.lesson12;

public class Main {

    public static void main(String[] args) {
        FileService fileService = new FileService();
        String[] linesArray = fileService.openFile().split("\n");
        fileService.checkNumberValid(linesArray);
        fileService.checkNumbersAndRewrite(linesArray);
    }
}
