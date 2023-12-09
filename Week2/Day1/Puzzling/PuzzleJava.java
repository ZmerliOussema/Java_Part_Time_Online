import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls () {
        ArrayList<Integer> myArray = new ArrayList<Integer> ();
        for (int i = 0; i < 10; i++){
            Random rand = new Random ();
            int low = 1;
            int high = 20;
            int randInt = rand.nextInt(high - low) + low;
            myArray.add (randInt);
        }
        return myArray;
    }

    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random rand = new Random ();
        int randIdx = rand.nextInt(26);
        return alphabet[randIdx];
    }

    public String generatePassword () {
        String myString = "";
        for(int i=0; i<8; i++) {
            myString += getRandomLetter();
        }
        return myString;
    }

    public ArrayList<String> getNewPasswordSet (int arg) {
        ArrayList<String> myArray = new ArrayList<String> ();
        // myArray = new String [arg];
        for (int i = 0; i < arg; i++) {
            String password = generatePassword();
            // myArray [i] = password;
            myArray.add(password);
        }
        return myArray;
    }
}