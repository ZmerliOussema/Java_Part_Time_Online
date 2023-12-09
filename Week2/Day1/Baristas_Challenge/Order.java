import java.util.ArrayList;

public class Order {
    
    // MEMBER VARIABLES
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // CONSTRUCTOR
    public Order () {
        this.name = "Guests";
        this.items = new ArrayList<Item> ();
    }

    // OVERLOADED CONSTRUCTOR
    public Order (String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // ORDER METHODS
    public void addItem (Item item) {
        this.items.add(item);
    }

    public String getStatusMessage () {
        if (this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal () {
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    public void display () {
        System.out.println("Customer Name: " + this.name );
        for (int i=0; i < this.items.size(); i++) {
            System.out.println (this.items.get(i).getName() + "-" + "$" + this.items.get(i).getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());

    }
    // GETTERS & SETTERS
    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public boolean getReady () {
        return this.ready;
    }

    public void setReady (boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems () {
        return this.items;
    }

    public void setItems (ArrayList<Item> items) {
        this.items = items;
    }
}