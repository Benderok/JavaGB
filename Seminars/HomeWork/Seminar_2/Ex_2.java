// Создать файл с названием file.txt. Если файл уже есть, то создавать не надо 
// Записать в него Слово "TEXT" 100 раз

package Seminars.HomeWork.Seminar_2;

import java.io.File;
import java.io.FileWriter;

public class Ex_2 {
    public static void main(String[] args) {
        String line = "empty";
        try {
            String fileSeparator = System.getProperty("file.separator");
            String pathFile = fileSeparator + "Users" + fileSeparator + "valentinpanferin" + fileSeparator + "JavaGB" + fileSeparator + "Seminars" + fileSeparator + "HomeWork" + fileSeparator + "Seminar_2" + fileSeparator + "file.txt";
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("TEXT ".repeat(100));

                fileWriter.append(System.lineSeparator());

                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e) {
        } finally {
            System.out.println(line);
        }
    }
}
