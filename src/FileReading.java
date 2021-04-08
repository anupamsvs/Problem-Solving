import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\aajit001\\Downloads\\Filereader_Test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
