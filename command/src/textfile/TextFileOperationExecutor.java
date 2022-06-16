package src.textfile;


import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private List<TextFileOperation> operations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        operations.add(textFileOperation);
        return textFileOperation.execute();
    }

}
