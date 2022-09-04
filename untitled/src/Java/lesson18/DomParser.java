package Java.lesson18;

import org.w3c.dom.Document;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;


public class DomParser {
    public void domParseAndWrite (File file) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        String fileName;
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(file);
            doc.getDocumentElement().normalize();
            String firstName = doc.getDocumentElement().getElementsByTagName("firstName").item(0).getTextContent();
            String lastName = doc.getDocumentElement().getElementsByTagName("lastName").item(0).getTextContent();
            String title = doc.getDocumentElement().getElementsByTagName("title").item(0).getTextContent().replace(" ", "");
            fileName = firstName + "_" + lastName + "_" + title + ".txt";
            new File(fileName).createNewFile();
            FileWriter fileWriter = new FileWriter(fileName);
            String line = doc.getDocumentElement().getElementsByTagName("lines").item(0).getTextContent();
            System.out.println(line);
            fileWriter.write(line);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

