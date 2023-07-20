package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public void writeInFile() {
        File file = new File("C:\\Users\\Manish\\IdeaProjects\\VariableDeer\\src\\test\\java\\FileHandling\\test");

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello from file");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }

    }
}
