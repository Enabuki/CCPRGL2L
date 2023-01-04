import java.io.*;
import java.util.Scanner;

public class lab1no4 {
    
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the file name: ");
    String fileName = scanner.nextLine();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      int wordCount = 0;
      while ((line = reader.readLine()) != null) {
        String[] words = line.split(" ");
        wordCount += words.length;
      }
      System.out.println("Total number of words: " + wordCount);
    } catch (IOException e) {
      System.out.println("There's an error in the code");
    }
  }
}
