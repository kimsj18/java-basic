package day0204.exception.ex2;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {
        FileWriter file = null;

        try {
            file = new FileWriter("data.text");
            file.write("Java Advanced Programming다");
            file.write("Java Advanced Programming다");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
