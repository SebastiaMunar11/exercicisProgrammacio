package com.company.les10;

public class OrderTest {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        Order order = new Order();
        double totalCost = 0.0;

        shirt.price = 14.99;
        System.out.println("Total price is: " + order.addShirt(shirt));




    }

}
