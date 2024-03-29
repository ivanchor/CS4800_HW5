package org.example;

public class foodWithSauce implements food{

    private food foodTopping;

    public foodWithSauce(food food)
    {
        this.foodTopping = food;
    }

    public double getPrice()
    {

        return foodTopping.getPrice() + 2.50;
    }
}
