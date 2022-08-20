package Java.lesson13;

import java.io.*;
import java.util.*;

public class FileService {

    public Set<String> readLinesFromFiles(List<String> fileList) {
        String line;
        Set<String> lines = new HashSet<>();
        for (String path1 : fileList) {
            try {
                FileInputStream inputStreamReader = new FileInputStream(path1);
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStreamReader));
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return lines;
    }

    public Map<String, String> checkNumbersWithReport(Set<String> documentNumbers) {

        Map<String, String> documentNumbersToCommentMap = new HashMap<>();
        for (String line : documentNumbers) {
            try {
                checkNumber(line);
                documentNumbersToCommentMap.put(line, "Номер валидный");
            } catch (Exception e) {
                documentNumbersToCommentMap.put(line, e.getMessage());
            }
        }
        return documentNumbersToCommentMap;
    }

    public void writeToFile(Map<String, String> documentNumbersToCommentMap) {
        try {
            String fileName = "newFile.txt";
            new File(fileName).createNewFile();
            FileWriter fileWriterNumbers = new FileWriter(fileName);
            for (Map.Entry<String, String> entry : documentNumbersToCommentMap.entrySet()) {
                fileWriterNumbers.write(entry.getKey() + " " + entry.getValue() + "\n");
            }
            fileWriterNumbers.close();
        } catch (IOException e) {
            e.getStackTrace();
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
        String str1 = "docnum";
        String str2 = "contract";
        if (!s.startsWith(str1) && !s.startsWith(str2)) {
            throw new NumberFormatException("Строка не начинается с требуемых символов");
        }
    }

}
