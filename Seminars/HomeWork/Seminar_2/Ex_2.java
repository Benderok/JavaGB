// Создать файл с названием file.txt. Если файл уже есть, то создавать не надо 
// Записать в него Слово "TEXT" 100 раз

package Seminars.HomeWork.Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class Ex_2 {
    public static void main(String[] args) throws IOException {
    //     String line = "empty";
    //     try {
    //         String fileSeparator = System.getProperty("file.separator");
    //         String pathFile = fileSeparator + "Users" + fileSeparator + "valentinpanferin" + fileSeparator + "JavaGB" + fileSeparator + "Seminars" + fileSeparator + "HomeWork" + fileSeparator + "Seminar_2" + fileSeparator + "file.txt";
    //         File file = new File(pathFile);
            
    //         if (file.createNewFile()) {
    //             System.out.println("file.created");
    //         }
    //         else {
    //             System.out.println("file.existed");
    //             FileWriter fileWriter = new FileWriter(file, true);
    //             fileWriter.write("TEXT ".repeat(100));

    //             fileWriter.append(System.lineSeparator());

    //             fileWriter.flush();
    //             fileWriter.close();
    //         }
    //     } catch (Exception e) {
    //     } finally {
    //         System.out.println(line);
    //     }
    // }

    Path of = Path.of("Seminars", "HomeWork", "Seminar_2", "TEXT.txt");
    try {
        Files.createFile(of);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    // Path of = Path.of("TEXT.txt");
    Files.writeString(of, "Hello MY Friends! \n". repeat(50));
}
}