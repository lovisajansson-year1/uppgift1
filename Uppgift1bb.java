package uppgift1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Uppgift1bb {

	public static void main(String[] args) {
		// beräkna persons lön, skriva ut denna med decimaltecken samt ändra namn till stora bokstäver
		Scanner stdIn = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		String name;
		double hourlySalary;
		double hours;
		
		System.out.print("ange ditt namn:");
		name = stdIn.nextLine().toUpperCase();//gör t stora bokstäver
		
		System.out.print("ange din timlön:");
		hourlySalary = stdIn.nextDouble();
		
		System.out.print("ange antalet arbetade timmar förra månaden:");
		hours = stdIn.nextDouble();
		
		double salary = hourlySalary*hours;
		String newSalary = dec.format(salary); // gör om double salary till en string med pattern 0,00
		System.out.print(name + " "+ "du tjänade " + newSalary + " kr förra månaden");
		
		stdIn.close();
		
	}

}
