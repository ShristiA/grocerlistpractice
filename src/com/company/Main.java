package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double userPrice;
        int userQuantity;
        double amount = 0;
        ArrayList<grocery> groceryList = new ArrayList<>();

        int i=0;
        String userAns = "y";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the itemname");
            String userItem = sc.next();
            System.out.println("enter the price");
            userPrice = sc.nextDouble();
            System.out.println("enter the quantity");
            userQuantity = sc.nextInt();

            groceryList.add(new grocery(userItem, userPrice, userQuantity));

            System.out.println("would you like to enter another item?y-yes or n-no");
            userAns = sc.next();
            i++;
        }while(!userAns.equalsIgnoreCase("n"));

        System.out.println("itemname"+"\t"+"price"+ "\t"+"Quantity"+"\t"+"cost");
    for(grocery gc : groceryList) {

        System.out.println(gc.getItemName()+"\t"+gc.getPrice()+"\t"+gc.getQuantity()+ "\t"+ gc.cost(userPrice, userQuantity));

        amount = amount + gc.cost(userPrice, userQuantity);

    }
        System.out.println("total amount purchased = $"+amount);
        System.out.println("number of items:" + i);
    }
}
