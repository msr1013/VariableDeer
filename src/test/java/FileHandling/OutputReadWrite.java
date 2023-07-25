package FileHandling;

import java.io.BufferedWriter;

public class OutputReadWrite {
    public static void main(String[] args) {
//        FileReadWrite fileReadWrite = new FileReadWrite();
//        fileReadWrite.writeInFile();
        FileReadWrite fileReadWrite = new FileReadWrite();
        fileReadWrite.writeInFile();
        fileReadWrite.readFromFiles();
    }
}
