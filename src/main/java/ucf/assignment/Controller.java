/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Anh Pham
 */
package ucf.assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    private final ToDoList itemList = new ToDoList();
    @FXML
    private ListView<String> toDoListItems;

    @FXML
    private TextField itemDescription;

    @FXML
    private RadioButton isComplete;

    @FXML
    private DatePicker itemDue;

    @FXML
    private RadioButton showCompleteItems;

    @FXML
    private ListView<String> completeItems;

    @FXML
    private ListView<LocalDate> toDoListDates;

    //Add item to the list
    public void addList() {
        Item item = new Item();
        item.makeItemDescription(itemDescription.getText());
        if (itemDue.getValue() != null) {
            item.makeItemDueDate((itemDue.getValue()));
        } else {
            item.makeItemDescription("ERROR, Please Input valid date");
        }
        item.makeItemStatus(isComplete.isSelected());
        itemList.addItem(item);
        setToDoListItems();
        resetList();
    }

    //This will allow list to be open
    public void openList() {
        String path = Manager.askOpenFile();
        ArrayList<String> fileList = Manager.readFile(path);
        if (!path.equals("")) {
            for (int i = 0; i < fileList.size(); i++) {
                Item item = new Item();
                item.fileToItem(fileList, i);
                itemList.addItem(item);
            }
        }
        setToDoListItems();
    }

    //This will clear item from the list
    public void clearList() {
        itemList.clearList();
        toDoListItems.getItems().clear();
        completeItems.getItems().clear();
        toDoListDates.getItems().clear();
        resetList();
    }

    //Remove items from the list
    public void removeList() {
        //item is removed from the to do list
        try {
            if (toDoListItems.getSelectionModel().isEmpty()) {
                itemList.removeItem(toDoListDates.getSelectionModel().getSelectedIndex());

            } else {
                itemList.removeItem(toDoListItems.getSelectionModel().getSelectedIndex());
            }

        } catch (IndexOutOfBoundsException e) {
            Item item = new Item();
            item.makeItemDescription("ERROR, Please select item to remove");
            itemList.addItem(item);
        }
        setToDoListItems();
        resetList();
    }

    //Set the status of the item
    public void setStatus() {
        if (showCompleteItems.isSelected()) {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isComplete());
            completeItems.setItems(list);
        } else {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isIncomplete());
            completeItems.setItems(list);
        }
    }


    public void setToDoListItems() {
        ObservableList<String> titleList = FXCollections.observableArrayList(itemList.getTitles());
        toDoListItems.setItems(titleList);
        ObservableList<String> completeList = FXCollections.observableArrayList(itemList.isIncomplete());
        completeItems.setItems(completeList);
        ObservableList<LocalDate> dateList = FXCollections.observableArrayList(itemList.getDates());
        toDoListDates.setItems(dateList);
    }

    //Reset the list
    public void resetList() {
        itemDescription.clear();
        itemDue.setValue(null);
        isComplete.setSelected(false);
        showCompleteItems.setSelected(false);
    }

    //This will edit the list
    public void editList() {
        try {
            if (!toDoListItems.getSelectionModel().isEmpty()) {
                itemDescription.setText(toDoListItems.getSelectionModel().getSelectedItem());
                itemDue.setValue(itemList.getDates().get(toDoListItems.getSelectionModel().getSelectedIndex()));
                isComplete.setSelected(itemList.getComplete().get(toDoListItems.getSelectionModel().getSelectedIndex()));
                itemList.removeItem(toDoListItems.getSelectionModel().getSelectedIndex());
            }
            if (!toDoListDates.getSelectionModel().isEmpty()) {
                itemDescription.setText(itemList.getItem(toDoListDates.getSelectionModel().getSelectedIndex()).getItemDescription());
                itemDue.setValue(itemList.getItem(toDoListDates.getSelectionModel().getSelectedIndex()).getItemDueDate());
                isComplete.setSelected(itemList.getItem(toDoListDates.getSelectionModel().getSelectedIndex()).getItemStatus());
                itemList.removeItem(toDoListDates.getSelectionModel().getSelectedIndex());
            }
            if (!completeItems.getSelectionModel().isEmpty()) {
                itemDescription.setText(itemList.getItem(completeItems.getSelectionModel().getSelectedIndex()).getItemDescription());
                itemDue.setValue(itemList.getItem(completeItems.getSelectionModel().getSelectedIndex()).getItemDueDate());
                isComplete.setSelected(itemList.getItem(completeItems.getSelectionModel().getSelectedIndex()).getItemStatus());
                itemList.removeItem(completeItems.getSelectionModel().getSelectedIndex());
            }
        } catch (IndexOutOfBoundsException e) {
            Item item = new Item();
            item.makeItemDescription("ERROR, Select item to edit");
            itemList.addItem(item);
        }

        setToDoListItems();
    }

    public void saveList() {
        String path = Manager.askSaveFile();
        if (!path.equals("")) {
            Manager.writeFile(path, itemList);
        }

    }

}