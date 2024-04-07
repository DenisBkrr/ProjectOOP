package Project;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

    public class FileOpener {
        public static void main(String[] args) {
            File file = new File("C:\\Users\\denis\\Desktop\\ProjectOOP\\src\\Project\\file.txt");

            try (FileReader fr = new FileReader(file)) {
                int character;
                while ((character = fr.read()) != -1) {
                    System.out.print((char) character);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

