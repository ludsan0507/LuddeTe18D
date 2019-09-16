package hehehe;

import java.util.Scanner;

public class Liverpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // behövs om man vill ha input

		System.out.println("Vad heter du?: ");

		String namn = input.nextLine();

		System.out.println("Hur gammal e du?: ");

		String alder = input.nextLine();

		System.out.println("Vad är din adress?: ");

		String adress = input.nextLine();

		System.out.println("Vad är ditt postnummer : ");

		String postnr = input.nextLine();

		System.out.println("Vilken stad bor du i?: ");
		String stad = input.nextLine();

		System.out.println("Vad är ditt telefonnummer? : ");
		String telefon = input.nextLine();

		System.out.println("Information:");

		System.out.println("Namn:\t\t" + namn);

		System.out.println("Ålder:\t\t" + alder);
		System.out.println("Adress:\t\t" + adress);
		System.out.println("Telefon:\t\t" + telefon);
		System.out.println("Postnr: \t\t" + postnr);

		System.out.println("Stad: \t\t" + stad);

	}

}
