import java.util.ArrayList;

public class CafeUtil {
    // getSreakGoal() Method.
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i=1; i<numWeeks+1; i++) {
            sum += i;
        }
        return sum;
    }

    // getOrderTotal(double[] prices) Method.
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i=0; i<prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    // displayMenu(ArrayList<String> menuItems)
    public void displayMenu (ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    // addCustomer(ArrayList<String> customers)
    public void addCustomer(ArrayList<String> customers) {
        int numPeople = customers.size();
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.print("Hello, " + userName + "! ");
        System.out.println("There are " + numPeople + " people in front of you");
        customers.add(userName); // to add an item to an ArrayList

        System.out.println("------------- Customers List-------------");
        for (int i = 0; i < customers.size(); i++) {
            String customer = customers.get(i);
            System.out.println(i + " " + customer);
        }
    }
}