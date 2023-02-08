import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args){
        //Create file
        try{
            File newFile = new File("FileTest.txt");
            if(newFile.createNewFile()){
                System.out.println("File have created: " + newFile.getName());
            }else{
                System.out.println("File already exist.");
                System.out.println("File name: " + newFile.getName());
                System.out.println("File size: " + newFile.length());
                newFile.delete();       //Delete file
            }
        }catch (IOException e){
            System.out.println("Error with some issue");
            e.printStackTrace();
        }



    }

}
