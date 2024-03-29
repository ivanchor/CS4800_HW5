import org.example.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class testCases {

    food burger = new burger();
    food fries = new fries();
    food hotdog = new hotdog();
    order order = new order();
    loyalty loyalty = new loyalty();
    @Test
    public void testgetPriceBurger()
    {
        double expected = 7;
        double actual = burger.getPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void testgetPriceFries()
    {
        double expected = 2;
        double actual = fries.getPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void testgetPriceHotdog()
    {
        double expected = 5;
        double actual = hotdog.getPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void testfoodWithOnion()
    {
        double expected = 7.5;
        burger = new foodWithOnion(burger);
        double actual = burger.getPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void testfoodWithSauce()
    {
        double expected = 9.5;
        burger = new foodWithSauce(burger);
        double actual = burger.getPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void testorderCost()
    {
        double expected = 14.00;
        order.addOrder(burger);
        order.addOrder(fries);
        order.addOrder(hotdog);
        double actual = order.orderCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testgoldLoyalty()
    {
        String expected = "Gold Loyalty %50 off: $7.00";

        order.addOrder(burger);
        order.addOrder(fries);
        order.addOrder(hotdog);
        String actual = loyalty.goldLoyalty(order);
        assertEquals(expected,actual);
    }

    @Test
    public void testsilverLoyalty()
    {
        String expected = "Silver Loyalty %20 off: $11.20";

        order.addOrder(burger);
        order.addOrder(fries);
        order.addOrder(hotdog);
        String actual = loyalty.silverLoyalty(order);
        assertEquals(expected,actual);
    }

    @Test
    public void testbronzeLoyalty()
    {
        String expected = "Bronze Loyalty %10 off: $12.60";

        order.addOrder(burger);
        order.addOrder(fries);
        order.addOrder(hotdog);
        String actual = loyalty.bronzeLoyalty(order);
        assertEquals(expected,actual);
    }
}
