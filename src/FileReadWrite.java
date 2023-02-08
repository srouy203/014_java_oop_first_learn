import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args){
        //write file
        try{
            File objFile = new File("ReadWrite.txt");
            if(objFile.createNewFile()){
                System.out.println("File created name: " + objFile.getName());
            }else{
                System.out.println("File: " + objFile.getName() + " have been created.");
            }

        }catch(IOException e){
            System.out.println("Some occur is on the way");
            e.printStackTrace();
        }

        //Read File
        try{
            FileWriter objWrite = new FileWriter("ReadWrite.txt");
            objWrite.write("This is my new file");
            objWrite.close();
            System.out.println("File have be written...");
        }catch (IOException e){
            System.out.println("Can't write data to file");
            e.printStackTrace();
        }

        //read
        try{
            File objRead = new File("ReadWrite.txt");
            Scanner objData = new Scanner(objRead);
            if(objData.hasNextLine()){
                String data = objData.nextLine();
                System.out.println(data);
                objData.close();
            }
        }catch(IOException e){
            System.out.println("Can't read file");
            e.printStackTrace();
        }
    }
}
