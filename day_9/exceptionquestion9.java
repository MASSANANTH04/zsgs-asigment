package day_9;

import java.io.FileNotFoundException;
import java.io.FileReader;

//question 9
public class exceptionquestion9 {
    public static void main(String[] args) {
        try{
        FileReader f=new FileReader("ananth");
        }
        catch(FileNotFoundException r){
            System.out.println("File Not Found "+r.getMessage());
        }

    }
}
