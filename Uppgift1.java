package uppgift1;
import java.util.Scanner;
public class Uppgift1 {

	public static void main(String[] args) {
		// läs in 2 tal, konkatenera dessa med blanksteg och läs in strängens längd
		Scanner uppgift1a = new Scanner(System.in);
		
		String word ;
		String secondWord ;
		String newOrd;
		
		System.out.print("skriv ett ord:");
		word = uppgift1a.nextLine();
		
		System.out.print("skriv ett till ord:");
		secondWord = uppgift1a.nextLine();
		
		newOrd = word + " " + secondWord;
		System.out.println(newOrd);
		System.out.println(newOrd.length());
		
		uppgift1a.close();
		
	}

}
