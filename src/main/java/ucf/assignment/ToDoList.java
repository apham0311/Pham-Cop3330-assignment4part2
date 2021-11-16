/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Anh Pham
 */
package ucf.assignment;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Item> items = new ArrayList<>();

    public int getSize(){
        return items.size();
    }

    public Item getItem(int i){
        return items.get(i);
    }


    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(int index) {
        this.items.remove(index);
    }

    public void clearList() {
        this.items.clear();
    }

    //Loops through the list and make new list with dates
    public ArrayList<LocalDate> getDates() {
        ArrayList<LocalDate> dateList = new ArrayList<>();
        for (Item item : items) {
            dateList.add(item.getItemDueDate());
        }
        return dateList;
    }

    ////Loops through the list and make new list with all status
    public ArrayList<Boolean> getComplete() {
        ArrayList<Boolean> completeList = new ArrayList<>();
        for (Item item : items) {
            completeList.add(item.getItemStatus());
        }
        return completeList;
    }

    ////Loops through the list and make new list with completed items
    public ArrayList<String> isComplete() {
        ArrayList<String> titleList = new ArrayList<>();
        for (Item item : items) {
            if (item.getItemStatus()) {
                titleList.add(item.getItemDescription());
            }
        }
        return titleList;
    }

    ////Loops through the list and make new list with incomplete items
    public ArrayList<String> isIncomplete() {
        ArrayList<String> titleList = new ArrayList<>();
        for (Item item : items) {
            if (!item.getItemStatus()) {
                titleList.add(item.getItemDescription());
            }
        }
        return titleList;
    }
}