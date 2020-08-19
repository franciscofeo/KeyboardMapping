package br.com.praticas.KeyboardMappingProject.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Text {
    public String inputText;
    protected String filename;
    protected File myFile;

    public Text(String filename, String inputText){
        this.filename = filename;
        this.inputText = inputText;
        this.myFile = new File(this.filename);
    }

    public Text(String filename){
        this.filename = filename;
    }

    public void createTextFile(){


        try {
           if( myFile.createNewFile()){ // the .createNewFile returns a boolean
               myFile.createNewFile();
               System.out.println("File created: " + myFile);
           } else {
               System.out.println("This file already exists! Filename: " + this.filename);
           }
        } catch (IOException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

    public void writeTextFile(){
        try {
            FileWriter myFile = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(myFile);
            bw.write(this.inputText);
            bw.flush();
            bw.close();
            System.out.println("Writed!");
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
