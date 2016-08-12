package pig_latin;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PigLatinTranslator {
	static String phraseToBeTranslated = null;

	// Constructor
	public PigLatinTranslator(String phraseToBeTranslated) {
		this.phraseToBeTranslated = phraseToBeTranslated;
	}

	// method to be passed a phrase, split into individual words then passed to
	// translator method
	public void translator() {
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		String phrase = phraseToBeTranslated;
		String[] words = phrase.split("\\s"); // split phrase entered into array
												// of individual words
		/*
		 * for (int i = 0; i < words.length; i++) { words[i] =
		 * removeInvalidChars(words[i]); }
		 */
		for (int i = 0; i < words.length; i++) { // translate each individual
													// word
			System.out.print(translateWord(words[i]) + " ");
		}

	}

	// accept word, translate to Pig Latin and return translated word
	public String translateWord(String wordToBeTranslated) {
		String word = wordToBeTranslated;
		String pigLatin = null;
		int length = word.length();
		StringBuilder sb = new StringBuilder(word);
		boolean alterWord = true;

		if (isVowel(sb.charAt(0))) {// if the first character is a vowel, add
									// -yay to end and store in variable
									// pigLatin
			pigLatin = (sb.toString() + "-yay");
		} else {// if the first character is not a vowel (its a consonant)
			for (int i = 0; i < length; i++) {// go through word, find first
												// vowel
				char firstLetter = sb.charAt(i);// store first letter in char
												// variable
				if (isVowel(firstLetter)) {// if we reach a vowel, we're
											// finished
					pigLatin = (sb.toString() + "ay");// add ay and store in
														// pigLatin
					break;
				} else {
					if (alterWord) {
						sb.append('-');// add the dash only once
						alterWord = false;
					}
					sb.append(firstLetter);// add first letter to the end
					sb.deleteCharAt(i);// delete first character
					i--;// reset iterations now that the first character in
						// StringBuilder was removed
				}
			}
		}
		return pigLatin; // return translated word
	}

	// method to check if a character is a vowel
	public static boolean isVowel(char first) {
		boolean isVowel = false;// default value is false
		char letter = Character.toLowerCase(first);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		for (int i = 0; i < vowels.length; i++) {
			if (vowels[i] == letter) {// if the letter matches any of the
										// characters stored in vowels array,
										// set isVowel to true;
				isVowel = true;
			}
		}
		return isVowel;
	}

}
