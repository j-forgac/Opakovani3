import java.util.HashMap;
import java.util.Scanner;

public class charMap {
	public static void main(String[] args){
		HashMap <Character, Integer> characterAmountMap = new HashMap<>();
		Scanner mySc = new Scanner(System.in);

		System.out.println("zadejte text");

		for (char ch = 'a';ch <= 'z'; ch++) {
			characterAmountMap.put(ch,0);
		}

		String word = mySc.nextLine();

		for(int i = 0; i < word.length(); i++){
			characterAmountMap.put(word.charAt(i), characterAmountMap.get(word.charAt(i)) + 1);
		}

		System.out.println(characterAmountMap);
	}
}
