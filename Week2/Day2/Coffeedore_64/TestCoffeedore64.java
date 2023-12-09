public class TestCoffeedore64 {
    public static void main (String[] args) {
        CoffeeKiosk coffeeKiosk1 = new CoffeeKiosk();

        coffeeKiosk1.addMenuItem("banana", 2.0);
        coffeeKiosk1.addMenuItem("coffee", 1.5);
        coffeeKiosk1.addMenuItem("latte", 4.5);
        coffeeKiosk1.addMenuItem("cappuccino", 3.0);
        coffeeKiosk1.addMenuItem("muffin", 4.0);

        coffeeKiosk1.newOrder();
}
}