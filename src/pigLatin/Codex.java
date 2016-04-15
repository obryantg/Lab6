package pigLatin;
import java.util.*;
public class Codex {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your dumb words to encode: ");
		String words = sc.nextLine();
		
		String[] wordArr = words.split(" ");
		for (int j=0; j< wordArr.length;j++){
		//String piglatin = gettranslate(words);
			wordArr[j] = gettranslate(wordArr[j]);
		//this method arranges the structure for the word(s).
		//System.out.print(piglatin);
		System.out.print(wordArr[j]);}
		sc.close();
		} 
	
	public static String gettranslate(String mixer){
		
		int seqNum = getVowel(mixer);
		//getVowel method finds the placement for the first vowel
		//in the word(s).
		String piggy;
			if (seqNum==0){
				piggy = mixer + "way ";
			} else if (seqNum == -1){
				piggy = mixer + "ay ";
			} else {
				String front = mixer.substring(seqNum);
				String middle = mixer.substring(0, seqNum);
				piggy = front + middle + "ay ";
			
			} return piggy;
	}
	
	public static int getVowel(String words){
		for (int fv = 0; fv < words.length(); fv++){
			if (words.charAt(fv) == 'a' || words.charAt(fv) == 'e'
		            || words.charAt(fv) == 'i' || words.charAt(fv) == 'o'
		            || words.charAt(fv) == 'u') {
		        return fv;
		    } 
			} return -1;
		}
	}