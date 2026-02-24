package Exercise5;

import java.io.FileReader;
import java.io.IOException;

public class FileReadExampleSimple {

    
    public static void readFile(String fileName) {
        FileReader fr = null;
        try {
            fr = new FileReader(fileName); 
            int ch;
            while ((ch = fr.read()) != -1) { 
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        } finally {
            try {
                if (fr != null) fr.close(); 
            } catch (IOException e) {
                System.out.println("Error closing file: " + fileName);
            }
            System.out.println("\nFinished file processing: " + fileName);
        }
    }

    public static void main(String[] args) {
        
        readFile("tryhackme.txt");
        readFile("nonexistent.txt");
      
    }
}