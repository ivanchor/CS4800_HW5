package org.example;

public class loyalty
{

    public String goldLoyalty(order order)
    {
        return String.format("Gold Loyalty %%50 off: $%.2f", order.orderCost()*0.5);
    }

    public String silverLoyalty(order order)
    {
        return String.format("Silver Loyalty %%20 off: $%.2f", order.orderCost()*0.8);
    }

    public String bronzeLoyalty(order order)
    {
        return String.format("Bronze Loyalty %%10 off: $%.2f", order.orderCost()*0.9);
    }
}
