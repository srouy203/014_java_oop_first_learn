import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args){
        try{
            FileWriter objFile = new FileWriter("FileWrite.txt");
            objFile.write("This is a new file write test.");
            objFile.close();
        }catch (IOException e){
            System.out.println("Have some issue");
            e.printStackTrace();
        }
    }
}
