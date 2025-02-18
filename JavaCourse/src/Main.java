import java.io.*;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args)  {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputSteam: Best for binary files (e.g, images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\Ringw\\Desktop\\test.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e){
            System.out.println("File could not be found!");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }

    }
}
