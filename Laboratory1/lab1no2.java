import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


    public class lab1act2 
    {
    public static void main(String [] args) throws IOException
    {
        
        String fileName = "D:\\Programming\\lab1\\activity\\activity\\src\\dummy.txt";

        String line = null;

            BufferedReader bufferedReader = 
                new BufferedReader(new FileReader(fileName));

            int i = 0;
            try {
                
                while(((line = bufferedReader.readLine()) != null) && i < 5) {
                    System.out.println(line);
                    i++;
                }   
            }
            finally {   
                bufferedReader.close();         
            }

        }
    }
