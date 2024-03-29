package org.example;

public class driver
{
    public static void main(String[] args){
        food burger = new burger();
        food fry = new fries();
        food hotdog = new hotdog();
        order order = new order();
        loyalty loyalty = new loyalty();


        System.out.printf("\nBurger base price: $%.2f", burger.getPrice());
        System.out.printf("\nFries base price: $%.2f", fry.getPrice());
        System.out.printf("\nHotdog base price: $%.2f", hotdog.getPrice());



        order.addOrder(new foodWithOnion(fry));
        order.addOrder(new foodWithSauce(hotdog));
        order.addOrder(burger);
        System.out.printf("\nOrder 1: $%.2f\n",  order.orderCost());


        System.out.println(loyalty.goldLoyalty(order));
        System.out.println(loyalty.silverLoyalty(order));
        System.out.println(loyalty.bronzeLoyalty(order));


    }

}
