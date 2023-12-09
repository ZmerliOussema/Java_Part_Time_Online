import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String message = String.format("Hello %s. Lovely to see you.", name);
        return message;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently, " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int idxAlexis = conversation.indexOf("Alexis");
        int idxAlfred = conversation.indexOf("Alfred");
        if (idxAlexis > -1) {
            return "Right away, sir. She certainly isn't sophicated enough for that.";
        }
        if (idxAlfred > -1) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreetingWithDate(String name) {
        // YOUR CODE HERE
        Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    // String strDate= formatter.format(date);
        String strDate = "02/11/2023 14:00";
        String hours = strDate.substring(11, 13);
        if (Integer.parseInt(hours) > 5 && Integer.parseInt(hours) < 12) {
            return "Good morning, " + name + "." + " Lovely to see you.";
        }
        if (Integer.parseInt(hours) > 12 && Integer.parseInt(hours) < 18) {
            return "Good afternoon, " + name + "." + " Lovely to see you.";
        }
        return "Good evening, " + name + "." + " Lovely to see you.";
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String listening(String str) {
        if (str.length() > 20) {
            return "Stop! Stop! You're talking too much !!!!";
        }
        return "";
    }
}

