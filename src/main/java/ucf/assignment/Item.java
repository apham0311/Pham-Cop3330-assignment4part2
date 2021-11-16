/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Anh Pham
 */
package ucf.assignment;

import java.time.LocalDate;
import java.util.ArrayList;

public class Item {
    private boolean itemStatus;
    private String itemDescription;
    private LocalDate itemDueDate;

    public void makeItemStatus(boolean itemStatus){
        this.itemStatus = itemStatus;
    }

    public boolean getItemStatus(){
        return itemStatus;
    }

    public void makeItemDescription(String itemDescription){
        if (itemDescription.length() < 256){
            this.itemDescription = itemDescription;

        } else {
            this.itemDescription = itemDescription.substring(0, 256);
        }
    }

    public String getItemDescription(){
        return itemDescription;
    }

    public void makeItemDueDate(LocalDate itemDueDate){
        //use GUI to set Date from User
        this.itemDueDate = itemDueDate;
    }

    public LocalDate getItemDueDate(){
        return itemDueDate;
    }

    public void fileToItem(ArrayList<String> list, int i){
        String[] splitArray = list.get(i).split("\\|");
        makeItemDescription(splitArray[0].trim());
        makeItemStatus(splitArray[1].trim().equals("Complete"));
        makeItemDueDate(LocalDate.parse(splitArray[2].trim()));
    }
}