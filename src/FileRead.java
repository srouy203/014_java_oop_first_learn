import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args){
        try{
            File myFile = new File("FileWrite.txt");
            Scanner myReader = new Scanner(myFile);
            if(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                myReader.close();
            }
        }catch(IOException e){
            System.out.println("Some Error is happening");
        }

    }
}
