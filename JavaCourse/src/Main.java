import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g, images, audio files)

        String filePath = "C:\\Users\\Ringw\\Desktop\\test.txt";
        String textContent = """
                This file is pretty cool!
                It is written as a multiline String :)
                Therefor it is easier to write longer text!
                """;

        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("File has been succesfully written!");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location!");
        }
        catch (IOException e) {
            System.out.println("Could not write file!");
        }

    }
}
