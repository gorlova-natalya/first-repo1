package Java.lesson17;

import java.util.List;

public class Document {

    private final List<String> strings;

    public Document(List<String> strings) {
        this.strings = strings;
    }

    public List<String> getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return strings + "\n";
    }
}
