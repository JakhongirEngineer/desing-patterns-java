package src.textfile;

public class TextFile {
    private String name;
    public TextFile(String name) {
        this.name = name;
    }
    public String open() {
        return "opens file: " + name;
    }
    public String close() {
        return "closes file: " + name;
    }
}