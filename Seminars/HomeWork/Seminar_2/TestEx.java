package Seminars.HomeWork.Seminar_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestEx {
    public static void main(String[] args) {
        try {
            Path TestFile1 = Files.createFile(Paths.get("Seminars/HomeWork/Seminar_2/NewFile.txt"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}