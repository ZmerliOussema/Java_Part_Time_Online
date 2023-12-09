import java.util.ArrayList;

public class CoffeeKiosk {

    // Member variables
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk () {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // Methods
    public void addMenuItem (String name, double price) {
        Item newItem = new Item (name, price);
        this.menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
    }

    public void displayMenu () {
        for (int i=0; i<this.menu.size(); i++) {
            System.out.println (menu.get(i).getIndex() + " " + menu.get(i).getName() + " --" + " $" + menu.get(i).getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        ArrayList<Item> itemArray = new ArrayList<Item>();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Use try-catch !!!
            int intItemNumber = Integer.parseInt(itemNumber);
            // Get the item object from the menu, and add the item to the order
            Item itemObject = this.menu.get(intItemNumber);
            itemArray.add(itemObject); // Soltion; Use add addItem Method instead !!!
            order.setItems(itemArray);
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order.display();
        
    }


    // Getters & Setters
    public ArrayList<Item> getMenu () {
        return this.menu;
    }

    public void setMenu (ArrayList<Item> menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrder () {
        return this.orders;
    }

    public void setOrders (ArrayList<Order> orders) {
        this.orders = orders;
    }
}