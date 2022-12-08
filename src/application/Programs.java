package application;

import java.util.Locale;
import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo: ");
		char sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas:");
		int c = sc.nextInt();
		System.out.print("Quantidade de refrigerantes:");
		int r = sc.nextInt();
		System.out.print("Quantidade de espetinhos:");
		int e = sc.nextInt();
		System.out.println();

		System.out.println("RELATÓRIO:");
		double consumo = (c * 5.0) + (r * 3.0) + (e * 7.0);
		System.out.println("Consumo = R$ " + String.format("%.2f", consumo));
		double couvert;
		if (consumo < 30.0) {
			couvert = 4.0;
			System.out.println("Couvert = R$ " + String.format("%.2f", couvert));
		} else {
			couvert = 0.0;
			System.out.println("Isento de Couvert");
		}
		double ingresso;
		if (sexo == 'M') {
			ingresso = 10.00;
		} else {
			ingresso = 8.00;
		}
		System.out.println("Ingresso = R$ " + String.format("%.2f", ingresso));
		System.out.println();

		double total = consumo + couvert + ingresso;
		System.out.println("Valor a pagar R$ " + String.format("%.2f", total));
		sc.close();
	}
}
