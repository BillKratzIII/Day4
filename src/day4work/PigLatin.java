package day4work;

import java.util.Scanner;
import java.lang.StringBuilder;

public class PigLatin {

	public static void main(String[] args) {
		String userInput = getUserInput();
		translator(userInput);
	}
	
	public static String getUserInput(){
		String userInput = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your phrase to be translated to Pig Latin:");
		userInput = sc.nextLine();
		sc.close();
		return userInput;
	}

	public static void translator(String phraseToBeTranslated){
		String phrase = phraseToBeTranslated;
		String[] words = phrase.split("\\s");
		
		for(int i=0; i<words.length; i++){
			System.out.println(words[i]);
		}
		
		for(int i=0; i<words.length; i++){
			System.out.print(translateWord(words[i]) + " ");
		}
		
	}
	
	public static String translateWord(String wordToBeTranslated){
		String word = wordToBeTranslated;
		String pigLatin = null;
		int length = word.length();
		char firstLetter;
		char secondLetter;
		char[] tempArray = new char[length+4];
		
		StringBuilder sb = new StringBuilder(word);
		firstLetter = sb.charAt(0);
		if (word.length() == 1){
			tempArray[0] = firstLetter;
			tempArray[length] = '-';
			tempArray[length+1] = 'y';
			tempArray[length+2] = 'a';
			tempArray[length+3] = 'y';
			pigLatin = new String(tempArray);
		}else{
			secondLetter = sb.charAt(1);
		
			if (isVowel(firstLetter) == false){
				if(isVowel(secondLetter) == true){
					sb.deleteCharAt(0);//delete first character in string builder
					//transfer remaining characters to a char array
					for(int i=0; i<length-1; i++){
						tempArray[i] = sb.charAt(i);
					}
					tempArray[length-1] = '-';
					tempArray[length] = firstLetter;
					tempArray[length+1] = 'a';
					tempArray[length+2] = 'y';
					pigLatin = new String(tempArray);
				}else{
					pigLatin = constCluster(word);
				}
		
			}else {
				for (int i=0; i<length; i++){
					tempArray[i] = sb.charAt(i);
				}
				tempArray[length] = '-';
				tempArray[length+1] = 'y';
				tempArray[length+2] = 'a';
				tempArray[length+3] = 'y';
				pigLatin = new String(tempArray);
			}
		}
		return pigLatin;
	}
	
	public static boolean isVowel(char first){
		boolean isVowel = false;
		char letter = Character.toLowerCase(first);
		char[] vowels = {'a','e','i','o','u'};
		for (int i=0; i<vowels.length; i++){
			if(vowels[i]==letter){
				isVowel = true;
			}
		}
		return isVowel;
	}
	
	public static String constCluster(String wordToBeTranslated){
		int length = wordToBeTranslated.length();
		String word = wordToBeTranslated;
		String pigLatin = null;
		StringBuilder sb = new StringBuilder(word);
		String beginning = Character.toString(sb.charAt(0));
		String ending = null;
		int counter = 1;
		
		for (int i=1; i<length; i++){
			if(isVowel(sb.charAt(i))){
				ending = Character.toString(sb.charAt(i));
				break;
			}else{
				beginning = beginning + Character.toString(sb.charAt(i));
				counter++;
			}
		}
		
		for (int i=counter+1; i<length; i++){
			ending = ending + Character.toString(sb.charAt(i));
		}
		
		//Construct pigLatin
		//String beginning = new String(firstPart);
		pigLatin = (ending + '-' + beginning + "ay");
	
		
		return pigLatin;
	}
}
