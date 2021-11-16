/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Anh Pham
 */
package ucf.assignment;

import javafx.stage.FileChooser;
import java.io.*;
import java.util.ArrayList;

public class Manager {

    //allow user to open file
    public static String askOpenFile(){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(null);
        if (file != null){
            return file.getAbsolutePath();
        }
        return "";
    }

    //Let user save the file
    public static String askSaveFile(){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setTitle("Save File");
        File file = fileChooser.showSaveDialog(null);
        if (file != null){
            return file.getAbsolutePath();
        }
        return "";
    }

    public static void writeFile(String path, ToDoList list){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            String complete;
            for(int i=0; i<list.getSize(); i++){
                if (list.getItem(i).getItemStatus()){
                    complete = "Complete";
                } else {
                    complete = "Incomplete";
                }
                bw.write(String.format("%-10s %-2s %-10s %-2s %-10s %-2s \n",
                        list.getItem(i).makeItemDescription(), "|",
                        complete, "|",
                        list.getItem(i).makeItemDescription(), "|"));
            }
            bw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    //Read the file
    public static ArrayList<String> readFile(String path){
        ArrayList<String> ret = new ArrayList<>();
        try{
            BufferedReader br =  new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while(line != null){
                ret.add(line);
                line = br.readLine();
            }
            br.close();
        } catch(IOException e){
            return new ArrayList<>();
        }
        return ret;
    }
}
