package src.textfile;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        executor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        executor.executeOperation(new CloseTextFileOperation(new TextFile("file2.txt")));

        executor.executeOperation(() -> "good job");

    }
}