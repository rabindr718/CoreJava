package HK_TypesCALENDAR;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double payment=input.nextDouble();
		String UniteStatesOfAmerica=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String China=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String UnitedKingdom=NumberFormat.getCurrencyInstance(Locale.UK).format(payment);
		String India=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
		System.out.println("This is USA : "+UniteStatesOfAmerica);
		System.out.println("This is Chinese : "+China);
		System.out.println("This is UK : "+UnitedKingdom);
		System.out.println("This is India : "+India);
	}

}
