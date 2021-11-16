package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.ScrollEvent;

public class Controller {
    private TextArea textArea;

    @FXML
    public String userInputEntered(ActionEvent actionEvent) {

        return "User input";
    }

    @FXML
    public void textAreaScroll(ScrollEvent scrollEvent) {
        //Let the user have more accessibility with screen through scrolling
    }

    @FXML
    public void addListClick(ActionEvent actionEvent) {
        // 1)Ask the user info for the list
        // 2)create list with the neccesary parameters
        // 3)Add the list to the map
    }

    @FXML
    public void removeListClick(ActionEvent actionEvent) {
        // 1)Ask the user for the name of list
        // Remove the list from the map
    }

    @FXML
    public void loadListClick(ActionEvent actionEvent) {
        // 1)Ask the user if what mode they want
        // 2)As the user for the file name
        // 3)load the file into the list
        // 4) add list to the map
    }

    @FXML
    public void saveAllClick(ActionEvent actionEvent) {
        // 1)Ask the user for the file name
        // 2)Translate it for the code to run
        // 3)output to file
    }

    @FXML
    public void editListClick(ActionEvent actionEvent) {
        // 1)Ask the user what list need to be change
        // 2)Ask for a new name
        // 3)Copy the original list with new name
        // 4)Add the new list to the map
        // 5)Replace the old list
    }

    @FXML
    public void addItemClick(ActionEvent actionEvent) {
        // 1)Create new item
        // 2)Ask user new item info
        // 3)Add item to list
    }

    @FXML
    public void printCompClick(ActionEvent actionEvent) {
        // 1)Ask the user what list they want to print
        // 2)Output
    }

    @FXML
    public void saveListClick(ActionEvent actionEvent) {
        // 1)Ask the user for list they want save
        // 2)Ask user for the name of file
        // 3)open file
        // 4)Write it to the file to be save
    }

    @FXML
    public void removeItemClick(ActionEvent actionEvent) {
        // Prompt the user for the item and the list
        // the item resides in
        // Remove the item from the list
    }

    @FXML
    public void printIncompleteClick(ActionEvent actionEvent) {
        // 1)Ask user what the need to print
        // 2)output
    }

    @FXML
    public void editItemClick(ActionEvent actionEvent) {
        // 1)Ask user that they want to change and location in list
        // 2)Ask the edit
        // 3)edit
    }

    @FXML
    public void completeItemClick(ActionEvent actionEvent) {
        // 1)Ask user for list and item
        // 2)make it complete
    }

    @FXML
    public void printAllClick(ActionEvent actionEvent) {
        // 1)Ask user what they want to print
        // 2)Output
    }
}
}
