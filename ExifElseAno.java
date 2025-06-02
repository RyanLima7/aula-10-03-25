package src;

import java.util.Scanner;

public class ExifElseAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário para digitar o ano
		System.out.print("Digite um ano: ");
		int ano = scanner.nextInt();

		// Verifica se o ano é bissexto
		if (ano % 4 == 0) {
			if (ano % 100 != 0 || ano % 400 == 0) {
				System.out.println(ano + " é um ano bissexto.");
			} else {
				System.out.println(ano + " não é um ano bissexto.");
			}
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

		scanner.close();
	}

}
