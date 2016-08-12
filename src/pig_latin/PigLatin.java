package pig_latin;

import java.util.Scanner;
import java.lang.StringBuilder;

public class PigLatin {

	public static void main(String[] args) {

		String userInput = getUserInput(); // call getUserInput method and store
											// in new String variable userInput

		// Create new Pig Latin translator object and pass in phrase to be
		// translated
		PigLatinTranslator plt = new PigLatinTranslator(userInput);

		plt.translator(); // call translator method of plt
	}

	// method to prompt user for input from keyboard and store in userInput
	// variable
	public static String getUserInput() {
		String userInput = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your phrase to be translated to Pig Latin:");
		userInput = sc.nextLine(); // store keyboard input in userInput
		sc.close();
		return userInput;
	}
}
