package Java.lesson17;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DocumentService {

    public List<Path> openFiles(String pathPackage, Integer countOfOpenFiles) {
        try {
            Stream<Path> filesStream = Files.find(Paths.get(pathPackage), Integer.MAX_VALUE,
                    ((pathFiles, attributes) -> pathFiles.toFile().getName().matches("\\w{4,8}.*.txt")));
            return filesStream.toList().stream().limit(countOfOpenFiles).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public Map<String, Document> writeFilesToMap(List<Path> files) {
        return files.stream().collect(Collectors.toMap(
                key -> key.getFileName().toString().replaceFirst("[.][^.]+$", ""),
                value -> {
                    try {
                        return new Document(Files.readAllLines(value, StandardCharsets.UTF_8));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return new Document(new ArrayList<>());
                })
        );
    }

    private boolean checkIsDocumentInvalid(Document document) {
        return document.getStrings().stream()
                .anyMatch(s -> !isDocumentNumberValid(s) && !isEmailValid(s) && !isPhoneNumberValid(s));
    }

    public int getNumberOfInvalidDocuments(Map<String, Document> documentMap) {
        return documentMap.values().stream().
                filter(this::checkIsDocumentInvalid).toList().size();
    }

    private boolean isPhoneNumberValid(String s) {
        Pattern pattern = Pattern.compile("^\\+\\(\\d\\d\\)\\d{7}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    private boolean isDocumentNumberValid(String s) {
        Pattern pattern = Pattern.compile("^\\d{4}-[a-zA-z]{3}-\\d{4}-[a-zA-z]{3}-\\d[a-zA-z]\\d[a-zA-z]$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    private boolean isEmailValid(String s) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{5,10}\\d{2,5}@gmail\\.com$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
