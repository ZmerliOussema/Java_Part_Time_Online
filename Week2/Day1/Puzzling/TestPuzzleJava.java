import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		
        // getTenRolls Method Test
        // ArrayList<Integer> randomRolls = generator.getTenRolls();
		// System.out.println(randomRolls);
		
        // getRandomLetter Method Test
        // char randomLetter = generator.getRandomLetter();
        // System.out.println(randomLetter);

        // generatePassword Method Test
        // String password = generator.generatePassword();
        // System.out.println(password);

        // getNewPasswordSet Method Test.
        ArrayList<String> newPassword = generator.getNewPasswordSet(5);
        System.out.println(newPassword);
	}
}
