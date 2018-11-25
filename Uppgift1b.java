package uppgift1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Uppgift1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		String namn;
		double timlön;
		double timmar;
		double lön;
		
		System.out.print("ange ditt namn:");
		namn = stdIn.nextLine();
		
		System.out.print("ange din timlön:");
		timlön = stdIn.nextDouble();
		
		System.out.print("ange antalet arbetade timmar förra månaden:");
		timmar = stdIn.nextDouble();
		
		lön = timlön*timmar;
	
		System.out.print(namn.toUpperCase() +" "+ "du tjänade " + dec.format(lön) + " kr förra månaden");
		
		
		
	}

}
