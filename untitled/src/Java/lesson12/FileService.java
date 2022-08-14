package Java.lesson12;

import java.io.*;
import java.util.Scanner;

public class FileService {

    StringBuilder lines = new StringBuilder();

    public String openFile() {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        String line;
        try {
//           ./file.txt
            FileInputStream inputStreamReader = new FileInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStreamReader));
            while ((line = reader.readLine()) != null) {
                lines.append(line);
                lines.append("\n");
            }
            System.out.println(lines);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lines.toString();
    }

    public void checkNumbersAndRewrite(String[] linesArray) {
        try {
            new File("newFile.txt").createNewFile();
            new File("newFileInvalid.txt").createNewFile();
        } catch (Exception e) {
            System.out.println("Файл с таким именем уже существует");
        }
        try {
            FileWriter fileWriterValidNumbers = new FileWriter("newFile.txt");
            FileWriter fileWriterInvalidNumbers = new FileWriter("newFileInvalid.txt");
            for (String line : linesArray) {
                try {
                    checkNumber(line);
                    fileWriterValidNumbers.write(line + "\n");
                } catch (Exception e) {
                    fileWriterInvalidNumbers.write((line + " " + e.getMessage()) + "\n");
                }
            }
            fileWriterValidNumbers.close();
            fileWriterInvalidNumbers.close();

        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void checkNumberValid(String[] linesArray) {
        for (String s : linesArray) {
            try {
                startCheck(s);
                checkNumberLengthValid(s);
                System.out.println(s + " Номер валидный");
            } catch (Exception e) {
                System.out.println(s + " " + e.getMessage());
            }
        }
    }

    private void checkNumber(String s) {
        startCheck(s);
        checkNumberLengthValid(s);
    }

    private void checkNumberLengthValid(String s) {
        int numberLength = 15;
        if (s.length() != numberLength) {
            throw new IllegalArgumentException("Неподходящая длина");
        }
    }

    private void startCheck(String s) {
        if (!s.startsWith("docnum") && !s.startsWith("contract")) {
            throw new NumberFormatException("Строка не начинается с требуемых символов");
        }
    }
}
