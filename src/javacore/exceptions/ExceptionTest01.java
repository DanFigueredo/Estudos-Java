package javacore.exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createFile();
    }

    private static void createFile(){
        File file = new File("file\\text.txt");

        try{
            boolean isCreate = file.createNewFile();
            System.out.println("File created with successful");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

