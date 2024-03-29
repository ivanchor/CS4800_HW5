package org.example;

import java.util.ArrayList;

public class order
{
    private ArrayList<food> orderList = new ArrayList<food>();

    public void addOrder(food food)
    {
        orderList.add(food);
    }

    public double orderCost()
    {
        double cost = 0;
        for (org.example.food food : orderList) {
            cost += food.getPrice();
        }
        return cost;
    }
}
