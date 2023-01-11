import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab1no5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input file name (INPUT): ");
        String inputFileName = sc.nextLine();

        File inputFile = new File(inputFileName);

        try {
            Scanner reader = new Scanner(inputFile).useDelimiter("\r\n");

            System.out.print("Input file name (OUTPUT): ");
            String outputFileName = sc.nextLine();

            try {
                FileWriter fw = new FileWriter(String.format("C:\\Users\\admin\\Documents", outputFileName));
                while (reader.hasNext()){
                    String[] words = reader.next().split("\s");
                    for(String word : words){
                        char[] letters = word.toCharArray();
                        for(int i = letters.length - 1; i >= 0; i--){
                            fw.write(letters[i]);
                        }
                        fw.write(" ");
                    }
                    if(reader.hasNext())
                        fw.write("\n");
                }

                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }

            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        sc.close();
    }
}
