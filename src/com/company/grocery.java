package com.company;
public class grocery{
    private String itemName;
    private double price;
    private int quantity;

    public grocery(){
    }
    public grocery(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static double cost(double price, int quantity){
        double totalcost = price*quantity;
        return totalcost;
    }
}

