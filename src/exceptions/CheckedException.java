package exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
//Example for CheckedException which is raised at compile time itself

public class CheckedException {
    private static  final Logger log= LoggerFactory.getLogger(CheckedException.class);

    public static void display(){

        try {
            var file=new FileReader("file.txt"); //should be put inside try and catch block
            log.info("File Opened");


        } catch (FileNotFoundException ex) {
            log.error("File Not Found");
            System.out.println(ex.getMessage());

        }


    }
}
