package src;

import java.util.Scanner;

public class ExifElse1 {

	public static void main(St1ring[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade");

		idade = sc.nextInt();

		if (idade > 59) {

			System.out.println(" Ele é um idoso");

		} else if (idade >= 18 && idade < 60) {
			System.out.println("é adulto");

		} else {

			System.out.println(" É criança");
		}
	}
}
