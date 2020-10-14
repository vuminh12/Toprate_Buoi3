package readfile;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;



public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        Scanner sc = null;

        Function function = new Function();

        // doc file
        try {
            inputStream = new FileInputStream("/Users/mac/Downloads/Training_toprate/Buoi3/input.txt");
            sc = new Scanner(inputStream, "UTF-8");
            // doc tung dong
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                function.Split(line);
                }

            function.Compare();
            function.Count();
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
    }

}
