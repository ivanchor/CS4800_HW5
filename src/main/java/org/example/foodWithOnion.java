package org.example;

public class foodWithOnion implements food{

    private food foodTopping;

    public foodWithOnion(food food)
    {
        this.foodTopping = food;
    }

    public double getPrice()
    {

        return foodTopping.getPrice() + 0.50;
    }
}
