package ucf.assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDolist.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Assignment 4");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Manager{
    // This will create a to do list hashmap variable
    // Will also create a currentList array list variable

    public ArrayList<item> getTodo(String name){
        ArrayList<item> currentList = new ArrayList<item>();
        // Access needed ArrayList using name
        // Make the currentList to the new list
        // Return currentList
        return currentList;
    }

    // Method to get Hashmap
    public HashMap<String, ArrayList<item>> getMap(){
        HashMap<String, ArrayList<item>> todoLists = new HashMap<>();

        // Return todoLists
        return todoLists;
    }

    //This will add new list to the map using their names
    public void addTodo(String name){

    }

    //Remove list from the map by name
    public void removeList(String name){

    }

    //Edit the name of the list
    public void editList(String nameOld, String nameNew){

    }

    // Save the list to an external storage
    public void saveListAll(ArrayList<item> list, String name){
        // 1)create file
        // 2)interate it through the map
        // 3)Use a for loop to go through the list
        // 4)Output each item to the newly created file
        // 5)Close file
    }

    // This will help load in the list into the file
    public void loadList(String file){
        //1)Open a file
        //2)Use a for loop to go through the list until it reach EOF
        //3) Add to new list
        //4) Add list to the file
    }
}

class list{

    //THis will allow user to get a specific item in the list
    public item getItem(String number, ArrayList<item> list){
        item placeholderItem = new item("1", "2");


        return placeholderItem;
    }

    // Display all the items in the list
    public String displayAll(ArrayList<item> list){
        //1)Use a for loop to run through the list
        //2)Store all items
        //3)getter function
        //4)end loop
        return "Items";
    }

    // Display all incomplete items if needed
    public String displayIncomplete(ArrayList<item> list){
        // 1)Use a for loop to run through the list
        // 2)If item status is incomplete it will be store in a seperate string
        // end loop
        return "incomplete";
    }

    // Display only completed list
    public String displayComplete(ArrayList<item> list){
        // 1)Use a for loop to run through the list
        // 2)Store the comleted item in a seperate string
        // end loop
        return "Completed";
    }

    // Save the list to a storage
    public void saveList(ArrayList<item> list, String name){
        // Create a new file based on name
        // For loop through the list for the length of the list
        // Output each item to the newly created file
        // Close file
    }

    // Add items to the list
    public void addItem(ArrayList<item> list){
        // 1)Create new item
        // 2) Ask the user for new item info
        // 3) add it to the list
    }

    // Remove an item from the list
    public void removeItem(ArrayList<item> list, String name){
        // Remove item specified by name from the list
    }
}

class item{
    // Create private variables "description," "dueDate," and "status"
    public item(String status, String due){
        // Set info for due date and status
    }

    // THis will allow you to edit the items descriptions
    public void editDescription(String newDescription){

    }

    // Edits previous due dates to new due dates
    public void editDate(String newDate){

    }

    // Changes the status to complete
    public void completion(){

    }

    // Get the description of the item
    public String getDescription(){

        return "Description";
    }

    // Allow user to get the due date
    public String getDate(){

        return "Due Date";
    }

    // Get the status
    public String getStatus(){

        return "status";
    }
}
