package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    File file = new File("C:\\Users\\Manish\\IdeaProjects\\VariableDeer\\src\\test\\java\\FileHandling\\test");

    public void writeInFile() {

        System.out.println("Enter words to write in file: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(" " + input);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
        public void readFromFiles () {
            File file = new File("C:\\Users\\Manish\\IdeaProjects\\VariableDeer\\src\\test\\java\\FileHandling\\test");

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String readFile;
                while ((readFile = bufferedReader.readLine())!=null){
                    System.out.println(readFile);
                }
            } catch (IOException e){
                System.out.println("cannot read from file");
            }

        }

    }



