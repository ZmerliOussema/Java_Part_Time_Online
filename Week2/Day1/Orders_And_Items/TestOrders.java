import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        // Set the price and the name
        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "cappuccino";

        item1.price = 1.5;
        item2.price = 2.0;
        item3.price = 2.5;
        item4.price = 4.0;
        
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // Set the order's name
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";
    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // System.out.println(order1); // Order@5ca881b5
        // System.out.println(order1.total); //  0.0

        order2.items.add(item1);
        order2.total += 1;

        // System.out.println(order2.items);
        // System.out.println(order2.total);

        order3.items.add(item4);
        // System.out.println(order3.items.get(0));

        order4.items.add(item2);
        // System.out.println(order3.items.get(0).name);
        
        order1.ready = true;
        System.out.println(order1.ready);

        order4.items.add(item2);
        order4.items.add(item2);
        System.out.println(order4.items);

        order2.ready = true;
        System.out.println(order2.ready);
    }
}
