public class Test {
    public static void main (String[] args) {
        
        // Create 2 orders for unspecified guests (without specifying a name).
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Mike");
        Order order4 = new Order("Chris");
        Order order5 = new Order("Kylian");

        // Add 2 items to each of the orders.
        Item item1 = new Item ("drip coffe", 1.5);
        Item item2 = new Item ("cappuccino", 2.5);
        Item item3 = new Item ("latte", 2.0);
        Item item4 = new Item ("mocha", 3.5);

        order1.addItem(item1);
        order1.addItem(item2);

        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item3);

        // Test the result using the display method.
        order3.display();

        // Test getStatusMessage
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        // Test getOrderTotal Method.
        System.out.println(order1.getOrderTotal());

        // Test display Method.
        order3.display();
    }
}