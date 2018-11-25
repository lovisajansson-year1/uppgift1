package uppgift1;
import java.util.Scanner;
public class Uppgift1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner uppgift1a = new Scanner(System.in);
		
		String ord ;
		String ord2 ;
		String nyttOrd;
		
		System.out.print("skriv ett ord:");
		ord = uppgift1a.nextLine();
		
		System.out.print("skriv ett till ord:");
		ord2 = uppgift1a.nextLine();
		
		nyttOrd = ord + " " + ord2;
		System.out.println(nyttOrd);
		System.out.println(nyttOrd.length());
		
		uppgift1a.close();
		
	}

}
